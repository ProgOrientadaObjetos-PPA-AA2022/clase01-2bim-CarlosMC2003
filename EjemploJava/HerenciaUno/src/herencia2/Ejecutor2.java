/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        EstudianteDistancia e1 = new EstudianteDistancia();
        
        System.out.println("ESTUDIANTE A DISTANCIA");
        System.out.println("----------------------");
        System.out.print("Ingrese sus Nombres: ");
        String nombres = sc.nextLine();
        e1.establecerNombresEstudiante(nombres);
        System.out.print("Ingrese sus Apellidos: ");
        String apellidos = sc.nextLine();
        e1.establecerApellidoEstudiante(apellidos);
        System.out.print("Ingrese su Identificación: ");
        String id = sc.nextLine();
        e1.establecerIdentificacionEstudiante(id);
        System.out.print("Ingrese su Edad: ");
        int edad = sc.nextInt();
        e1.establecerEdadEstudiante(edad);
        System.out.print("Ingrese el N° de Asignaturas: ");
        int numAsig = sc.nextInt();
        e1.establecerNumeroAsginaturas(numAsig);
        System.out.print("Ingrese Costo Asignaturas: ");
        double costo = sc.nextDouble();
        e1.establecerCostoAsignatura(costo);
        e1.calcularMatriculaDistancia();
        
        System.out.printf("\n%s", e1);
    }
}
