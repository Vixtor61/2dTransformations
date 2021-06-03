import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TransFormControllerPanel extends JPanel {
	SuperDuperButton addLevel;
	SuperDuperButton subLevel;
	DrawPanel drawPanel;
	MFrame.OpLevel transLevel;

	public TransFormControllerPanel(DrawPanel drawPanel, MFrame.OpLevel oplevel) {
		this.setLayout(new GridLayout(1, 3));
		this.drawPanel = drawPanel;
		this.transLevel = oplevel;

		addLevel = new SuperDuperButton("+");
		addLevel.addActionListener(e -> {
			btnOperation(oplevel.Op, true);
		});
		subLevel = new SuperDuperButton("-");
		subLevel.addActionListener(e -> {
			btnOperation(oplevel.Op, false);
		});

		this.add(addLevel);
		this.add(subLevel);
	}

	public void btnOperation(String option, boolean op) {
		modifyLevel(transLevel,op);
		transLevel.modifyLevel(op);
		drawPanel.sqr.transFormSquare(transLevel.returnLevelVal(), option);
		drawPanel.sqr.printCords();
		drawPanel.repaint();
	}

	public void modifyLevel(MFrame.OpLevel level, boolean op) {
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
