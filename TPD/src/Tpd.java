import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Tpd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNativeLAF();
		MFrame mframe =   new MFrame();


		SwingUtilities.updateComponentTreeUI(mframe);
		SwingUtilities.updateComponentTreeUI(mframe);
		
    //(mframe);
	}
	
	  public static void setNativeLAF() {
	        // Native L&F
	        try {
	           	UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
	        } catch (Exception e) {
	            System.out.println("Unable to set native look and feel: " + e);
	        }
	    }
	
	

}
