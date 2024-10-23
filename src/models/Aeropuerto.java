package models;

import java.util.List;
import java.util.Objects;

public class Aeropuerto {
    private String _id;
    private boolean activo;
    private String balance;
    private String imagen;
    private int capacidad;
    private String nombre;
    private String email;
    private String phone;
    private String direccion;
    private String acerca;
    private String fecha_inicio;
    private double latitud;
    private double longitud;
    private List<String> etiquetas;
    private List<Avion> aviones;

    public Aeropuerto() {
    }

    public Aeropuerto(String _id, boolean activo, String balance, String imagen, int capacidad, String nombre, String email, String phone, String direccion, String acerca, String fecha_inicio, double latitud, double longitud, List<String> etiquetas, List<Avion> aviones) {
        this._id = _id;
        this.activo = activo;
        this.balance = balance;
        this.imagen = imagen;
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.email = email;
        this.phone = phone;
        this.direccion = direccion;
        this.acerca = acerca;
        this.fecha_inicio = fecha_inicio;
        this.latitud = latitud;
        this.longitud = longitud;
        this.etiquetas = etiquetas;
        this.aviones = aviones;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }

    @Override
    public String toString() {
        return "\nAeropuerto{" +
                "_id='" + _id + '\'' +
                ", activo=" + activo +
                ", balance='" + balance + '\'' +
                ", imagen='" + imagen + '\'' +
                ", capacidad=" + capacidad +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", direccion='" + direccion + '\'' +
                ", acerca='" + acerca + '\'' +
                ", fecha_inicio='" + fecha_inicio + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", etiquetas=" + etiquetas +
                ", aviones=" + aviones +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aeropuerto that)) return false;
        return activo == that.activo && capacidad == that.capacidad && Double.compare(latitud, that.latitud) == 0 && Double.compare(longitud, that.longitud) == 0 && Objects.equals(_id, that._id) && Objects.equals(balance, that.balance) && Objects.equals(imagen, that.imagen) && Objects.equals(nombre, that.nombre) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(direccion, that.direccion) && Objects.equals(acerca, that.acerca) && Objects.equals(fecha_inicio, that.fecha_inicio) && Objects.equals(etiquetas, that.etiquetas) && Objects.equals(aviones, that.aviones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id, activo, balance, imagen, capacidad, nombre, email, phone, direccion, acerca, fecha_inicio, latitud, longitud, etiquetas, aviones);
    }
}