import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class ProcesadorDatosTest {
    
    @Test
    void testContiene() {
        ProcesadorDatos pr = new ProcesadorDatos();
        boolean r = pr.contiene(12);
        assertTrue(r);
    }
    
    @Test
    void testNoContiene() {
        ProcesadorDatos pr = new ProcesadorDatos();
        boolean r = pr.contiene(1);
        assertFalse(r);
    }

    @Test
    void testContarMayoresQue() {
        ProcesadorDatos pr = new ProcesadorDatos();
        int r = pr.contarMayoresQue(8);
        assertEquals(2, r);
    }

    @Test
    void testContarMayoresQueNulo() {
       ProcesadorDatos pr = new ProcesadorDatos();
       pr.valores = null;
       assertThrows(IllegalArgumentException.class,() -> pr.contarMayoresQue(8));
    }

    @Test
    void testContarMayoresQueVacio() {
       ProcesadorDatos pr = new ProcesadorDatos();
       pr.valores = new int [0];
       assertThrows(IllegalArgumentException.class,() -> pr.contarMayoresQue(8));
    }

    @Test
    void testContarMayoresQueNingunoMayor() {
       ProcesadorDatos pr = new ProcesadorDatos();
       int r = pr.contarMayoresQue(12);
       assertEquals(0, r);
    }

    @Test
    void testObtenerModa() {
        ProcesadorDatos pr = new ProcesadorDatos();
        pr.valores = new int[] { 12, 5, 7, 12, 8, 5 };
        int[] r = pr.obtenerModa();
        assertTrue(r[0] == 12 || r[0] == 5);
    }
}
