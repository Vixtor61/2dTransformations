import java.awt.*;

import javax.swing.*;

public class DrawPanel extends JPanel {
	int stroke_size = 2;
	int sqrX = 300;
	int sqrY = 300;
	int sqrSize =20;
	Square sqr = new Square(sqrY, sqrX, sqrSize);

	DrawPanel() {
		
		this.setPreferredSize(new Dimension(700, 700));
		this.setBackground(Color.WHITE);
	//	this.setBackground(Color.WHITE);

	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		Graphics2D g2D = (Graphics2D) g;

		// g2D.drawImage(image, 0, 0, null);
		
		g2D.setPaint(Color.blue);

		g2D.setStroke(new BasicStroke(stroke_size));

		drawSquare(g2D);

	}

	public void increaseStroke() {
		this.stroke_size += 10;
	}
	public void resetSqr() {
		this.sqr = new Square(sqrY, sqrX, sqrSize);
		this.repaint();
	}

	public void drawSquare(Graphics2D g2D) {
		for (int i = 0; i < 4; i++) {
			g2D.drawLine((int)sqr.arists[i].p1.x, (int)sqr.arists[i].p1.y, (int)sqr.arists[i].p2.x, (int)sqr.arists[i].p2.y);
		}

	}

}