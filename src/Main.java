

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Main {

    // Un único Scanner compartido por todos los métodos
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n===== TALLER INICIAL - MENU =====");
            System.out.println("1. Leer un numero entero y mostrarlo");
            System.out.println("2. Indicar si un numero decimal es positivo o negativo");
            System.out.println("3. Indicar si un numero entero es par o impar");
            System.out.println("4. Indicar si un numero es par-positivo, par-negativo, impar-positivo o impar-negativo");
            System.out.println("5. Calcular la edad a partir de la fecha de nacimiento");
            System.out.println("6. Indicar el operador movil segun el numero de telefono");
            System.out.println("7. Intercambiar el valor de dos numeros enteros");
            System.out.println("8. Generar un numero aleatorio entre 50 y 70 ");
            System.out.println("9. indicar la generacion segun la edad");
            System.out.println("10. obtener el IVA de una venta y aplicar el descuento correspondiente ");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10-> ejercicio10();
                case 0 -> System.out.println("Fin del programa.");
                default -> System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);

        teclado.close();
    }

    // Ejercicio 1: leer un numero entero y mostrarlo
    public static void ejercicio1() {
        System.out.print("Ingrese el numero: ");
        int numero = teclado.nextInt();
        System.out.println("El numero que ingresaste es " + numero);
    }

    // Ejercicio 2: indicar si un numero decimal es positivo o negativo
    public static void ejercicio2() {
        System.out.print("Ingrese un numero decimal: ");
        double numero = teclado.nextDouble();

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
    }

    // Ejercicio 3: indicar si un numero entero es par o impar
    public static void ejercicio3() {
        System.out.print("Digite un numero entero: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }

    // Ejercicio 4: indicar si un numero es par-positivo, par-negativo, impar-positivo o impar-negativo
    public static void ejercicio4() {
        System.out.print("Digite un numero entero: ");
        int numero = teclado.nextInt();

        if (numero > 0 && numero % 2 == 0) {
            System.out.println("El numero es par-positivo.");
        } else if (numero < 0 && numero % 2 == 0) {
            System.out.println("El numero es par-negativo.");
        } else if (numero > 0 && numero % 2 != 0) {
            System.out.println("El numero es impar-positivo.");
        } else if (numero < 0 && numero % 2 != 0) {
            System.out.println("El numero es impar-negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
    }

    // Ejercicio 5: calcular la edad a partir de la fecha de nacimiento
    public static void ejercicio5() {
        System.out.print("Digite el año de nacimiento: ");
        int anio = teclado.nextInt();

        System.out.print("Digite el mes de nacimiento: ");
        int mes = teclado.nextInt();

        System.out.print("Digite el dia de nacimiento: ");
        int dia = teclado.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();

        int edad = Period.between(fechaNacimiento, fechaActual).getYears();

        System.out.println("La persona tiene " + edad + " años.");
    }
    // Ejercicio 6: indicar el operador movil segun el numero de telefono
    public static void ejercicio6() {
        System.out.print("Digite el numero de telefono (10 digitos): ");
        String numero = teclado.next();
        String prefijo = numero.substring(0, 3);

        String operador = switch (prefijo) {
            case "313", "320", "312" -> "Claro";
            case "305", "315" -> "Movistar";
            case "301", "304", "317", "318", "319" -> "Tigo";
            case "350", "351" -> "WOM";
            default -> "Operador no identificado";
        };

        System.out.println("El operador movil es: " + operador);
}
    // Ejercicio 7: intercambiar el valor de 2 numeros enteros
    public static void ejercicio7() {
        System.out.print("Digite el primer numero: ");
        int a = teclado.nextInt();
        System.out.print("Digite el segundo numero: ");
        int b = teclado.nextInt();

        System.out.println("Antes del intercambio: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Despues del intercambio: a = " + a + ", b = " + b);
    }
    // Ejercicio 8: generar un numero aleatorio entre 50 y 70
    public static void ejercicio8() {
        Random random = new Random();
        int numero = random.nextInt(70 - 50 + 1) + 50;

        System.out.println("El numero aleatorio generado es: " + numero);
    }
    // Ejercicio 9: indicar la generacion segun la edad
    public static void ejercicio9() {
        System.out.print("Digite la edad en anios: ");
        int edad = teclado.nextInt();

        if (edad >= 0 && edad <= 3) {
            System.out.println("Pertenece a la generacion: Bebe");
        } else if (edad >= 4 && edad <= 8) {
            System.out.println("Pertenece a la generacion: Niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Pertenece a la generacion: Adolescente");
        } else if (edad > 17) {
            System.out.println("Pertenece a la generacion: Adulto");
        } else {
            System.out.println("Rango de edad no definido en la tabla (9 a 12 anios).");
        }
    }
    // Ejercicio 10: obtener el IVA de una venta y aplicar el descuento correspondiente
    public static void ejercicio10() {
        final double IVA = 0.19;

        System.out.print("Digite el valor de la venta: ");
        double venta = teclado.nextDouble();

        double valorIva = venta * IVA;
        double descuento;

        if (venta > 150000) {
            descuento = venta * 0.25;
        } else {
            descuento = venta * 0.10;
        }

        double totalPagar = venta + valorIva - descuento;

        System.out.println("Valor de la venta: " + venta);
        System.out.println("IVA (19%): " + valorIva);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Total a pagar: " + totalPagar);
    }
}







