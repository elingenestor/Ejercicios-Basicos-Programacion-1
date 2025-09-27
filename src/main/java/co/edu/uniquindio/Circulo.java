package co.edu.uniquindio;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Metodo para calcular el area
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }


    // Mostrar info
    public void mostrarInfo(){
        System.out.println("-- AREA DEL CIRCULO --");
        System.out.printf(" el area del circulo con radio %.2f es %.2f%n", radio, calcularArea());
        System.out.println("-- GRACIAS POR USAR EL CALCULADOR DE AREAS --");
    }
}
