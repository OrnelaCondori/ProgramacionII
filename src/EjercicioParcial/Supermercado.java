package EjercicioParcial;

        import EjercicioParcial.Cliente;
        import EjercicioParcial.Productos;

        import java.util.ArrayList;
        import java.util.List;

public class Supermercado {

    private List<Productos> inventario;
    private Cliente cliente;
    int monto_gastado=0;
    public Supermercado(Cliente cliente) {
        inventario = new ArrayList<>();
        this.cliente = cliente;
    }

    public void agregarProducto(Productos prod) {
        inventario.add(prod);
    }

    public Productos buscarProducto(String nombre) {
        for (Productos prod : inventario) {
            if (prod.getNombre().equals(nombre)) {

                return prod;
            }
        }
        return null;
    }

    public void realizarCompra(String nombre ) {
        Productos produu = buscarProducto(nombre);

        if (produu != null && produu.getStock()>=1) {
            System.out.println("producto: "+produu.getNombre());
            monto_gastado=monto_gastado+produu.getPrecio();
            produu.setStock(produu.getStock()-1);
        }else{
            System.out.println("no se encontro producto "+produu.getNombre()+" o no tiene stock");
        }

    }

    public void mostrar() {
        for (Productos prod : inventario) {

            System.out.println("producto: "+prod.getNombre()+" stock: "+prod.getStock());
        }
    }

    public void montoTotal(){
        System.out.println("el monto gastado es: "+monto_gastado);
    }
}