import javax.swing.JOptionPane;

public class areYouHappy {
public static void main(String[] args) {
	String feels = JOptionPane.showInputDialog("are you happy?");
    if(feels.equals("yes")){
    	JOptionPane.showMessageDialog(null, "keep doing what you are doing!");
    } else if(feels.equals("no")){
    	String noo = JOptionPane.showInputDialog("do you want to be happy?");
    	if(noo.equals("no")){
    		JOptionPane.showMessageDialog(null, "well thats sad");
    	}else  if(noo.equals("yes")){
        	JOptionPane.showMessageDialog(null, "change something");
        }
    		
    	}
    }
	
	
	
}


