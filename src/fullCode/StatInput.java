package fullCode;
import javax.swing.*;

// Class for getting user input
public class StatInput {

    // variable declaration
    // Must be static to belong to the class and enable them to be accessed
     static String cName;
     static int cAge;
     static String characterClass;
     static String weaponOfChoice;


    // Method that gets user input form the user
    public static void GetStatInput() {

         cName = JOptionPane.showInputDialog("What is your character name ?");

            // Tests if the input is a hole number
            try {

         cAge = Integer.parseInt(JOptionPane.showInputDialog("How old is your character ?"));

            // if not a hole number
            } catch (Exception e) {

         JOptionPane.showMessageDialog(null, "Input invalid, input not a hole number.");
         System.exit(0);
            }

         characterClass = JOptionPane.showInputDialog("What class is your character ?");
         weaponOfChoice = JOptionPane.showInputDialog("What weapon wil you use ?");


        // Save confirmation prompt
        int choice = JOptionPane.showConfirmDialog(null,"Do you want to save these stats ?","Confirmation",JOptionPane.YES_NO_OPTION);

            // Response depending on the input form the confirmation dialog
            if (choice == JOptionPane.YES_OPTION) {

                JOptionPane.showMessageDialog(null, "The stats have been saved");

            }
            else if (choice == JOptionPane.NO_OPTION){

                JOptionPane.showMessageDialog(null, "The stats were not saved");
                System.exit(0);

            }
            else {

                JOptionPane.showMessageDialog(null, "Cheeky cunt ;P");
                System.exit(0);
            }



    }



}

