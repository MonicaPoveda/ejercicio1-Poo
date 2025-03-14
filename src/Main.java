//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante alum1 = new Estudiante("Daniela", "Perez", "Ing sistemas y computacion", 24.2, 29, 48, 39);
        Estudiante alum2 = new Estudiante("Juliana", "Estrada", "Ing industrial", 49.5, 36, 45.5, 39);
        Estudiante alum3 = new Estudiante("Andres", "alvarez", "Ing ambiental", 25, 10, 0, 30);

        alum1.reporteEstudiante();
        alum2.reporteEstudiante();
        alum3.reporteEstudiante();

        //OTRO EJEMPLO DE LA TAREA: APROBACION CREDITO

        aprobacionCredito pers1 = new aprobacionCredito("Monica", 17, 500000, 600);
        aprobacionCredito pers2 = new aprobacionCredito("Laura", 25, 5000000, 1200);

        pers1.reporteaprobacioncredito();
        pers2.reporteaprobacioncredito();
    }
}


