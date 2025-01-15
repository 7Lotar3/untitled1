import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prop23 extends JFrame {
    //ATRIBUTOS
    private JPanel prop23;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button6;
    Double A, B, C, X1 = 0d, X2 = 0d, disc;

    //CONSTRUCTOR
    prop23() {
        setContentPane(prop23);
        setTitle("Parte 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(210, 150);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                iniciarVars();
                procesamientoDatos();

            }
        });
    }

    //MÉTODOS
    public void iniciarVars() {
        A = Double.parseDouble(textField1.getText());
        B = Double.parseDouble(textField2.getText());
        C = Double.parseDouble(textField3.getText());

        disc = Math.pow(B, 2) - 4 * A * C;
    }

    public void procesamientoDatos() {
        if (disc < 0) {
            JOptionPane.showMessageDialog(prop23.this,"La ecuación no tiene solución Real");
        } else if (disc == 0) {
            X1 = (-1 * B) / (2 * A);
            JOptionPane.showMessageDialog(prop23.this,"La ecuación tiene solución única y ésta es: " + X1);
        } else {
            X1 = ((-1 * B) - Math.sqrt(disc)) / (2 * A);
            X2 = ((-1 * B) + Math.sqrt(disc)) / (2 * A);
            JOptionPane.showMessageDialog(prop23.this,"La ecuación tiene dos soluciones reales: X1 = " + X1 + " y X2 = " + X2);
        }
    }

    public static void main(String[] args) {
        new prop23();
    }
}