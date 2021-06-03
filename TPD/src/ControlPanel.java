import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ControlPanel extends JPanel implements ActionListener{
	JButton button;

	JLabel label;
	
	

	public ControlPanel(){

		

		

		label = new JLabel();



		label.setBounds(150, 250, 150, 150);

		label.setVisible(false);

		

		button = new JButton();

		button.setBounds(100, 100, 250, 100);

		button.addActionListener(this);

		button.setText("I'm a button!");

		

		button.setFocusable(false);



		button.setHorizontalTextPosition(JButton.CENTER);

		button.setVerticalTextPosition(JButton.BOTTOM);

		//button.setFont(new Font("Comic Sans",Font.BOLD,25));

		button.setIconTextGap(-15);

		button.setForeground(Color.cyan);

		button.setBackground(Color.lightGray);

		button.setBorder(BorderFactory.createEtchedBorder());

		

		
		 this.setPreferredSize(new Dimension(500,500));


		this.setVisible(true);

		this.add(button);

		this.add(label);


	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource()==button) {
			
//			System.out.println("poo");

		//	button.setEnabled(false);

			//label.setVisible(true);

		}	
	}

	
}
