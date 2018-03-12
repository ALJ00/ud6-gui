package jose.armas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VentanaNuevoContacto {
    private JButton botonGuardar;
    private JButton botonCancelar;
    private JPanel VentanaNuevoContacto;
    private JTextField name;
    private JTextField phone;
    private JTextField mail;
    private JLabel nombre;
    private JLabel telefono;

    //Conexión.
    private VentanPrincipal ventanPrincipal;

    //Almacenamiento contactos.
    private List<Persona> personas = new ArrayList<>();

    public VentanaNuevoContacto( VentanPrincipal vp) {

        ventanPrincipal = vp;

        JFrame frame = new JFrame("NuevoContacto");
        frame.setContentPane(VentanaNuevoContacto);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = name.getText();
                String telephone = phone.getText();
                String email = mail.getText();

                Persona nuevaPersona = new Persona(nom, telephone, email);

                if (nom.equalsIgnoreCase("") || telephone.equalsIgnoreCase("") || email.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(VentanaNuevoContacto, "Errror, intoduzca los datos del contacto");
                } else if (personas.contains(nuevaPersona)) {
                    JOptionPane.showMessageDialog(VentanaNuevoContacto, "Error, contacto ya existente");
                } else {
                    ventanPrincipal.getPersonasVentanaPrincipal().add(nuevaPersona);
                    //personas.add(nuevaPersona);
                    JOptionPane.showMessageDialog(VentanaNuevoContacto, "Contacto guardado correctamente");
                }

                name.setText("");
                phone.setText("");
                mail.setText("");
                name.requestFocus();

            }
        });
        botonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    public JTextField getName() {
        return name;
    }

    public JTextField getPhone() {
        return phone;
    }

    public JTextField getMail() {
        return mail;
    }

    public List<Persona> getPersonas() {
        return personas;
    }


}
