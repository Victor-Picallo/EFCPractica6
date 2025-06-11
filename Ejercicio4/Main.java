package Ejercicio4;

public class Main {

    public static void main(String[] args) {
        
        PersonajeJuego guerrero = new Guerrero("Conan", 100, 7, true);
        PersonajeJuego mago = new Mago("Gandalf", 100, 10, false);
        PersonajeJuego arquero = new Arquero("Legolas", 100, 4, true);

        System.out.println(guerrero.getNombre() + " puede atacar: " + guerrero.puedeAtacar() + ", Daño: " + guerrero.calcularDanio());
        System.out.println(mago.getNombre() + " puede atacar: " + mago.puedeAtacar() + ", Daño: " + mago.calcularDanio());
        System.out.println(arquero.getNombre() + " puede atacar: " + arquero.puedeAtacar() + ", Daño: " + arquero.calcularDanio());
    }

}
