package e13;

public class Main {
    public static void main(String[] args) {
        Carrito c = new Carrito();

        c.agregarProducto(50.0);
        c.agregarProducto(50.0); // Total 100
        System.out.println("Subtotal: " + c.getTotal());

        c.aplicarDescuento(10); // 10% de descuento
        System.out.println("Total con descuento (10%): " + c.getTotal());
    }
}