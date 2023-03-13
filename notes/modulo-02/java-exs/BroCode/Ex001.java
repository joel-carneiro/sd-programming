import javax.swing.JOptionPane;

public class Ex001 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");

        JOptionPane.showMessageDialog(null, "Hello, " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));

        JOptionPane.showMessageDialog(null, "You are " + age + " years old!");

        double heigth = Double.parseDouble(JOptionPane.showInputDialog("Enter your heigth:"));

        JOptionPane.showMessageDialog(null, "You are " + heigth + " cm tall!");
        
    }
}