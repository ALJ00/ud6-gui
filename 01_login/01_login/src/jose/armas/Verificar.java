package jose.armas;

import javax.swing.*;

public class Verificar {

    private String user;
    private String password;

    public Verificar(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public boolean comprobador(){

        boolean respuesta = false;

        if(user.equalsIgnoreCase("widemos")&&password.equalsIgnoreCase("widemos"))
            respuesta = true;
        return respuesta;

    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
