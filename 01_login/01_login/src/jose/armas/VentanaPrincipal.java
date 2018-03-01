package jose.armas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private JPanel VentanaPrincipal;
    private JTextField textoUsuario;
    private JLabel usuario;
    private JPasswordField passwordField1;
    private JButton aceptarButton;


    public VentanaPrincipal() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = textoUsuario.getText();
                String password = new String(passwordField1.getPassword());

                Verificar verificador = new Verificar(user,password);

                if(verificador.comprobador()){
                    JOptionPane.showMessageDialog(VentanaPrincipal,"USUARIO Y CONTRASEÑA CORRECTAS");
                }else{
                    JOptionPane.showMessageDialog(VentanaPrincipal,"ERROR");
                }

                textoUsuario.setText("");
                passwordField1.setText("");
                textoUsuario.requestFocus();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().VentanaPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
