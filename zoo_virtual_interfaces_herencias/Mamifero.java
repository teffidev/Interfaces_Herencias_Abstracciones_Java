package semana_5.zoo_virtual_interfaces_herencias;

public abstract class Mamifero extends Animal{
    //atributos
    private Integer cantidadDeCrias;


    //constructor
    public Mamifero(String nombre, Integer edad, Integer cantidadDeCrias) {
        super(nombre, edad);
        this.cantidadDeCrias = cantidadDeCrias;
    }


    //metodos
    public void amamantar(){
        System.out.println("Hola amamanto " + cantidadDeCrias + " crias");
    }
}
