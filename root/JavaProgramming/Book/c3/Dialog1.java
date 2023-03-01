import javax.swing.JOptionPane;

public class Dialog1 {
    public static void main(String[] args) {
        String number = 
        JOptionPane.showInputDialog(null, "Input one number: ");
        
        int numberSquare = Integer.parseInt(number) * Integer.parseInt(number) ;
        
        String message = 
            String.format("%s ao quadrado é %s", number, numberSquare);

        JOptionPane.showMessageDialog(null, message);
    }
}
