package jose.armas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaBuscarContacto {


    private JComboBox comboBox1;
    private JLabel parametro;
    private JTextField textoBuscar;
    private JButton buttonBuscar;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel buscar;
    private JLabel nombre;
    private JLabel telefono;
    private JLabel mail;
    private JPanel ventanaBuscarContacto;
    private JButton buttonCancelar;

    //Conexión:
    private VentanPrincipal ventanPrincipal;


    public VentanaBuscarContacto(VentanPrincipal vp) {

        this.ventanPrincipal=vp;

        JFrame frame = new JFrame("Buscar Contacto");
        frame.setContentPane(ventanaBuscarContacto);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox1.getSelectedIndex();
            }
        });
        buttonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int opcion = comboBox1.getSelectedIndex();

                switch (opcion) {
                    case 0:
                        String nombre = textoBuscar.getText();

                        for (int i = 0; i < ventanPrincipal.getPersonasVentanaPrincipal().size(); i++) {
                            if(nombre.equalsIgnoreCase(ventanPrincipal.getPersonasVentanaPrincipal().get(i).getNombre())) {
                                textField2.setText(ventanPrincipal.getPersonasVentanaPrincipal().get(i).getNombre());
                                textField3.setText(ventanPrincipal.getPersonasVentanaPrincipal().get(i).getTelefono());
                                textField4.setText(ventanPrincipal.getPersonasVentanaPrincipal().get(i).getEmail());

                            }
                        }


                        break;
                    case 1:
                        String telefono = textoBuscar.getText();
                        if (ventanPrincipal.getPersonaMap().containsKey(telefono)) {
                            textField2.setText(ventanPrincipal.getPersonaMap().get(telefono).getNombre());
                            textField3.setText(ventanPrincipal.getPersonaMap().get(telefono).getTelefono());
                            textField4.setText(ventanPrincipal.getPersonaMap().get(telefono).getEmail());
                        }
                        break;
                    case 2:
                        String mail = textoBuscar.getText();

                        for (int i = 0; i <ventanPrincipal.getPersonasVentanaPrincipal().size(); i++) {
                            if (mail.equalsIgnoreCase(ventanPrincipal.getPersonasVentanaPrincipal().get(i).getEmail())){
                                textField2.setText(ventanPrincipal.getPersonasVentanaPrincipal().get(i).getNombre());
                                textField3.setText(ventanPrincipal.getPersonasVentanaPrincipal().get(i).getTelefono());
                                textField4.setText(ventanPrincipal.getPersonasVentanaPrincipal().get(i).getEmail());
                            }
                        }

                        break;
                }
            }
        });
        buttonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }




}
