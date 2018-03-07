import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    private int[][] tablero = new int[3][3];

    private int turno = 0;


    private static boolean hayGanador(int[][] t, int turno) {

        boolean hayGanador = false;

        // Filas
        if (t[0][0] == turno && t[0][1] == turno && t[0][2] == turno) {
            hayGanador = true;
        }
        if (t[1][0] == turno && t[1][1] == turno && t[1][2] == turno) {
            hayGanador = true;
        }
        if (t[2][0] == turno && t[2][1] == turno && t[2][2] == turno) {
            hayGanador = true;
        }

        // Columnas
        if (t[0][0] == turno && t[1][0] == turno && t[2][0] == turno) {
            hayGanador = true;
        }
        if (t[0][1] == turno && t[1][1] == turno && t[2][1] == turno) {
            hayGanador = true;
        }
        if (t[0][2] == turno && t[1][2] == turno && t[2][2] == turno) {
            hayGanador = true;
        }

        // Diagonales
        if (t[0][0] == turno && t[1][1] == turno && t[2][2] == turno) {
            hayGanador = true;
        }
        if (t[0][2] == turno && t[1][1] == turno && t[2][0] == turno) {
            hayGanador = true;
        }

        return hayGanador;
    }

    public VentanaPrincipal() {



        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = 5;
            }
        }

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (tablero[0][0] != 5) {
                    JOptionPane.showMessageDialog(panel1, "Error, jugada no posible");
                } else {
                    if (turno % 2 == 1) {
                        System.out.println("numero par jugador 1");
                        button1.setText("X");
                    } else {
                        System.out.println("numero impar jugador 2");
                        button1.setText("O");
                    }
                    tablero[0][0] = turno % 2;

                    if(hayGanador(tablero,turno)){
                        JOptionPane.showMessageDialog(panel1,"¡Enhorabuena has ganado!");
                    }else{
                        JOptionPane.showMessageDialog(panel1,"¡Empate!");
                    }

                    turno++;

                }

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (tablero[0][1] != 5) {
                    JOptionPane.showMessageDialog(panel1, "Error, jugada no posible");
                } else {
                    if (turno % 2 == 1) {
                        System.out.println("numero par jugador 1");
                        button2.setText("X");
                    } else {
                        System.out.println("numero impar jugador 2");
                        button2.setText("O");
                    }
                    tablero[0][1] = turno % 2;

                    if(hayGanador(tablero,turno)){
                        JOptionPane.showMessageDialog(panel1,"¡Enhorabuena has ganado!");
                    }else{
                        JOptionPane.showMessageDialog(panel1,"¡Empate!");
                    }

                    turno++;

                }

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (tablero[0][2] != 5) {
                    JOptionPane.showMessageDialog(panel1, "Error, jugada no posible");
                } else {
                    if (turno % 2 == 1) {
                        System.out.println("numero par jugador 1");
                        button3.setText("X");
                    } else {
                        System.out.println("numero impar jugador 2");
                        button3.setText("O");
                    }
                    tablero[0][2] = turno % 2;

                    if(hayGanador(tablero,turno)){
                        JOptionPane.showMessageDialog(panel1,"¡Enhorabuena has ganado!");
                    }else{
                        JOptionPane.showMessageDialog(panel1,"¡Empate!");
                    }

                    turno++;

                }

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (tablero[1][0] != 5) {
                    JOptionPane.showMessageDialog(panel1, "Error, jugada no posible");
                } else {
                    if (turno % 2 == 1) {
                        System.out.println("numero par jugador 1");
                        button4.setText("X");
                    } else {
                        System.out.println("numero impar jugador 2");
                        button4.setText("O");
                    }
                    tablero[1][0] = turno % 2;

                    if(hayGanador(tablero,turno)){
                        JOptionPane.showMessageDialog(panel1,"¡Enhorabuena has ganado!");
                    }else{
                        JOptionPane.showMessageDialog(panel1,"¡Empate!");
                    }

                    turno++;

                }

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (tablero[1][1] != 5) {
                    JOptionPane.showMessageDialog(panel1, "Error, jugada no posible");
                } else {
                    if (turno % 2 == 1) {
                        System.out.println("numero par jugador 1");
                        button5.setText("X");
                    } else {
                        System.out.println("numero impar jugador 2");
                        button5.setText("O");
                    }
                    tablero[1][1] = turno % 2;

                    if(hayGanador(tablero,turno)){
                        JOptionPane.showMessageDialog(panel1,"¡Enhorabuena has ganado!");
                    }else{
                        JOptionPane.showMessageDialog(panel1,"¡Empate!");
                    }

                    turno++;

                }

            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (tablero[1][2] != 5) {
                    JOptionPane.showMessageDialog(panel1, "Error, jugada no posible");
                } else {
                    if (turno % 2 == 1) {
                        System.out.println("numero par jugador 1");
                        button6.setText("X");
                    } else {
                        System.out.println("numero impar jugador 2");
                        button6.setText("O");
                    }
                    tablero[1][2] = turno % 2;

                    if(hayGanador(tablero,turno)){
                        JOptionPane.showMessageDialog(panel1,"¡Enhorabuena has ganado!");
                    }else{
                        JOptionPane.showMessageDialog(panel1,"¡Empate!");
                    }

                    turno++;

                }

            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablero[2][0] != 5) {
                    JOptionPane.showMessageDialog(panel1, "Error, jugada no posible");
                } else {
                    if (turno % 2 == 1) {
                        System.out.println("numero par jugador 1");
                        button7.setText("X");
                    } else {
                        System.out.println("numero impar jugador 2");
                        button7.setText("O");
                    }
                    tablero[2][0] = turno % 2;

                    if(hayGanador(tablero,turno)){
                        JOptionPane.showMessageDialog(panel1,"¡Enhorabuena has ganado!");
                    }else{
                        JOptionPane.showMessageDialog(panel1,"¡Empate!");
                    }

                    turno++;

                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablero[2][1] != 5) {
                    JOptionPane.showMessageDialog(panel1, "Error, jugada no posible");
                } else {
                    if (turno % 2 == 1) {
                        System.out.println("numero par jugador 1");
                        button8.setText("X");
                    } else {
                        System.out.println("numero impar jugador 2");
                        button8.setText("O");
                    }
                    tablero[2][1] = turno % 2;

                    if(hayGanador(tablero,turno)){
                        JOptionPane.showMessageDialog(panel1,"¡Enhorabuena has ganado!");
                    }else{
                        JOptionPane.showMessageDialog(panel1,"¡Empate!");
                    }

                    turno++;

                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablero[2][2] != 5) {
                    JOptionPane.showMessageDialog(panel1, "Error, jugada no posible");
                } else {
                    if (turno % 2 == 1) {
                        System.out.println("numero par jugador 1");
                        button9.setText("X");
                    } else {
                        System.out.println("numero impar jugador 2");
                        button9.setText("O");
                    }
                    tablero[2][2] = turno % 2;

                    if(hayGanador(tablero,turno)){
                        JOptionPane.showMessageDialog(panel1,"¡Enhorabuena has ganado!");
                    }else{
                        JOptionPane.showMessageDialog(panel1,"¡Empate!");
                    }

                    turno++;

                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
