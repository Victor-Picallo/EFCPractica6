EJERCICIO 1: Análisis de Clase CarritoCompra
Documente la clase CarritoCompra indicando:
Complejidad algorítmica de cada método
Marque como deprecado el método listarProductosTexto()
Incluya documentación Javadoc para la clase y métodos
java
import java.util.ArrayList;

class Producto {
    private String nombre;
    private double precio;
    
    // Constructor y métodos getter/setter
}

public class CarritoCompra {
    private ArrayList<Producto> productos = new ArrayList<>();
    final static double IVA = 0.21;
    
    public void agregarProducto(Producto p) { /* ... */ }
    
    public double calcularTotal() {
        double subtotal = productos.stream().mapToDouble(Producto::getPrecio).sum();
        return subtotal * (1 + IVA);
    }
    
    @Deprecated
    public String listarProductosTexto() {
        String resultado = "";
        for(Producto p : productos) {
            resultado += p.getNombre() + "\n";
        }
        return resultado;
    }
    
    public String generarTicket() {
        StringBuilder sb = new StringBuilder();
        productos.forEach(p -> sb.append(p.getNombre()).append("\n"));
        return sb.toString();
    }
}

EJERCICIO 2: Optimización de Clase ProcesadorDatos
Optimice los métodos marcados y justifique los cambios:
java
import java.util.Arrays;

public class ProcesadorDatos {
    int[] valores = {12, 5, 7, 12, 8, 5};
    
    boolean contiene(int numero) {
        boolean encontrado = false;
        for(int n : valores) {
            if(n == numero) encontrado = true;
        }
        return encontrado;
    }
    
    int contarMayoresQue(int limite) {
        int contador = 0;
        for(int i=0; i<valores.length; i++) {
            if(valores[i] > limite) contador++;
        }
        return contador;
    }
    
    int[] obtenerModa() {
        int maxRepeticiones = 0;
        int[] modas = new int[valores.length];
        for(int i=0; i<valores.length; i++) {
            int repeticiones = 0;
            for(int j=0; j<valores.length; j++) {
                if(valores[i] == valores[j]) repeticiones++;
            }
            if(repeticiones > maxRepeticiones) {
                maxRepeticiones = repeticiones;
                modas[0] = valores[i];
            }
        }
        return modas;
    }
}

EJERCICIO 3: Pruebas Unitarias
Cree tests JUnit 5 para:
contiene
contarMayoresQue
obtenerModa


EJERCICIO 4: Refactorización de Clase PersonajeJuego
Mejore la estructura del código:
java
public class PersonajeJuego {
    enum Tipo {GUERRERO, MAGO, ARQUERO}
    
    private String nombre;
    private int vida = 100;
    private Tipo tipo;
    private boolean estado = true;
    
    public boolean puedeAtacar() {
        if(vida <= 0) {
            return false;
        } else {
            if(estado) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    public double calcularDanio() {
        switch(tipo) {
            case GUERRERO: 
                return vida * 0.25 + furia * 0.7;
            case MAGO: 
                return vida * 0.15 + mana * 0.5;
            case ARQUERO: 
                return vida * 0.20 + agilidad * 0.6;
            default: 
                return 0;
        }
    }
}

