package jose.armas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaContactos {
    private JPanel ventanaContactos;
    private JButton buttonAnterior;
    private JButton buttonSiguiente;
    private JTextField contador;
    private JLabel Nombre;
    private JLabel telefono;
    private JLabel email;
    private JButton buttonCancelar;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    //Conexión.
    private VentanPrincipal ventanPrincipal;

    public VentanPrincipal getVentanPrincipal() {
        return ventanPrincipal;
    }

    public void setVentanPrincipal(VentanPrincipal ventanPrincipal) {
        this.ventanPrincipal = ventanPrincipal;
    }

    int cuenta=0;
    int numero=0;

    public VentanaContactos( VentanPrincipal vp) {

        this.ventanPrincipal = vp;

        JFrame frame = new JFrame("VentanaContactos");
        frame.setContentPane(ventanaContactos);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        numero = ventanPrincipal.getPersonasVentanaPrincipal().size();

        valorTexfields(0);


        buttonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

            }
        });


        buttonSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cuenta+1<numero) {
                    cuenta++;
                    valorTexfields(cuenta);

                }
            }
        });
        buttonAnterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cuenta>0) {
                    cuenta--;
                    valorTexfields(cuenta);
                }
            }
        });
    }

    public void valorTexfields(int i) {
        String name = ventanPrincipal.getPersonasVentanaPrincipal().get(i).getNombre();
        String phone = ventanPrincipal.getPersonasVentanaPrincipal().get(i).getTelefono();
        String mail = ventanPrincipal.getPersonasVentanaPrincipal().get(i).getEmail();

        textField1.setText(name);
        textField2.setText(phone);
        textField3.setText(mail);

        
        contador.setText((i+1)+" contacto de "+numero);

    }


}
