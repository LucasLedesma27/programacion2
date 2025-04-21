//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Kata 1

        inventario.agregarProducto(new Producto("001", "Leche", 50.0, 10, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("002", "Celular", 2000.0, 5, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("003", "Camisa", 300.0, 15, CategoriaProducto.ROPA));
        inventario.listarProductos();

        // Kata 2

        inventario.agregarProducto(new Producto("004", "Sofá", 5000.0, 2, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("005", "Laptop", 2500.0, 7, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("006", "Pan", 40.0, 20, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("007", "Pantalón", 400.0, 10, CategoriaProducto.ROPA));

        System.out.println("Buscar producto con ID '005':");
        Producto buscado = inventario.buscarProductoPorId("005");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("Productos en categoría ELECTRONICA:");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA)) {
            p.mostrarInfo();
        }

        System.out.println("Eliminar producto con ID '002'");
        inventario.eliminarProducto("002");
        inventario.listarProductos();

        // Kata 3

        System.out.println("Total stock disponible: " + inventario.obtenerTotalStock());

        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }

        System.out.println("Productos con precio entre $1000 y $3000:");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }

        System.out.println("Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();

    }
}