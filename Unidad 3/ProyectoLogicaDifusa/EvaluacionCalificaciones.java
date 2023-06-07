import net.sourceforge.jFuzzyLogic.FIS;
//Equipo con Gilberto Maldonado Dominguez

public class EvaluacionCalificaciones {

    public static void main(String[] args) {

        String filename = "reglas.fcl"; // Archivo FCL con las reglas difusas

        FIS fis = FIS.load(filename, true); // Carga el archivo FCL

        if (fis == null) { // Verifica si se cargó correctamente
            System.err.println("No se pudo cargar el archivo: '" + filename + "'");
            return;
        }

        // Definición de las entradas
        fis.setVariable("promedio", 10); // Calificación promedio
        fis.setVariable("asistencia", 100); // Porcentaje de asistencia

        // Evaluación del sistema de inferencia difusa
        fis.evaluate();

        // Obtención del valor de salida (evaluación)
        double evaluacion = fis.getVariable("evaluacion").getValue();

        System.out.println("La evaluación de las calificaciones es: " + evaluacion);
    }

    
}