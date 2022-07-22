package semana_5.examenes;

public abstract class Examen {
    //atributos
    private String titulo;
    private String enunciado;
    private double nota;

    //constructor
    public Examen(String titulo, String enunciado, double nota) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    //metodos
    public abstract boolean estaAprobado();

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getEnunciado() {

        return enunciado;
    }

    public void setEnunciado(String enunciado) {

        this.enunciado = enunciado;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    }
