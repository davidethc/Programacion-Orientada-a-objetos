package paquete03;

import java.util.ArrayList;
import paquete02.Eventos;

public class ControlDiario {
    private int diaReporte;
    private String mesReporte;
    private int anioReporte;
    private ArrayList<Eventos> listaEventos;
    private double totalCobrar;

    public ControlDiario(int dia, String mes, int anio, 
            ArrayList<Eventos> list) {
        diaReporte = dia;
        mesReporte = mes;
        anioReporte = anio;
        listaEventos = list;
    }

    public int getDiaReporte() {
        return diaReporte;
    }

    public void setDiaReporte(int n) {
        diaReporte = n;
    }

    public String getMesReporte() {
        return mesReporte;
    }

    public void setMesReporte(String n) {
        mesReporte = n;
    }

    public int getAnioReporte() {
        return anioReporte;
    }

    public void setAnioReporte(int n) {
        anioReporte = n;
    }

    public ArrayList<Eventos> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(ArrayList<Eventos> n) {
        listaEventos = n;
    }

    public double getTotalCobrar() {
        return totalCobrar;
    }

    public void calcularTotalCobrar() {
        totalCobrar = 0;
        for (Eventos e : listaEventos) {
            totalCobrar += e.getCostoEvento();
        }
    }

    @Override
    public String toString() {
        String m = String.format("""
                                    -----Control diario-----
                                 Dia del reporte: %d
                                 Mes del reporte: %s
                                 Año del reporte: %d
                                 
                                 Listas de eventos:                               
                                 """,
                diaReporte,
                mesReporte,
                anioReporte);
        
        for (Eventos e : listaEventos) {
            m = String.format("""
                              %s
                              %s
                              """, 
                    m,
                    e);
        }
        
        m = String.format("""
                          %s
                          *Total a cobrar: $%.2f
  
                          """,
                m,
                totalCobrar);
        
        return m;
    }
    
}
