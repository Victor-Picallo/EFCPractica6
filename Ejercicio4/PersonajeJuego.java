package Ejercicio4;

public abstract class PersonajeJuego {

    protected String nombre;
    protected int vida = 100;
    protected Tipo tipo;
    protected boolean estado = true;

    enum Tipo {
        GUERRERO, MAGO, ARQUERO
    }

    public PersonajeJuego(String nombre, int vida, Tipo tipo, boolean estado) {
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public boolean puedeAtacar() {
        return vida > 0 && isEstado();
    }

    public abstract double calcularDanio();
}
