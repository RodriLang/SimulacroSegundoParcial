package services;

import exceptions.CapacidadExcedidaException;
import models.Aeropuerto;

import java.util.ArrayList;
import java.util.List;

public class AeropuertoService {

    public List<Aeropuerto> filtrarPorCapacidad(List<Aeropuerto> aeropuertos, Integer capacidad) throws CapacidadExcedidaException {
        List<Aeropuerto> aeropuertosFiltrados = new ArrayList<>();
        for (Aeropuerto aeropuerto : aeropuertos) {
            if (aeropuerto.getCapacidad() > capacidad) {
                aeropuertosFiltrados.add(aeropuerto);
            } else {
                throw new CapacidadExcedidaException("La capacidad enviada por parametro es :" +
                        capacidad + ", \n es mayor a la capacidad del aeropuerto, que es: " + aeropuerto.getCapacidad());
            }
        }
        return aeropuertosFiltrados;
    }
}
