/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String nombres = "";
        String apellidos = "";
        String id = "";
        int edad = 0;

        System.out.println("1) DESEA INGRESAR UN ESTUDIANTE A DISTANCIA");
        System.out.println("2) DESEA INGRESAR UN ESTUDIANTE PRESENCIAL");
        System.out.print("ELIJA UNA OPCION!: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion < 1 || opcion > 2) {
            System.out.println("\nOPCION FUERA DE RANGO!!!");
        } else {
            System.out.print("\nIngrese sus Nombres: ");
            nombres = sc.nextLine();
            System.out.print("Ingrese sus Apellidos: ");
            apellidos = sc.nextLine();
            System.out.print("Ingrese su Identificación: ");
            id = sc.nextLine();
            System.out.print("Ingrese su Edad: ");
            edad = sc.nextInt();

            if (opcion == 1) {
                EstudianteDistancia e1 = new EstudianteDistancia();

                e1.establecerNombresEstudiante(nombres);
                e1.establecerApellidoEstudiante(apellidos);
                e1.establecerIdentificacionEstudiante(id);
                e1.establecerEdadEstudiante(edad);

                System.out.print("Ingrese el N° de Asignaturas: ");
                int numAsig = sc.nextInt();
                e1.establecerNumeroAsginaturas(numAsig);
                System.out.print("Ingrese Costo Asignaturas: ");
                double costo = sc.nextDouble();
                e1.establecerCostoAsignatura(costo);
                e1.calcularMatriculaDistancia();

                System.out.printf("\n%s", e1);
            } else if (opcion == 2) {

                EstudiantePresencial e1 = new EstudiantePresencial();

                e1.establecerNombresEstudiante(nombres);
                e1.establecerApellidoEstudiante(apellidos);
                e1.establecerIdentificacionEstudiante(id);
                e1.establecerEdadEstudiante(edad);

                System.out.print("Ingrese el Numero de Creditos: ");
                int numCre = sc.nextInt();
                e1.establecerNumeroCreditos(numCre);
                System.out.print("Ingrese el Costo de los Creditos: ");
                double costo = sc.nextDouble();
                e1.establecerCostoCredito(costo);
                e1.calcularMatriculaPresencial();

                System.out.printf("\n%s", e1);
            }

        }
    }
}
