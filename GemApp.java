/*
* GemApp.java
* @author: Ata Turkoglu
* Date: 07/03/2023
*/

import javax.swing.JOptionPane;
public class GemApp{
	public static void main(String args[]){
		//Declare variables
		String birMon, birSton;

		//Declare object
		Gem myGem;

		//Create object
		myGem = new Gem();

		//Input
		birMon = (JOptionPane.showInputDialog(null,"Enter your birth month (e.g. Jan)"));
		myGem.setBirMon(birMon);

		///Process
		myGem.compute();

		//Output
		birSton = myGem.getBirSton();
		JOptionPane.showMessageDialog(null,"Your gem is: "+birSton);
	}
}