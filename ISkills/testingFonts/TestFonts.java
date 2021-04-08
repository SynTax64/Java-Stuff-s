package testingFonts;

import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class TestFonts {

	public static void main(String[] args) {
		String s = "Dies ist ein vollständiger Satz.";
		Font font = new Font("Verdana", Font.BOLD, 16);
		FontRenderContext con = new FontRenderContext(font.getTransform(), false, false);
		TextLayout layout = new TextLayout(s, font, con);
		Rectangle2D rect = layout.getBounds();
		System.out.println("x: " + rect.getX());
		System.out.println("y: " + rect.getY());
		System.out.println("Breite: " + rect.getWidth());
		System.out.println("H\u00F6he: " + rect.getHeight());
	}
}