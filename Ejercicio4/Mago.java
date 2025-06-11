package Ejercicio4;

public class Mago extends PersonajeJuego {
    private int mana = 10;

    public Mago(String nombre, int vida, int mana, boolean estado) {
        super(nombre, vida, Tipo.MAGO, estado);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public double calcularDanio() {
        return vida * 0.15 + getMana() * 0.5;
    }
}
