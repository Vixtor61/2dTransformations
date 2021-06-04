import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TransFormControllerPanel extends JPanel {
	SuperDuperButton addLevel;
	SuperDuperButton subLevel;
	DrawPanel drawPanel;
	OpLevel transLevel;
	JLabel levelLabel; //create a label


	public TransFormControllerPanel(DrawPanel drawPanel, OpLevel oplevel) {
		this.setLayout(new GridLayout(2, 1));
		JPanel layoutPanel = new JPanel();
		layoutPanel.setLayout(new GridLayout(1, 3));
		this.drawPanel = drawPanel;
		this.transLevel = oplevel;

		JLabel label = new JLabel(""+oplevel.Op,SwingConstants.CENTER); //create a label
	
		levelLabel = new JLabel(""+oplevel.L,SwingConstants.CENTER);
	
		
		addLevel = new SuperDuperButton("+");
		addLevel.addActionListener(e -> {
			btnOperation(oplevel.Op, true);
		});
		subLevel = new SuperDuperButton("-");
		subLevel.addActionListener(e -> {
			btnOperation(oplevel.Op, false);
		});
		
		layoutPanel.add(addLevel);
		layoutPanel.add(levelLabel);
		layoutPanel.add(subLevel);
		this.add(label);
		this.add(layoutPanel);
		
		
	}

	public void btnOperation(Operation option, boolean op) {
		
		transLevel.modifyLevel(op);
		levelLabel.setText(""+transLevel.L);

		drawPanel.sqr.transFormSquare(transLevel.returnLevelVal(), option);
		drawPanel.sqr.printCords();
		drawPanel.repaint();
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

}
