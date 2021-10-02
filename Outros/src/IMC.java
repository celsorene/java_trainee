import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class IMC {

    public static void main(String[] args) {

        //mensagem dialog
        //JOptionPane.showMessageDialog(null, "Hello World");

        double altura, peso, imc;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));

        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));

        imc = peso / (altura * altura);

        //formatando - decimal
        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(imc);

        JOptionPane.showMessageDialog(null,"Seu valor do I.M.C. e: " + valorFormatado);

    }
}
