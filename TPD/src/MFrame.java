import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MFrame extends JFrame {


	OpLevel transLevel;
	OpLevel scaleLevel;
	OpLevel rotationLevel;

	DrawPanel drawPanel;
	JPanel controlPanel;

	MFrame() {
		double[] transLevels= {-2,-1,0,1,2};
		transLevel= new OpLevel(Operation.TRANSLATE,transLevels);
		double[] scaleLevels = {0.25,0.5,1,1.25,1.5};
		scaleLevel = new OpLevel(Operation.SCALE,scaleLevels);
		double[] rotatelevels = {-0.0872665,-0.0174533,0.020,0.0174533,0.0872665};
		
		rotationLevel = new OpLevel(Operation.ROTATE,rotatelevels);
		
		drawPanel = new DrawPanel();

		controlPanel = new JPanel(new GridLayout(3, 1));

		controlPanel.setBorder(new EmptyBorder(10, 20, 10, 10));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		this.getContentPane().setLayout(layout);
		
		createControlPanel();

		this.add(controlPanel, BorderLayout.EAST);
		this.add(drawPanel, BorderLayout.CENTER);

		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}


	public void createControlPanel() {
		TransFormControllerPanel resize = new TransFormControllerPanel(drawPanel,transLevel);
		TransFormControllerPanel scale = new TransFormControllerPanel(drawPanel,scaleLevel);
		TransFormControllerPanel rotate = new TransFormControllerPanel(drawPanel,rotationLevel);
		controlPanel.add(resize);
		controlPanel.add(scale);
		controlPanel.add(rotate);
	
		
	}
	
	

	

}
