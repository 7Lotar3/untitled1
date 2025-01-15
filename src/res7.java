import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class res7 extends JFrame {

    private JPanel res7;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button3;
    String valor;
    float A, B;

    res7() {
        setContentPane(res7);
        setTitle("Parte 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(220, 140);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarVars();
                procesamientoDatos();
                finalizacionProceso();
            }
        });
    }

    public void iniciarVars() {
        A = Float.parseFloat(textField1.getText());
        B = Float.parseFloat(textField2.getText());
    }

    public void procesamientoDatos() {
        if (A > B) {
            valor = "A es mayor que B";
        } else if (A < B) {
            valor = "A es menor que B";
        } else { valor = "A es igual a B";
        }
    }

    public void finalizacionProceso() {
        JOptionPane.showMessageDialog(res7.this, valor);
    }

    public static void main(String[] args) {
        new res7();
    }
}
