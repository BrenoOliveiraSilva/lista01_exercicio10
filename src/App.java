import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double celsius = 0;
        boolean validInput = false;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        while (!validInput) {
            String input_1 = JOptionPane.showInputDialog(null, "Informe a temperatura em Celsius");
            try {
                celsius = Double.parseDouble(input_1);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        double fahrenheit = (celsius * 9/5) + 32;
        JOptionPane.showMessageDialog(null, "A temperatura em graus Fahrenheit é de " + numberFormat.format(fahrenheit) + " ºF");
    }
}