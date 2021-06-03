import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class MFrame extends JFrame {
	class OpLevel {
		int L = 1;
	}

	OpLevel transLevel = new OpLevel();

	DrawPanel drawPanel;
	ControlPanel controlPanel;
	JPanel buttonsPanel;

	MFrame() {
		drawPanel = new DrawPanel();
		controlPanel = new ControlPanel();
		buttonsPanel = new JPanel(new GridLayout(2, 2));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		this.getContentPane().setLayout(layout);
		
		addControlButtons();

		this.add(buttonsPanel, BorderLayout.EAST);
		this.add(drawPanel, BorderLayout.CENTER);

		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	public void modifyLevel(OpLevel level, boolean op) {
		if (op) {
			if (level.L >= 50)
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
	
	public void addControlButtons() {
		JButton addTranslation = new JButton("+");
		addTranslation.addActionListener(e -> {
			btnOperation("Resize", true);
		});
		JButton subsTranslation = new JButton("-");
		subsTranslation.addActionListener(e -> {
			btnOperation("Resize", false);
		});
		JButton addScale= new JButton("+ S");
		addScale.addActionListener(e -> {
			btnOperation("Scale", true);
		});
		JButton subScale= new JButton("- S");
		subScale.addActionListener(e -> {
			btnOperation("Scale", false);
		});


		buttonsPanel.add(addTranslation);
		buttonsPanel.add(subsTranslation);
		buttonsPanel.add(addScale);
		buttonsPanel.add(subScale);

		
	}

}
