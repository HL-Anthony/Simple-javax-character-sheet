package fullCode;

import javax.swing.*;

// Class for printing the stats form the StatInput class
public class PrintStatSheet {

    // Method that prints the values form the StatInput class to the dialog box
    public static void statSheetPrint(){

        StatInput get = new StatInput();

        String characterStats ="Here are your saved stats" +"\n\n"+ "Character name is : " + get.cName + "\n" + "Character age is : " + get.cAge + "\n" + "Character class is : " + get.characterClass + "\n" + "Weapon of choice is : " + get.weaponOfChoice + "\n\n" + "Thank you for using the form";

        JOptionPane.showMessageDialog(null, characterStats);

    }


}
