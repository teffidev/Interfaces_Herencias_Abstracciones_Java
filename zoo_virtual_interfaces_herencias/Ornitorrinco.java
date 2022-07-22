package semana_5.zoo_virtual_interfaces_herencias;

public class Ornitorrinco extends Mamifero implements Aovar{
    //atributos



    //constructor
    public Ornitorrinco(String nombre, Integer edad, Integer cantidadDeCrias) {
        super(nombre, edad, cantidadDeCrias);
    }


    //metodos
    @Override
    public void ponerHuevos() {
        //logica
    }

    @Override
    public void romperCascaron() {
        //logica
    }

}
