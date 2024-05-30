package paquete02;

import paquete03.Cliente;

public class EventoGraduacion extends Eventos{
    private double valorVino;
    private double valorRecuerdo;
    private double valorPlatoPrincipal;
    private int nroAsistentes;

    public EventoGraduacion(double valVino, double valrec, double valPlat,
            int nAsist, Cliente cl, int dia, String mes, int anio) {
        super(cl, dia, mes, anio);
        valorVino = valVino;
        valorRecuerdo = valrec;
        valorPlatoPrincipal = valPlat;
        nroAsistentes = nAsist;
    }

    public double getValorVino() {
        return valorVino;
    }

    public void setValorVino(double n) {
        valorVino = n;
    }

    public double getValorRecuerdo() {
        return valorRecuerdo;
    }

    public void setValorRecuerdo(double n) {
        valorRecuerdo = n;
    }

    public double getValorPlatoPrincipal() {
        return valorPlatoPrincipal;
    }

    public void setValorPlatoPrincipal(double n) {
        valorPlatoPrincipal = n;
    }

    public int getNroAsistentes() {
        return nroAsistentes;
    }

    public void setNroAsistentes(int n) {
        nroAsistentes = n;
    }

    @Override
    public void calcularCostoEvento() {
        if (mesEvento.toLowerCase().equals("enero") ||
                mesEvento.toLowerCase().equals("marzo") || 
                mesEvento.toLowerCase().equals("agosto") ||
                mesEvento.toLowerCase().equals("diciembre")) {
            
            double desc = (valorRecuerdo * 30)/100;
            valorRecuerdo = valorRecuerdo - desc;
            
            double add = (valorVino * 1)/100;
            valorVino = valorVino + add;
        }
        
        costoEvento = valorRecuerdo + valorVino 
                + (valorPlatoPrincipal * nroAsistentes);
    }

    @Override
    public String toString() {
        String m = String.format(
                """
                *** Evento graduacion ***
                
                Costo vino: $%.2f
                Costo recuerdo: $%.2f
                Costo plato principal: $%.2f
                Nro. Asistentes: %d
                
                %s
                """, 
                valorVino,
                valorRecuerdo,
                valorPlatoPrincipal,
                nroAsistentes,
                super.toString());
        
        return m;
        
    }

}
