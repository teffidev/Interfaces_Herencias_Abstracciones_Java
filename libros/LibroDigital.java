package semana_5.libros;

import java.util.Scanner;

public class LibroDigital extends Libro{
    //atributos
    private Double tamanio;


    //constructor
    public LibroDigital(String titulo, String codigo, Double precioLista, Double precioPromocion, Double tamanio) {
        super(titulo, codigo, precioLista, precioPromocion);
        this.tamanio = tamanio;
    }

    //metodos
    @Override
    public Double vender() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre y apellido: ");
        String nombreApellido = scanner.nextLine();
        System.out.println("Ingrese tarjeta: ");
        String tarjeta = scanner.nextLine();
        return getPrecioLista()*0.9;
    }

    public Double comprimir(){
        return this.tamanio * 0.325;
    }



}
