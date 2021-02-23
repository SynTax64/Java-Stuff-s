package PasswordManager.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Encryptor {

	private int offset;
	private EncryptOptions eo;

	public Encryptor(int shift, EncryptOptions eopt) {
		this.offset = shift;
		this.eo = eopt;
	}

	public final String name() {
		return eo.name();
	}

	public final int ordinal() {
		return eo.ordinal();
	}

	public String toString() {
		return eo.toString();
	}

	public final Class<EncryptOptions> getDeclaringClass() {
		return eo.getDeclaringClass();
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public EncryptOptions getEo() {
		return eo;
	}

	public void setEo(EncryptOptions eo) {
		this.eo = eo;
	}

	// when encrypting, use the password file, write to the data file bin with
	// shift, then delete the password file
	// when decrypting, use the bin file, decrypt and write to the password file as
	// a new text file

	/**
	 * Encrypt or decrypt the file.
	 * 
	 * @param in  the inputstream to read from
	 * @param out the outputstream to write to
	 * @throws IOException if either stream is invalid.
	 */
	public void encryptDecryptStream(InputStream in, OutputStream out) throws IOException {
		int next;
		while ((next = in.read()) != -1) {
			byte nextByteValue = (byte) next;
			byte output = (byte) (nextByteValue + offset);
			out.write(output);
		}
	}
}
