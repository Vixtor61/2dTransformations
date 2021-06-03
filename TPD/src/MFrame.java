import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class MFrame extends JFrame{
		OpLevel transLevel = new OpLevel();

		 

		 DrawPanel drawPanel;
		 ControlPanel controlPanel;
		 

		 MFrame(){

		  

		  drawPanel = new DrawPanel();
		  controlPanel = new ControlPanel();

		  

		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      JButton b1 = new JButton("Button 1");
	        b1.addActionListener(e -> {
	        	drawPanel.sqr.printCords();
	        	modifyLevel(transLevel, true);
	        	drawPanel.sqr.resizeSqr(transLevel.L, transLevel.L);
	        	drawPanel.sqr.printCords();
	        	drawPanel.repaint();	
	        });
	        JButton subsTranslation = new JButton("Button 1");
	        subsTranslation.addActionListener(e -> {
	        	drawPanel.sqr.printCords();
	        	modifyLevel(transLevel, false);
	        	drawPanel.sqr.resizeSqr(transLevel.L, transLevel.L);
	        	drawPanel.sqr.printCords();
	        	drawPanel.repaint();	
	        });
	        
	        
	        
	        
	      BorderLayout layout = new BorderLayout();
	        getContentPane().setLayout(layout);
	        JPanel buttonsPanel = new JPanel(new GridLayout(2, 2));
	        buttonsPanel.add(b1);
	        buttonsPanel.add(subsTranslation);
		  
	        this.add(buttonsPanel, BorderLayout.EAST);
	        this.add(drawPanel, BorderLayout.CENTER);


		  this.pack();
	



		  this.setLocationRelativeTo(null);

		  this.setVisible(true);

		 }  
		 
		 
		 public void modifyLevel(OpLevel level,boolean op) {
			if(op) {
				if(level.L>=2)return;
				level.L++;

			}else {
				
				if(level.L<=-2)return;
				level.L--;
				
			}
		}
		 
		 class OpLevel{
			    int L=0;
			}

}
