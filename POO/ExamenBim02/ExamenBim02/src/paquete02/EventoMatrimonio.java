package paquete02;

import paquete03.Cliente;

public class EventoMatrimonio extends Eventos{
    private double costoSonido;
    private double costoIglesia;
    private double costoPastel;
    private int nroAsistentes;
    private double valorPlatoPrincipal;

    public EventoMatrimonio(double csSon, double csIg, double csPas,
            int nAsist, double valP, Cliente cl, int dia, String mes,
            int anio) {
        super(cl, dia, mes, anio);
        costoSonido = csSon;
        costoIglesia = csIg;
        costoPastel = csPas;
        nroAsistentes = nAsist;
        valorPlatoPrincipal = valP;
    }

    public double getCostoSonido() {
        return costoSonido;
    }

    public void setCostoSonido(double n) {
        costoSonido = n;
    }

    public double getCostoIglesia() {
        return costoIglesia;
    }

    public void setCostoIglesia(double n) {
        costoIglesia = n;
    }

    public double getCostoPastel() {
        return costoPastel;
    }

    public void setCostoPastel(double n) {
        costoPastel = n;
    }

    public int getNroAsistentes() {
        return nroAsistentes;
    }

    public void setNroAsistentes(int n) {
        nroAsistentes = n;
    }

    public double getValorPlatoPrincipal() {
        return valorPlatoPrincipal;
    }

    public void setValorPlatoPrincipal(double n) {
        valorPlatoPrincipal = n;
    }

    @Override
    public void calcularCostoEvento() {      
        costoEvento = costoSonido + costoIglesia + costoPastel 
                + (valorPlatoPrincipal * nroAsistentes);
        
        if (nroAsistentes >= 200) {
            double desc = (costoEvento * 15)/100;
            costoEvento = costoEvento - desc;
        }
    }

    @Override
    public String toString() {
        String m = String.format(
                """
                *** Evento matrimonio ***
                
                Costo sonido: $%.2f
                Costo iglesia: $%.2f
                Costo pastel: $%.2f
                Nro. asistentes: %d
                
                %s
                """, 
                costoSonido,
                costoIglesia,
                costoPastel,
                nroAsistentes,
                super.toString());
        
        return m;
    }
    
}
