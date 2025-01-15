import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class res10 extends JFrame  {
    //ATRIBUTOS
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button4;
    private JPanel res10;
    String crip, nombre;
    int estrato;
    float pat, pagoM = 50000f;;

    //CONSTRUCTOR
    res10() {
        setContentPane(res10);
        setTitle("Parte 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(310, 190);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarVars();
                procesamientoDatos();
                finalizacionProceso();
            }
        });
    }

    //METODOS
    public void iniciarVars() {
        crip = textField1.getText();
        nombre = textField2.getText();
        pat = Float.parseFloat(textField3.getText());
        estrato = Integer.parseInt(textField4.getText());
    }

    public void procesamientoDatos() {
        if (pat > 2000000 && estrato > 3) {
            pagoM += pat * 0.03f;
        }
    }

    public void finalizacionProceso() {
        JOptionPane.showMessageDialog(res10.this,"El estudiante con " +
                "número de inscripción: " + crip + " y nombre: " + nombre + ", debe pagar: " + pagoM + "$");
    }

    public static void main(String[] args) {
        new res10();
    }
}
