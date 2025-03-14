public class aprobacionCredito {
    private String nombre;
    private int edad;
    private double ingresosmensuales;
    private double puntajecrediticio;

    public aprobacionCredito() {
    }

    public aprobacionCredito(String nombre, int edad, double ingresosmensuales, double puntajecrediticio) {
        this.nombre = nombre;
        this.edad = edad;
        this.ingresosmensuales = ingresosmensuales;
        this.puntajecrediticio = puntajecrediticio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getIngresosmensuales() {
        return ingresosmensuales;
    }

    public void setIngresosmensuales(double ingresosmensuales) {
        this.ingresosmensuales = ingresosmensuales;
    }

    public double getPuntajecrediticio() {
        return puntajecrediticio;
    }

    public void setPuntajecrediticio(double puntajecrediticio) {
        this.puntajecrediticio = puntajecrediticio;
    }

    @Override
    public String toString() {
        return "aprobacionCredito{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ingresosmensuales=" + ingresosmensuales +
                ", puntajecrediticio=" + puntajecrediticio +
                '}';
    }

    public String verificarEdad() {
        if (edad >= 18) {
            return "CUMPLE CON LA EDAD";
        } else {
            return "NO CUMPLE CON LA EDAD MINIMA";
        }
    }

    public String verficiarhistorialcrediticio() {
        if (puntajecrediticio >= 600) {
            return "CUMPLE CON EL PUNTAJE REQUERIDO";
        } else {
            return "NO CUMPLE CON EL PUNTAJE MINIMO";
        }
    }

    public String verificaringresosmensauales() {
        if (ingresosmensuales >= 1400000) {
            return "CUMPLE CON SUFICIENTES INGRESOS ECONOMICOS";
        } else {
            return "NO CUMPLE CON EL MINIMO DE  INGRESOS ECONOMICOS";
        }


    }

    public String aprobacioncredito() {
        if (edad >= 18 & puntajecrediticio >= 600 & ingresosmensuales > 1400000) {
            return "SU CREDITO FUE APROBADO";
        } else {
            return "SU CREDITO FUE NEGADO";
        }
    }

    public void reporteaprobacioncredito() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("*-*-*-*-*-REPORTE*-*-**-*-*");
        System.out.println(this.verificarEdad());
        System.out.println(this.verificaringresosmensauales());
        System.out.println(this.verficiarhistorialcrediticio());
        System.out.println(this.aprobacioncredito());
        System.out.println();

    }

}
