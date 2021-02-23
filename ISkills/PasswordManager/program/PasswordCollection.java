package PasswordManager.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import PasswordManager.utilities.DataFileManipulator;

public class PasswordCollection extends Offset {
	private HashMap<String, String> hm;
	private int anything;

	/**
	 * Construct a PasswordCollection object.
	 * 
	 * @param shift the encryption offset supplied by the user.
	 */
	public PasswordCollection(int shift) {
		super(shift);
		hm = null;
	}

	/**
	 * Load the passwords from the encrypted file.
	 */
	private void loadPasswords() {
		// Open the data file and get the password k/v data
		DataFileManipulator dfm = new DataFileManipulator(super.getOffset());
		hm = (HashMap<String, String>) dfm.ReadData();
	}

	/**
	 * Get the collection of password k/v data in a list of Pair.
	 * 
	 * @param forceRead force the data to be re-read from the encrypted file.
	 * @return the current map stored in memory for the password collection
	 */
	public ArrayList<Pair> getPasswords(boolean forceRead) {
		if (forceRead || hm == null || hm.size() == 0) {
			loadPasswords();
		}

		ArrayList<Pair> pwds = new ArrayList<Pair>();
		Iterator<Map.Entry<String, String>> entries = hm.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<String, String> entry = entries.next();
			String key = entry.getKey();
			String value = entry.getValue();

			Pair<String, String> p = new Pair<String, String>(key, value);
			pwds.add(p);
		}
		return pwds;
	}

	/**
	 * Allow changes to be saved to file.
	 * 
	 * @param pwds the current state of pwds.
	 */
	public void savePasswords(ArrayList<Pair> pwds) {
		HashMap<String, String> hm = new HashMap<String, String>();
		for (Pair p : pwds) {
			hm.put(p.getFirstObject().toString(), p.getSecondObject().toString());
		}
		DataFileManipulator dfm = new DataFileManipulator(super.getOffset());
		dfm.WriteData(hm);
	}

	public int getAnything() {
		return anything;
	}

	public void setAnything(int anything) {
		this.anything = anything;
	}
}
