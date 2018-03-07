package jose.armas;

import javax.swing.*;
import java.util.List;

public class ListaAlumnos {
    private JTextArea textArea1;
    private JPanel listaAlumnos;

    public ListaAlumnos(List<Alumno>alumnos) {
        JFrame frame = new JFrame("ListaAlumnos");
        frame.setContentPane(listaAlumnos);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        for (int i = 0; i <alumnos.size(); i++) {
            textArea1.append(alumnos.get(i).toString());
        }
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public JPanel getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(JPanel listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
}
