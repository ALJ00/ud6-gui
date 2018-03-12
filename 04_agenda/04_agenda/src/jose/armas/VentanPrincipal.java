package jose.armas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VentanPrincipal {
    private JPanel ventanaAgenda;
    private JButton nuevoContacto;
    private JButton verContactos;
    private JButton buscarContacto;


    //Conexión.
    private VentanaNuevoContacto ventanaNuevoContacto;
    private VentanaContactos ventanaContactos;

    private VentanPrincipal ventanPrincipal;

    //Control de las personas.
    private List<Persona>personasVentanaPrincipal = new ArrayList<>();

    public VentanPrincipal() {

        ventanPrincipal = this;

        nuevoContacto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ventanaNuevoContacto = new VentanaNuevoContacto(ventanPrincipal);

            }
        });
        verContactos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(personasVentanaPrincipal.size()==0){
                    JOptionPane.showMessageDialog(ventanaAgenda,"No hay contactos creados");
                }else{
                    VentanaContactos ventanaContactos = new VentanaContactos(ventanPrincipal);
                    ventanaContactos.setVentanPrincipal(ventanPrincipal);
                }


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Agenda");
        frame.setContentPane(new VentanPrincipal().ventanaAgenda);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public List<Persona> getPersonasVentanaPrincipal() {
        return personasVentanaPrincipal;
    }


}
