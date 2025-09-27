package co.edu.uniquindio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


// EJERCICIO 1

        // pedir datos al usuario
        System.out.println("Por favor ingrese su nombre completo: ");
        String nombre = scan.nextLine();

        System.out.println("Por favor ingrese su edad: ");
        int edad = scan.nextInt();
        scan.nextLine(); // Limpiar el buffer

        System.out.println("Por favor ingrese su ciudad de nacimiento: ");
        String ciudadNacimiento = scan.nextLine();

        System.out.println("Por favor ingrese su promedio de notas: ");
        double promedioNotas = scan.nextDouble();

        //Crear el objeto persona

        Persona persona = new Persona(nombre, edad, ciudadNacimiento, promedioNotas);


        //Mostrar la info de la persona
        persona.mostrarInfo();

// EJERCICIO 2


        // pedir temperatura al usuario
        System.out.println("Por favor ingrese la temperatura en Celcius: ");
        double celcius = scan.nextDouble();

        //Crear el objeto temperatura
        Temperatura temperatura = new Temperatura(celcius);

        //Mostrar la info de la conversion
        temperatura.mostrarInfoConversion();


// EJERCICIO 3
        // pedir el radio al usuario

        System.out.println("Por favor ingrese el radio del circulio: ");
        double radio = scan.nextDouble();

        // Crear el objeto llamado circulo

        Circulo circulo = new Circulo(radio);

        // Mostrar el area del circulo
        circulo.mostrarInfo();

        scan.close();
    }

}