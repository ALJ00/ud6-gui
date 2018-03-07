package jose.armas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class VentanaPrincipal {
    private JPanel VentanaPrincipal;
    private JLabel nombre;
    private JButton buttonVerLista;
    private JButton guardarButton;
    private JTextField name;
    private JTextField surname;
    private JTextField phoneNumber;
    private JTextField mail;



    //Conexion.
    private List<Alumno> alumnos = new ArrayList<>();

    //Funciones.
    public void introducirAlumnos (){

        //Mejor recoger los datos en variables primero p.ej. String nombre = name.getText();
        Alumno a = new Alumno(name.getText(), surname.getText(), phoneNumber.getText(), mail.getText());

        if (alumnos.contains(a)) {
            JOptionPane.showMessageDialog(VentanaPrincipal, "Alumno ya incluido");
        } else {
            JOptionPane.showMessageDialog(VentanaPrincipal, "Alumno guardado correctamente");
            alumnos.add(a);
        }

        name.setText("");
        surname.setText("");
        phoneNumber.setText("");
        mail.setText("");
        name.requestFocus();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().VentanaPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public VentanaPrincipal() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                introducirAlumnos();

            }
        });
        name.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    introducirAlumnos();
                    System.out.println("intro");
                }
            }
        });

        surname.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    introducirAlumnos();
                    System.out.println("intro");
                }
            }
        });

        phoneNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    introducirAlumnos();
                    System.out.println("intro");
                }
            }
        });

        mail.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    introducirAlumnos();
                    System.out.println("intro");
                }
            }
        });

        buttonVerLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ListaAlumnos lista = new ListaAlumnos(alumnos);

            }
        });
    }

    public JPanel getVentanaPrincipal() {
        return VentanaPrincipal;
    }

    public void setVentanaPrincipal(JPanel ventanaPrincipal) {
        VentanaPrincipal = ventanaPrincipal;
    }

    public JLabel getNombre() {
        return nombre;
    }

    public void setNombre(JLabel nombre) {
        this.nombre = nombre;
    }

    public JButton getButtonVerLista() {
        return buttonVerLista;
    }

    public void setButtonVerLista(JButton buttonVerLista) {
        this.buttonVerLista = buttonVerLista;
    }

    public JButton getGuardarButton() {
        return guardarButton;
    }

    public void setGuardarButton(JButton guardarButton) {
        this.guardarButton = guardarButton;
    }

    public JTextField getName() {
        return name;
    }

    public void setName(JTextField name) {
        this.name = name;
    }

    public JTextField getSurname() {
        return surname;
    }

    public void setSurname(JTextField surname) {
        this.surname = surname;
    }

    public JTextField getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(JTextField phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public JTextField getMail() {
        return mail;
    }

    public void setMail(JTextField mail) {
        this.mail = mail;
    }
}
