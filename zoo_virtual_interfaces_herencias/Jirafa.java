package semana_5.zoo_virtual_interfaces_herencias;

public class Jirafa extends Mamifero implements Concebir {
    //atributos


    //constructor
    public Jirafa(String nombre, Integer edad, Integer cantidadDeCrias) {
        super(nombre, edad, cantidadDeCrias);
    }


    //metodos
    @Override
    public void parir(){
        //logica
    }

}
