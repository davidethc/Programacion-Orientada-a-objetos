package paquete03;

public class Cliente {
    private String nombre;
    private String cedula;

    public Cliente(String nom, String ced) {
        nombre = nom;
        cedula = ced;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String n) {
        cedula = n;
    }
    
    
}
