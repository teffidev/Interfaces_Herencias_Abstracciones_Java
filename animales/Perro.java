package semana_5.animales;

public class Perro extends Animal {

    private String nombre;


    public Perro(String nombre){
        this.nombre = nombre;
    }


    public String getNombre(){
        return this.nombre;
    }


    @Override
    public void moverse() {
        System.out.println("Corre");
    }
}
