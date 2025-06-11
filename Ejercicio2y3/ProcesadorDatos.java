import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ProcesadorDatos {
    int[] valores = { 12, 5, 7, 12, 8, 5 };

    /**
     * He eliminado la variable innecesaria y he hecho que si encuentra el numero
     * devuelva true y si no false
     */
    boolean contiene(int numero) {
        for (int n : valores) {
            if (n == numero)
                return true;
        }
        return false;
    }

    /**
     * Solo he visto para anadir una comprobacion para que el array no sea nulo o vacio
     */
    int contarMayoresQue(int limite) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacio o ser nulo");
        }
        int contador = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > limite)
                contador++;
        }
        return contador;
    }

    /**
     * He cambiado todo
     */
    int[] obtenerModa() {
        Map<Integer, Integer> contador = new java.util.HashMap<>();
        for (int v : valores) {
            contador.put(v, contador.getOrDefault(v, 0) + 1);
        }
        int max = Collections.max(contador.values());
        List<Integer> modas = new java.util.ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            if (entry.getValue() == max) {
                modas.add(entry.getKey());
            }
        }
        return modas.stream().mapToInt(i -> i).toArray();
    }
}
