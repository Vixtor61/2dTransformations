import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class MFrame extends JFrame {
	class OpLevel {
		int L = 1;
		String Op;
		
		public OpLevel(String Operation) {
			// TODO Auto-generated constructor stub
			this.Op = Operation;
		}
	}

	OpLevel transLevel = new OpLevel("Resize");
	OpLevel scaleLevel = new OpLevel("Scale");
	OpLevel rotationLevel = new OpLevel("Rotate");

	DrawPanel drawPanel;
	JPanel controlPanel;

	MFrame() {
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

	public void modifyLevel(OpLevel level, boolean op) {
		if (op) {
			if (level.L >= 5)
				return;
			level.L++;
		} else {
			if (level.L <= 1)
				return;
			level.L--;
		}
	}

	public void btnOperation(String option, boolean op) {
		drawPanel.sqr.printCords();
		modifyLevel(transLevel, op);
		drawPanel.sqr.transFormSquare(transLevel.L, option);
		drawPanel.sqr.printCords();
		drawPanel.repaint();
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
