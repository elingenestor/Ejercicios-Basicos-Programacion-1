package co.edu.uniquindio;

public class Persona {

    private String nombre;
    private int edad;
    private String ciudadNacimiento;
    private double promedioNotas;

    public Persona(String nombre, int edad, String ciudadNacimiento, double promedioNotas) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudadNacimiento = ciudadNacimiento;
        this.promedioNotas = promedioNotas;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
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

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public void mostrarInfo(){
        System.out.println( "-- INFORMACION PERSONAL --");
        System.out.println( "Nombre completo: " + nombre );
        System.out.println( "Edad: " + edad);
        System.out.println( "Ciudad de nacimiento: " + ciudadNacimiento);
        System.out.println( "Promedio de notas: " + promedioNotas);
        System.out.println( "-- MUCHAS GRACIAS POR LA INFORMACION --");
    }


}
