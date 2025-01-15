import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prop18 extends JFrame {
    //swing related
    private JPanel prop18;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    //ATRIBUTOS
    String codEmp, nomEmp;
    float retEmp = 0.28f, bruto, neto, valHor, horTrab;

    //CONSTRUCTOR
    prop18() {
        setContentPane(prop18);
        setTitle("Parte 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(420, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarVars();
                procesamientoDatos();
                finalizacionProceso();
            }
        });
    }

    //MÉTODOS
    public void iniciarVars() {
        codEmp = textField1.getText();
        nomEmp = textField2.getText();
        horTrab = Float.parseFloat(textField3.getText());
        valHor = Float.parseFloat(textField4.getText());
    }

    public void procesamientoDatos() {
        bruto = horTrab * valHor;
        neto = bruto - (bruto * retEmp);
    }

    public void finalizacionProceso() {
        JOptionPane.showMessageDialog(prop18.this,"El código " + codEmp
                + ", está asociado al empleado " + nomEmp + ", cuyo salario bruto es de: " +
                bruto + "$, pero con salario neto de: " + neto + "$");
    }

    public static void main(String[] args) {
        new prop18();
    }
}
