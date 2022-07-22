package semana_5.animales;

public class Persona {
    //atributos
    private String nombre;
    private Integer edad;


    //constructor:
    //Buena práctica: No hacer todos los atributos, solo limitarnos a lo que vamos a usar.
    //----Para la clase no vamos a hacer ningun constructor----
    //-----vamos a usar el Contructor por Default---- que va
    //devolver una instancia de persona con todos los nombres vacíos, en null----

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    //-----metodos-----
    //La idea de los getters(obtener un valor) y setters(setear un valor)
    //No es buena práctica hacer todos los getters y setters
    //Hay que limitarse a lo que vamos a usar.

    //getters
    public String getNombre() {
        return this.nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }

    //setters:
    //Se pone con void porque no devuelve nada, pero si recibe
    //un valor por parámetro
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(Integer edad){
        this.edad = edad;
    }
}
