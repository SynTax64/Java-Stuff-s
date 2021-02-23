package PasswordManager.gui;

import java.util.ArrayList;

import PasswordManager.program.Pair;

public class PasswordDataEditorData {
	private ArrayList<Pair> pwds;
	private int currentIndex;

	public PasswordDataEditorData(ArrayList<Pair> pwds, int currentIndex) {
		this.pwds = pwds;
		this.currentIndex = currentIndex;
	}

	public ArrayList<Pair> getPwds() {
		return pwds;
	}

	public void setPwds(ArrayList<Pair> pwds) {
		this.pwds = pwds;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}
}