import javax.swing.*; // for GUI components

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "what is your name");
        int choice = JOptionPane.showConfirmDialog(null, "Do you like " + name + "?");

        if(choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Of course! Who doesn't?");
        } else{
            JOptionPane.showMessageDialog(null,"We'll have to agree to disagree.");
        }

    }
}