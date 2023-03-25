package app;

public class Controller {

    //------------------------------------------------
    // beginning of main(String[] args)) method

    public static void main(String[] args) {

        yourInfoHeader();
        displayHeaderForPartA("Section Lab3a");
        double radius = 8.25;
        double area = calculateAreaOfCircle(radius);
        displaySingleResult(area, "calculateAreaOfCircle");
        int value1 = 5;
        double value2 = 59.5;
        multipleNumbersIntAndDouble(value1, value2);
        calculateAreaOfTriangleWithOutput(36.3, 18.2);
        calculateAreaOfTriangle(17.16332, 20.172391);
        calculateAreaOfRectangle(20.172391, 20.51723);
        Helper displayInfo = new Helper();
        displayInfo.displayInfo("");
        double result = calculateAreaOfCircle(9.3) + calculateAreaOfRectangle(9.4, 17.2) + calculateAreaOfTriangle(21.5, 10.3);
        System.out.printf("\nValue of result: \t\t%10f", result);

        Helper.complexArea(4, 12,5);






    }

    //--------------------------------------------------------------
    // beginning of yourInfoHeader() method

    public static void yourInfoHeader() {

        System.out.println("===============================================");
        System.out.println("PROGRAMMER: " + "Lielle Sasson");
        System.out.println("PANTHER ID: " + "6304972");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210 ");
        System.out.println("SECTION: \t " + "UO1");
        System.out.println("SEMESTER: \t " + "Spring 2022");
        System.out.println("CLASSTIME: \t " + "T/TH 9:30-12:15");
        System.out.println();
        System.out.println("Assignment: " + "Lab3a");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("===============================================");
        System.out.println();

    }//end yourInfoHeader
public static void displayHeaderForPartA(String sectionName){
        System.out.println();
        System.out.println();
        System.out.println("======================================");
        System.out.println(sectionName);
        System.out.println("======================================");
    }

    public static double calculateAreaOfCircle(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static void displaySingleResult(double value, String methodName){
        System.out.println();
        System.out.println("======================================");
        System.out.println(methodName);
        System.out.println("======================================");

        System.out.printf("Value: \t\t\t%10.4f", value);
    }

    public static void multipleNumbersIntAndDouble(int firstNumber, double secondNumber){
        double result = firstNumber * secondNumber;

        System.out.println();
        System.out.println();
        System.out.printf("Running multipleNumbersIntAndDouble -> %d, %.1f", firstNumber, secondNumber);
        System.out.printf("\n\tfirstNumber: \t\t%d", firstNumber);
        System.out.printf("\n\tsecondNumber: \t\t%.1f", secondNumber);
        System.out.printf("\n\tresult: \t\t\t%.1f", result);
    }

    public static void calculateAreaOfTriangleWithOutput(double base, double height){
        double areaOfTriangle = (base * height / 2);
        displaySingleResult(areaOfTriangle, "calculateAreaOfTriangleWithOutput");
    }

    public static double calculateAreaOfTriangle(double base, double height){
        double calculateAreaOfTriangle = (base * height / 2);
        System.out.println();
        System.out.printf("\nTriangle info-> \t\tbase: %.3f\t\theight: %.5f\tarea: %.2f", base, height, calculateAreaOfTriangle);
        return calculateAreaOfTriangle;

    }

    public static double calculateAreaOfRectangle(double height, double width){
        double calculateAreaOfRectangle = height * width;
        System.out.printf("\nRectangle info-> \t\theight: %.4f\t\twidth: %.1f\t\t\tarea: %.5f", height, width, calculateAreaOfRectangle);
        return calculateAreaOfRectangle;
    }



}//end Controller


