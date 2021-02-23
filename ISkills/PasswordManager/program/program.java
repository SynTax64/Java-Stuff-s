package PasswordManager.program;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import PasswordManager.gui.PasswordManager;

public class program {

	private static final int YLOCATION = 25;
	private static final int XLOCATION = 150;
	public static final int WIDTH = 650;
	public static final int HEIGHT = 500;
	public static final String dataFilePath = Messages.getString("program.0"); //$NON-NLS-1$
	public static final String passwordFilePath = Messages.getString("program.1"); //$NON-NLS-1$
	public static final int OFFSET = 32;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				File f1 = null;
				File f2 = null;
				try {
					f1 = new File(dataFilePath);
					f2 = new File(passwordFilePath);

					if (!f1.exists()) {
						f1.createNewFile();
					}
					if (!f2.exists()) {
						f2.createNewFile();
					}

					try {
						PasswordManager pm = new PasswordManager();
						pm.setLocation(XLOCATION, YLOCATION);
						pm.setSize(WIDTH + 20, HEIGHT + 60);
						pm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 600, 600);
						pm.getContentPane().add(panel);
						pm.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
