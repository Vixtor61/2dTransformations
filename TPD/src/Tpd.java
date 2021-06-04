import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Tpd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNativeLAF();
		MFrame mframe =   new MFrame();


	}
	
	  public static void setNativeLAF() {
	        // Native L&F
	        try {
	        	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	        	System.out.print(UIManager.getSystemLookAndFeelClassName());
	          // 	UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
	        } 
	            catch (UnsupportedLookAndFeelException e) {
	                // handle exception
	            	System.out.print("Unsuported Look and feel error"+e);
	             }
	             catch (ClassNotFoundException e) {
	                // handle exception
	            		System.out.print("Class not found error"+e);
	   	             
	             }
	             catch (InstantiationException e) {
	            		System.out.print("Instatiation error"+e);
	   	             
	             }
	             catch (IllegalAccessException e) {
	            		System.out.print("Ilegal acces error"+e);
	   	             
	                // handle exception
	             }
	                 
	    }
	
	

}
