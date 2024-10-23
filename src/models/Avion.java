package models;

import java.util.Objects;

public class Avion {
    private int id;
    private String piloto;
    private int capacidad_pasajeros;

    public Avion() {
    }

    public Avion(int id, String piloto, int capacidad_pasajeros) {
        this.id = id;
        this.piloto = piloto;
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    public void setCapacidad_pasajeros(int capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id=" + id +
                ", piloto='" + piloto + '\'' +
                ", capacidad_pasajeros=" + capacidad_pasajeros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Avion avion)) return false;
        return id == avion.id && capacidad_pasajeros == avion.capacidad_pasajeros && Objects.equals(piloto, avion.piloto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, piloto, capacidad_pasajeros);
    }
}
