import javax.swing.JOptionPane;

public class age {
	public static void main(String[] args) {
		
		
	String agge =JOptionPane.showInputDialog("how old are you?");
		int hage = 0;
	try{ hage = Integer.parseInt(agge);}
	catch(Exception e){
		hage= 0;
	}
		
	if(hage==0){
		JOptionPane.showMessageDialog(null, "you is 0");
	}else if(hage==1){JOptionPane.showMessageDialog(null, "You is 1");
	}else{
	
	String one = "You have been 1 year old\n";
		String all = "";
 	for(int i = 2; i<hage;i++){
			
			 all= all + "you have been " + i + " years old\n " ;
		}
		 
		JOptionPane.showMessageDialog(null, " "+one +" "+ all +  "You are " +hage+" years old ");
	}
		
	}

}
