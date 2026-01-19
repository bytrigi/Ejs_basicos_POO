package e13;

public class Carrito {
    private double total;

    public double getTotal() { return total; }

    public void agregarProducto(double precio) {
        this.total += precio;
    }

    public void aplicarDescuento(double porcentaje) {
        // Si porcentaje es 20, calculamos el 20% y lo restamos
        double descuento = this.total * (porcentaje / 100);
        this.total -= descuento;
    }
}