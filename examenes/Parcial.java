package semana_5.examenes;

public class Parcial extends Examen {
    //atributos
    private Integer unidad;
    private Integer nroReintento;

    //constructor
    public Parcial(String titulo, String enunciado, double nota, Integer unidad, Integer nroReintento) {
        super(titulo, enunciado, nota);
        this.unidad = unidad;
        this.nroReintento = nroReintento;
    }

    //metodos
    @Override
    public boolean estaAprobado(){
        //opcion 1 - usando el if
        //if (getNota()>=4) {
          //  return true;
        //}
        //return false;

        //opcion 2 - comparación que devuelve un valor booleano
        return getNota()>=4;

        //opcion 3
        //boolean aprobado = getNota()>=4;
        //return aprobado;
    }

    public String sePuedeRecuperar(){
        if (this.unidad <= 3){
            return "Se puede recuperar hasta 3 veces";
        }
        return "Se puede recuperar hasta 2 veces";
    }

}
