public class Estudiante {
    private String nombre;
    private String apellido;
    private String nombrePrograma;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String nombrePrograma, double nota1, double nota2, double nota3, double nota4) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombrePrograma = nombrePrograma;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombrePrograma='" + nombrePrograma + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                '}';
    }
    public double promedioNotas(){
        double notapromedio=(nota1+nota2+nota3+nota4)/4;
        return notapromedio;
    }
    public String estadoEstudiante() {
        if (this.promedioNotas() >= 35.0) {
            return "APROBADO LA MATERIA";
        }if (this.promedioNotas() >= 50.0) {
            return "VERIFIQUE SUS NOTAS";
        }else {
            return "REPROBADO LA MATERIA";
        }
    }
    public void reporteEstudiante(){
        System.out.println("Nombre :"+this.nombre);
        System.out.println("Apellido : "+this.apellido);
        System.out.println("Nombre programa: "+this.nombrePrograma);
        System.out.println("SU NOTA 1 ES: " +this.nota1);
        System.out.println("SU NOTA 2 ES: " +this.nota2);
        System.out.println("SU NOTA 3 ES: " +this.nota3);
        System.out.println("SU NOTA 4 ES: " +this.nota4);
        System.out.println("SU PROMEDIO DE NOTAS ES: "+this.promedioNotas());
        System.out.println("USTED HA "+this.estadoEstudiante());
        System.out.println();
    }
}
