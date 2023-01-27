/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerDatos(arreglo2);
        System.out.printf("%s\n", cadenaFinal);

    } 

    public static ArrayList< String> obtenerDatos() {
        Scanner entrada = new Scanner(System.in);
        String pais;
        boolean bandera = true;
        String opcion;
        ArrayList< String> arreglo2 = new ArrayList<>();
        while (bandera) {
            System.out.println("Ingrese el nombre de un pais");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("Ingrese si para salir del ciclo");
            opcion = entrada.nextLine();
            if (opcion.equals("si")) {
                bandera = false;
            }                                                                                                 
        }
        return arreglo2;
    }

    public static String  obtenerDatos(ArrayList<String> datos) {
        String cadenaFinal = "";
        for (int i = 0; i < datos.size(); i++) {
            cadenaFinal = String.format("%s%s\n", cadenaFinal, datos.get(i));

        }
        return cadenaFinal;
    }
}
