import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame{
    private JTextField input_anno;
    private JButton btn_Calcular;
    private JPanel ventana_Calculadora;


    public Principal (){

        setContentPane(ventana_Calculadora);
        setTitle("Calculadora de año bisiesto.");
        setSize(350,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btn_Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String anno = input_anno.getText();
            }
        });
    }

    public static void main(String[] args) {
      Principal myFramme = new Principal();
    }
}
