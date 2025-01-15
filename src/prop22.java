import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prop22 extends JFrame {
    //ATRIBUTOS
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button5;
    private JPanel prop22;
    String nombre;
    int valHor, totHor, sala;

    //CONSTRUCTOR
    prop22() {
        setContentPane(prop22);
        setTitle("Parte 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(290, 180);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarVars();
                procesamientoDatos();
            }
        });
    }

    //MÉTODOS
    public void iniciarVars() {
        nombre = textField1.getText();
        valHor = Integer.parseInt(textField2.getText());
        totHor = Integer.parseInt(textField3.getText());

        sala = valHor * totHor;
    }

    public void procesamientoDatos() {
        if (sala > 450000) {
            JOptionPane.showMessageDialog(prop22.this,nombre + " gana " + sala + "$ mensuales");
        } else {
            JOptionPane.showMessageDialog(prop22.this,nombre);
        }
    }

    public static void main(String[] args) {
        new prop22();
    }
}