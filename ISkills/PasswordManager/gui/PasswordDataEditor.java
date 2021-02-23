
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import PasswordManager.program.Pair;
import PasswordManager.program.PasswordCollection;
import PasswordManager.program.program;

public class PasswordDataEditor extends JInternalFrame {
	public static void DisplayItemIndirect(PasswordDataEditor passwordDataEditor) {
		passwordDataEditor.DisplayItem();
	}

	private PasswordCollection pc = null;
	private JTextField txtValue;
	private JTextField txtKey;
	PasswordDataEditorData data = new PasswordDataEditorData(null, 0);
	private JButton btnSave;
	private JButton btnNew;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnLast;
	private JButton btnFirst;
	private JButton btnPrev;
	private JButton btnNext;
	private JButton btnCancel;
	private JButton btnSaveChangesTo;

	/**
	 * Create the frame.
	 */
	public PasswordDataEditor() {
		getContentPane().setLayout(null);

		try {
			setPc(new PasswordCollection(program.OFFSET));
			data.setPwds(getPc().getPasswords(true));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (data.getPwds() == null)
			data.setPwds(new ArrayList<Pair>());

		btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (data.getCurrentIndex() + 1 >= data.getPwds().size()) {
					data.setCurrentIndex(0);
				} else {
					data.setCurrentIndex(data.getCurrentIndex() + 1);
				}
				DisplayItem(new DisplayItemParameter());
			}
		});
		btnNext.setBounds(235, 85, 73, 23);
		getContentPane().add(btnNext);

		txtValue = new JTextField();
		txtValue.setEditable(false);
		txtValue.setBounds(231, 43, 193, 20);
		getContentPane().add(txtValue);
		txtValue.setColumns(10);

		txtKey = new JTextField();
		txtKey.setEditable(false);
		txtKey.setColumns(10);
		txtKey.setBounds(14, 43, 193, 20);
		getContentPane().add(txtKey);

		btnPrev = new JButton("Prev");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (data.getCurrentIndex() - 1 < 0) {
					data.setCurrentIndex(data.getPwds().size() - 1);
				} else {
					data.setCurrentIndex(data.getCurrentIndex() - 1);
				}
				DisplayItem(new DisplayItemParameter());
			}
		});

		btnPrev.setBounds(152, 85, 73, 23);
		getContentPane().add(btnPrev);

		btnFirst = new JButton("First");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				data.setCurrentIndex(0);
				DisplayItem(new DisplayItemParameter());
			}
		});
		btnFirst.setBounds(67, 85, 73, 23);
		getContentPane().add(btnFirst);

		btnLast = new JButton("Last");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data.setCurrentIndex(data.getPwds().size() - 1);
				DisplayItem(new DisplayItemParameter());
			}
		});
		btnLast.setBounds(318, 85, 73, 23);
		getContentPane().add(btnLast);

		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data.getPwds().remove(data.getCurrentIndex());
				if (data.getCurrentIndex() - 1 < 0) {
					data.setCurrentIndex(0);
				} else {
					data.setCurrentIndex(data.getCurrentIndex() - 1);
				}
				DisplayItem(new DisplayItemParameter());
			}
		});
		btnDelete.setBounds(14, 119, 97, 23);
		getContentPane().add(btnDelete);

		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enableEdit(1, true);
			}
		});
		btnUpdate.setBounds(14, 153, 97, 23);
		getContentPane().add(btnUpdate);

		btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data.setCurrentIndex(-999);
				enableEdit(0, true);
			}
		});
		btnNew.setBounds(14, 187, 97, 23);
		getContentPane().add(btnNew);

		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// add the item
				Pair p = new Pair(txtKey.getText(), txtValue.getText());
				if (data.getCurrentIndex() == -999) {
					data.getPwds().add(p);
					data.setCurrentIndex(data.getPwds().size() - 1);
					JOptionPane.showMessageDialog(null, "Password record was successfully added!");
				} else {
					data.getPwds().set(data.getCurrentIndex(), p);
					JOptionPane.showMessageDialog(null, "Password record was successfully updated!");
				}
				enableEdit(1, false);
				DisplayItem(new DisplayItemParameter());
			}
		});

		btnSave.setBounds(138, 153, 97, 23);
		getContentPane().add(btnSave);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enableEdit(1, false);
				if (data.getCurrentIndex() < 0)
					data.setCurrentIndex(0);
				DisplayItem(new DisplayItemParameter());
			}
		});
		btnCancel.setBounds(257, 153, 97, 23);
		getContentPane().add(btnCancel);

		btnSaveChangesTo = new JButton("Save Changes to File");
		btnSaveChangesTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPc().savePasswords(data.getPwds());
				JOptionPane.showMessageDialog(null, "Password file successfully updated!");
				enableEdit(1, false);
			}
		});
		btnSaveChangesTo.setBounds(138, 216, 216, 23);
		getContentPane().add(btnSaveChangesTo);

		setBackground(Color.WHITE);
		setClosable(true);
		setMaximizable(true);
		setResizable(true);

		data.setCurrentIndex(0);
		DisplayItem(new DisplayItemParameter());
		enableEdit(1, false);

		// pack and show:
		pack();
		setVisible(true);
	}

	/**
	 * @deprecated Use {@link #DisplayItem(DisplayItemParameter)} instead
	 */
	private void DisplayItem() {
		DisplayItem(new DisplayItemParameter());
	}

	private void DisplayItem(DisplayItemParameter dip) {
		try {
			Pair p = data.getPwds().get(data.getCurrentIndex());
			txtKey.setText(p.getFirstObject().toString());
			txtValue.setText(p.getSecondObject().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void enableEdit(int option, boolean enabled) {
		if (option == 0) {
			// add new
			txtKey.setText("");
			txtValue.setText("");
		}

		// disable all the buttons/enable the text edit
		txtKey.setEditable(enabled);
		txtValue.setEditable(enabled);

		btnFirst.setEnabled(!enabled);
		btnNext.setEnabled(!enabled);
		btnPrev.setEnabled(!enabled);
		btnLast.setEnabled(!enabled);

		btnNew.setEnabled(!enabled);
		btnUpdate.setEnabled(!enabled);
		btnDelete.setEnabled(!enabled);

		btnSave.setEnabled(enabled);
		btnCancel.setEnabled(enabled);
	}

	PasswordCollection getPc() {
		return pc;
	}

	void setPc(PasswordCollection pc) {
		this.pc = pc;
	}
}
