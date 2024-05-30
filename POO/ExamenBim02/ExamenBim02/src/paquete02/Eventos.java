package paquete02;

import paquete03.Cliente;

public abstract class Eventos {
    protected Cliente cliente;
    protected int diaEvento;
    protected String mesEvento;
    protected int anioEvento;
    protected double costoEvento;

    public Eventos(Cliente cl, int dia, String mes, int anio) {
        cliente = cl;
        diaEvento = dia;
        mesEvento = mes;
        anioEvento = anio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente n) {
        cliente = n;
    }

    public int getDiaEvento() {
        return diaEvento;
    }

    public void setDiaEvento(int n) {
        diaEvento = n;
    }

    public String getMesEvento() {
        return mesEvento;
    }

    public void setMesEvento(String n) {
        mesEvento = n;
    }

    public int getAnioEvento() {
        return anioEvento;
    }

    public void setAnioEvento(int n) {
        anioEvento = n;
    }

    public double getCostoEvento() {
        return costoEvento;
    }

    public abstract void calcularCostoEvento();

    @Override
    public String toString() {
        String m = String.format(
                """
                Cliente:
                    -Nombre: %s
                    -Cedula: %s
                
                Dia del evento: %d
                Mes del evento: %s
                Año del evento: %d
                
                +Costo del evento: $%.2f
                
                """, 
                cliente.getNombre(),
                cliente.getCedula(),
                diaEvento,
                mesEvento,
                anioEvento,
                costoEvento);
        
        return m;
    }
    
    
}
