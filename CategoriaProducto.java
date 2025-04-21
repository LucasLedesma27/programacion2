public enum CategoriaProducto {
    ALIMENTOS("productos comestibles"),
    ELECTRONICA("dispositivos electronicos"),
    ROPA("prendas de vestir"),
    HOGAR("articulos para el hogar");

    private final String descripcion;

    CategoriaProducto(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }


}
