package semana_5.libros;

public class Usuario extends Libro {

    //atributos
    private String nombreApellido;
    private String domicilio;
    private Integer edad;
    private Libro libro;


    //constructor
    public Usuario(String titulo, String codigo, Double precioLista, Double precioPromocion, String nombreApellido, String domicilio, Integer edad, Libro libro) {
        super(titulo, codigo, precioLista, precioPromocion);
        this.nombreApellido = nombreApellido;
        this.domicilio = domicilio;
        this.edad = edad;
        this.libro = libro;
    }


    //metodos
    @Override
    public Double vender() {
        return null;
    }

}
