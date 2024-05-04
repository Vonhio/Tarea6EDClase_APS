package tarea6_ed;

public class Tarea6EDClase {

    private static final double DESCUENTO_95 = 0.9516;

    public void aplicarDescuento(double precioBase, int numProductos) {
        double total;
        if (numProductos > 3) {
            precioBase -= 5;
        }
        calculoDescuento(numProductos, precioBase);
    }

    private void calculoDescuento(int numProductos, double precioBase) {
        double total;
        if (numProductos != 0) {
            total = precioBase * 0.8;
            System.out.println("El total a pagar es:" + total);
            System.out.println("Enviado");
        } else {
            total = precioBase * DESCUENTO_95;
            System.out.println("El total a pagar es:" + total);
            System.out.println("Enviado");
        }
    }
}
