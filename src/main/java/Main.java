import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float sideOne, sideTwo, sideThree, angleOne, angleTwo, angleThree, angleSum, sideBC, sideAC, sideAB;
        String sideClassification,  angleClassification;

        System.out.println("Provide the triangle values: ");

        System.out.println("Side A:");
        sideOne = scan.nextFloat();

        System.out.println("Side B:");
        sideTwo = scan.nextFloat();

        System.out.println("Side C:");
        sideThree = scan.nextFloat();

        System.out.println("Angle A:");
        angleOne = scan.nextFloat();

        System.out.println("Angle B:");
        angleTwo = scan.nextFloat();

        System.out.println("Angle C:");
        angleThree = scan.nextFloat();

        // unnecessary variables?
        angleSum = angleOne + angleTwo + angleThree;
        sideAB = sideOne + sideTwo;
        sideAC = sideOne + sideThree;
        sideBC = sideTwo + sideThree;

        if ((angleSum == 180) && (sideAB > sideThree) && (sideAC > sideTwo) && (sideBC > sideOne)){
            System.out.println("possible");
        } else {
            System.out.println("That's not a triangle");
            return;
        }

        // sidesClassification
        if (sideOne == sideTwo && sideTwo == sideThree) {
            sideClassification = "Equilateral";
        } else if (sideOne != sideTwo && sideOne != sideThree && sideTwo != sideThree) {
            sideClassification = "Scalene";
        } else {
            sideClassification = "Isosceles";
        }


        // angleClassification
        if ((angleOne == 90 || angleTwo == 90 || angleThree == 90)) {
            angleClassification = "Right";
        } else if ((angleOne > 90 || angleTwo > 90 || angleThree > 90)) {
            angleClassification = "Obtuse";
        } else {
            angleClassification = "Acute";
        }

        System.out.println("Your triangle is: " + sideClassification + " " + angleClassification + ".");
    }
}
/*
Instrucciones:

Escribe un programa en Java que sea de capaz clasificar un triángulo tanto
por la medida de sus lados como por la medida de sus ángulos, simultáneamente.
Para esto considera lo siguiente:

Deberás solicitar al usuario que ingrese los 6 valores del supuesto triángulo.
El programa deberá ser capaz de identificar si los valores ingresados por el
usuario realmente pueden formar un triángulo o no, mostrando en pantalla el
error si es imposible formar un triángulo.

Se deberá mostrar en pantalla el tipo de triangulo que es, en ambas clasificación
(e. g. triángulo rectángulo isósceles).
*/