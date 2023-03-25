package app;

public class Helper {

    public static void displayInfo(String sectionName){
        System.out.println();
        System.out.println("======================================");
        System.out.println("DISPLAYINFO FROM HELPER CLASS");
        System.out.println("======================================");
    }
public static void complexArea(int circleMultiplier, int rectangleMultiplier, int triangleMultiplier){

        double results = (circleMultiplier * Controller.calculateAreaOfCircle(10.7)) + (rectangleMultiplier * Controller.calculateAreaOfRectangle(14.2, 20.7)) + (triangleMultiplier * Controller.calculateAreaOfTriangle(33.2, 16.2));
        System.out.println();
        System.out.println();
        System.out.println("===============================================");
        System.out.println("COMPLEXAREA FROM HELPER CLASS");
        System.out.println("===============================================");
        System.out.printf("Results: \t\t\t\t%.3f", results);
        System.out.printf("\ncircleMultiplier: \t\t%d", circleMultiplier);
        System.out.printf("\nrectangleMultiplier: \t%d", rectangleMultiplier);
        System.out.printf("\ntriangleMultipler: \t\t%d", triangleMultiplier);



}
}









