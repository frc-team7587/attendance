

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
	public static void main(String[] args) {
		int number = 5;
		
		// create our window
		JFrame window = new JFrame();     //window variable that holds JFrame objects, and we're a new JFrame to assign to our variable
		window.setTitle("My Window");     // we're calling methods on our JFrame object to configure it
		window.setSize(800, 600);
		window.setVisible(true);
		
		JLabel label = new JLabel();	  //label variable holds JLabal objects, and we're creating a new JLabel to assign to our variable
		label.setText("My Label");		  //we're calling the setText method on our JLabel object to set it's text property
		
		window.add(label);
	} 

}
