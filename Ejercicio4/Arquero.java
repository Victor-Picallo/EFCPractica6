package Ejercicio4;

public class Arquero extends PersonajeJuego {
    private int agilidad = 4;

    public Arquero(String nombre, int vida, int agilidad, boolean estado) {
        super(nombre, vida, Tipo.ARQUERO, estado);
        this.agilidad = agilidad;
    }

    public int getAgilidad() {
        return agilidad;
    }

    @Override
    public double calcularDanio() {
        return vida * 0.20 + getAgilidad() * 0.6;
    }

}
