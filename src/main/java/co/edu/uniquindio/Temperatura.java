package co.edu.uniquindio;

public class Temperatura {

    private double celcius;

    public Temperatura(double celcius) {
        this.celcius = celcius;
    }

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    // Metodo de conversion

    public double convertirFarenheit(){
        return (celcius * 9/5) + 32;
    }

    // MOSTRAR INFO

    public void mostrarInfoConversion(){
        System.out.println( "-- CONVERSION DE TEMPERATURA --");
        System.out.println( "Temperatura en Celcius: " + celcius );
        System.out.println( "Temperatura en Farenheit: " + convertirFarenheit());
        System.out.println( "-- GRACIAS POR USAR EL CONVERTIDOR DE TEMPERATURA --");
    }
}
