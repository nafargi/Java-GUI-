import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String ageText = JOptionPane.showInputDialog(null, "How Old Are You?");
        int age = Integer.parseInt(ageText);

        String moneyText = JOptionPane.showInputDialog(null, "How Much Money Do You Have?");
        double money = Double.parseDouble(moneyText);

        JOptionPane.showMessageDialog(null,"If you can double your money each year,\n" + "You'll have " + (money * 32) +"dollars at age " + (age + 5) + "!");
    }
}