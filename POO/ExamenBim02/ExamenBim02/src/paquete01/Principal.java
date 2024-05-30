package paquete01;

import java.util.ArrayList;
import paquete02.EventoGraduacion;
import paquete02.EventoInfantil;
import paquete02.EventoMatrimonio;
import paquete02.Eventos;
import paquete03.Cliente;
import paquete03.ControlDiario;

public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Eventos> lista = new ArrayList<>();
        
        Cliente c01 = new Cliente("Luis Mora", "10035564");
        EventoInfantil eventoInfantil = new EventoInfantil(250.33,
                33.55, 5, c01, 25, "Enero", 2010);
        eventoInfantil.calcularCostoEvento();
        lista.add(eventoInfantil);
        
        Cliente c02 = new Cliente("Ana", "1034864890");
        EventoMatrimonio eventoMatrimonio = new EventoMatrimonio(142.2,
                233.6, 45.6, 250, 25, c02, 12,
                "Febrero", 2023);
        eventoMatrimonio.calcularCostoEvento();
        lista.add(eventoMatrimonio);
        
        Cliente c03 = new Cliente("Andres", "25645686");
        EventoGraduacion eventoGraduacion = new  EventoGraduacion(250.2,
                66.33, 45.1, 151, c03, 02, 
                "Marzo", 2013);
        eventoGraduacion.calcularCostoEvento();
        lista.add(eventoGraduacion);
        
        ControlDiario controlDiario = new ControlDiario(15, "Julio",
                2024, lista);
        controlDiario.calcularTotalCobrar();
        
        System.out.println(controlDiario);
    }

}
