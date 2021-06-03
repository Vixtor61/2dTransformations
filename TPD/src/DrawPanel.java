import java.awt.*;


import javax.swing.*;



public class DrawPanel extends JPanel{
	int stroke_size =2;
	Square sqr = new Square(200, 200, 5);
 

 DrawPanel(){

  

  this.setPreferredSize(new Dimension(700,700));

 }

 

 public void paint(Graphics g) {

	 super.paint(g);

  Graphics2D g2D = (Graphics2D) g;

  

  //g2D.drawImage(image, 0, 0, null);

  

  g2D.setPaint(Color.blue);

  g2D.setStroke(new BasicStroke(stroke_size));
  drawSquare(g2D);

  


 }
 public void increaseStroke() {
	this.stroke_size+=10;
}
 public void drawSquare(Graphics2D g2D) {
	 for (int i = 0; i < 4; i++) {
		  g2D.drawLine(sqr.arists[i].p1.x, sqr.arists[i].p1.y, sqr.arists[i].p2.x, sqr.arists[i].p2.y);
	}
	 
 }

}