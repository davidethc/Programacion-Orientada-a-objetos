package paquete02;

import paquete03.Cliente;

public class EventoInfantil extends Eventos{
    private double costoAnimacion;
    private double costoPicadas;
    private int edadNinio;

    public EventoInfantil(double csAnima, double csPica, int edN,
            Cliente cl, int dia, String mes, int anio) {
        super(cl, dia, mes, anio);
        costoAnimacion = csAnima;
        costoPicadas = csPica;
        edadNinio = edN;
    }

    public double getCostoAnimacion() {
        return costoAnimacion;
    }

    public void setCostoAnimacion(double n) {
        costoAnimacion = n;
    }

    public double getCostoPicadas() {
        return costoPicadas;
    }

    public void setCostoPicadas(double n) {
        costoPicadas = n;
    }

    public int getEdadNinio() {
        return edadNinio;
    }

    public void setEdadNinio(int n) {
        edadNinio = n;
    }

    @Override
    public void calcularCostoEvento() {
        if (edadNinio <= 5) {
            double desc01 = (costoAnimacion * 30)/100;
            costoAnimacion = costoAnimacion - desc01;
            
            double desc02 = (costoPicadas * 40)/100;
            costoPicadas = costoPicadas - desc02;
        }
        
        costoEvento = costoAnimacion + costoPicadas;
    }

    @Override
    public String toString() {
        String m = String.format(
                """
                *** Evento infantil ***
                
                Costo animacion: $%.2f
                Costo picadas: $%.2f
                Edad niño: %d
                
                %s
                """, 
                costoAnimacion,
                costoPicadas,
                edadNinio,
                super.toString());
        
        return m;
    }
    
    
}
