package Ejercicio4;

public class Guerrero extends PersonajeJuego {
    private int furia = 7;

    public Guerrero(String nombre, int vida, int furia, boolean estado) {
        super(nombre, vida, Tipo.GUERRERO, estado);
        this.furia = furia;
    }

    public int getFuria() {
        return furia;
    }

    @Override
    public double calcularDanio() {
        return vida * 0.25 + getFuria() * 0.7;
    }

}
