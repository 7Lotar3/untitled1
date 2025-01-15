import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prop19 extends JFrame {

    private JPanel prop19;
    private JTextField textField1;
    private JButton button2;
    //ATRIBUTOS
    float areaT, altT, perT, lado;

    //CONSTRUCTOR
    prop19() {
        setContentPane(prop19);
        setTitle("Parte 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 120);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        button2.addActionListener(new ActionListener() {
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
        lado = Float.parseFloat(textField1.getText());
    }

    public void procesamientoDatos() {
        perT = lado * 3;
        altT = (float) (lado * Math.sqrt(3) / 2);
        areaT = lado * altT / 2;
    }

    public void finalizacionProceso() {
        JOptionPane.showMessageDialog(prop19.this,"El perímetro del triángulo es "+ perT
                +"uni, su altura es "+ altT +"uni y su área es " + areaT +"uni²");
    }

    public static void main(String[] args) {
        new prop19();
    }
}