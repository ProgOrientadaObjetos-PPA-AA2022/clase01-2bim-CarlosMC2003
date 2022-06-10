
package herencia1;

public class EstudianteDistancia extends Estudiante{
    /*1.  Declarar
        numeroAsignaturas: Entero 
        costoAsginatura: Real 
        matriculaDistancia: Real*/ 
    //  Métodos establecer y calcular para los datos o atributos de la clase
    int numeroAsignaturas;
    double costoAsginatura;
    double matriculaDistancia;
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsginatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia(){
        matriculaDistancia = numeroAsignaturas * costoAsginatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsginatura;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaDistancia(){
        return matriculaDistancia;
    }
    
    public String toString() {
        String reporte = String.format("NOMBRES: %s\n"
                + "APELLIDOS: %s\n"
                + "IDENTIFICACION: %s\n"
                + "EDAD: %d\n"
                + "NUMERO DE ASIGNATURAS: %d\n"
                + "COSTO ASIGNATURAS: %.2f\n"
                + "COSTO MATRICULA: %.2f\n", obtenerNombresEstudiante(), obtenerApellidoEstudiante(),
                obtenerIdentificacionEstudiante(), obtenerEdadEstudiante(), obtenerNumeroAsignaturas(),
                obtenerCostoAsignatura(), obtenerMatriculaDistancia());
        
        return reporte;
    }
}
