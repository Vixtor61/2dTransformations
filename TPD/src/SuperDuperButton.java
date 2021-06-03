import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

public class SuperDuperButton extends JButton {
	public SuperDuperButton(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		this.setBackground(Color.pink);
	}
	
	
}
