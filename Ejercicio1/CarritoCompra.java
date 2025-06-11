import java.util.ArrayList;

/**
 * Copyright (c) 2025, Victor, Todos los derechos reservados.
 */

/**
 * Clase que representa un carrito de la compra
 * @author Victor
 * @version 1.0
 */
public class CarritoCompra {
    /**
     * Lista de productos en el carrito
     */
    private ArrayList<Producto> productos = new ArrayList<>();
    /**
     * IVA aplicado a los productos del carrito
     */
    final static double IVA = 0.21;
    
    /**
     * Metodo para agregar un producto al carrito
     * @param p Producto a agregar al carrito
     * O(1)
     */
    public void agregarProducto(Producto p) {
    productos.add(p);
}

    /**
     * Metodo para calcular el total del carrito
     * @return Total del carrito con IVA incluiddo
     * O(n)
     */
    public double calcularTotal() {
        double subtotal = productos.stream().mapToDouble(Producto::getPrecio).sum();
        return subtotal * (1 + IVA);
    }
    
    /**
     * Metodo para listar los productos del carrito en texto
     * @return Lista de productos en texto
     * O(n)
     * @deprecated Este metodo esta obsoleto se usa gerenarTicket() en su lugar
     */
    public String listarProductosTexto() {
        String resultado = "";
        for(Producto p : productos) {
            resultado += p.getNombre() + "\n";
        }
        return resultado;
    }
    
    /**
     * Metodo para listar productos del carrito en texto como un ticket
     * @return ticket con los pdoductos del carrito
     * O(n)
     */
    public String generarTicket() {
        StringBuilder sb = new StringBuilder();
        productos.forEach(p -> sb.append(p.getNombre()).append("\n"));
        return sb.toString();
    }
}
