/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudiantePresencial;
import herencia1.EstudianteDistancia;
/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        EstudiantePresencial e1 = new EstudiantePresencial();
        e1.establecerNombresEstudiante("Carlos Enrique");
        e1.establecerApellidoEstudiante("Morocho Carrión");
        e1.establecerIdentificacionEstudiante("1105559098");
        e1.establecerEdadEstudiante(19);
        e1.establecerCostoCredito(21.00);
        e1.establecerNumeroCreditos(15);
        e1.calcularMatriculaPresencial();
        
        System.out.printf("NOMBRES: %s\n"
                + "APELLIDOS: %s\n"
                + "IDENTIFICACION: %s\n"
                + "EDAD: %d\n"
                + "NUMERO DE CREDITOS: %d\n"
                + "COSTO CREDITOS: %.2f\n"
                + "COSTO MATRICULA: %.2f\n", e1.obtenerNombresEstudiante(), e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(), e1.obtenerEdadEstudiante(), e1.obtenerNumeroCreditos(),
                e1.obtenerCostoCredito(), e1.obtenerMatriculaPresencial());
    }
}
