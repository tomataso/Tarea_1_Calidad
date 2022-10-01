import javax.swing.*;
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

                // Da el resultado en el MSG box
                msgResultado(gestorMsgCalculoBisiesto(anno));
            }
        });
    }

    public static void main(String[] args) {
      Principal myFramme = new Principal();
    }

    private void msgResultado(String msgCalculo){
        JOptionPane.showMessageDialog(this, msgCalculo);
    }

    private boolean calcularBisiesto(String anno){

        int num_anno=Integer.parseInt(anno);

        if (num_anno % 4 == 0 && num_anno % 100 != 0 || num_anno % 400 == 0) {
           return true;
        } else {
            return false;
        }
    }

    private String gestorMsgCalculoBisiesto(String anno){


        Boolean biciesto = calcularBisiesto(anno);

        if (biciesto == true){
            return "El año: " + anno + " SI es bisiesto.";
        }else{
            return "El año: " + anno + " NO es bisiesto.";
        }

    }
}
