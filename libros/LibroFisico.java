package semana_5.libros;

import java.util.Scanner;

public class LibroFisico extends Libro implements Enviable {
    //atributos
    //En este ejericio no tiene atributos


    //constructor
    public LibroFisico(String titulo, String codigo, Double precioLista, Double precioPromocion) {
        super(titulo, codigo, precioLista, precioPromocion);
    }


    //metodos
    @Override
    public Double vender(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre y apellido: ");
        String nombreApellido = scanner.nextLine();
        return getPrecioLista();
    }


    @Override
    public void enviar() {
        //logica
    }
}
