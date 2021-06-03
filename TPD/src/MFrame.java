import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class MFrame extends JFrame {
	class OpLevel {
		int L = 1;
		int MAX_LEVEL = 5;
		String Op;
		double[] levelValues = new double[MAX_LEVEL];
		public void modifyLevel(boolean op) {
			if (op) {
				if (this.L >= MAX_LEVEL )
					return;
				this.L++;
			} else {
				if (this.L <= 1)
					return;
				this.L--;
			}
		}
		
		public OpLevel(String Operation) {
			// TODO Auto-generated constructor stub
			for (int i = 0; i < levelValues.length; i++) {
				levelValues[i] = i+1;
			}
			this.Op = Operation;
		}
		public OpLevel(String Operation,double[] levels) {
			// TODO Auto-generated constructor stub
			this.levelValues = levels;
			this.Op = Operation;
		}
		
		public double returnLevelVal() {
			return levelValues[L-1];
		}
	}

	OpLevel transLevel;
	OpLevel scaleLevel;
	OpLevel rotationLevel;

	DrawPanel drawPanel;
	JPanel controlPanel;

	MFrame() {
		transLevel= new OpLevel("Resize");
		scaleLevel = new OpLevel("Scale");
		double[] rotatelevels = {0.0174533,0.0872665,0.174533,0.261799,0.349066};
		rotationLevel = new OpLevel("Rotate",rotatelevels);
		drawPanel = new DrawPanel();

		controlPanel = new JPanel(new GridLayout(3, 1));

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
