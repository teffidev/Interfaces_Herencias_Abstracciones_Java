package semana_5.animales;

public class Program {

    public static void main(String[] args) {

        /*Persona pedro = new Persona("Pedro", 25);

        System.out.println("Hola soy " + pedro.getNombre());

        pedro.setNombre("Juan");
        pedro.setEdad(30);

        System.out.println("Hola soy " + pedro.getNombre());*/

        Perro zeke = new Perro("Zeke");

        Pajaro pajaro1 = new Pajaro();

        pasearAnimal(zeke);
        pasearAnimal(pajaro1);

    }

    public static void pasearAnimal(Animal animal){
        animal.moverse();
    }

}
