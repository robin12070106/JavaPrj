package oop.inherit.ui;

import java.awt.Graphics;
import java.awt.Panel;

public class NewlecPanel extends Panel {

	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.drawOval(10, 10, 200, 200);
	}
	
}
