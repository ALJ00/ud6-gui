package jose.armas;

import java.util.Objects;

public class Persona {

    private String nombre;
    private String telefono;
    private String email;

    //Conexión.
    private VentanPrincipal ventanPrincipal;

    public Persona() {
    }

    public Persona(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) &&
                Objects.equals(telefono, persona.telefono);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre, telefono);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
