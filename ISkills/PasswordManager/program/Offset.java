package PasswordManager.program;

public class Offset implements IOffset {

	private int offset;
	public Offset(int shift) {
		super();
		this.offset = shift;
	}

	@Override
	public int getOffset() {
		return offset;
	}

	@Override
	public void setOffset(int offset) {
		this.offset = offset;
	}

}