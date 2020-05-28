import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String shape= scanner.nextLine();
        switch (shape){
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                System.out.println(areaOfTriangle(a,b,c));
                break;
            case "rectangle":
                double length = scanner.nextDouble();
                double breadth = scanner.nextDouble();
                System.out.println(areaOfRectangle(length,breadth));
                break;
            case "circle":
                double radius = scanner.nextDouble();
                System.out.println(areaOfCircle(radius));
                break;
             default:
                 break;



        }
    }
    public static double areaOfTriangle(double a,double b,double c){
        double area = 0;
        double s = (a + b + c)/2;
        area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
        return area;
    }
    public static double areaOfRectangle(double length, double breadth){
        double area = length*breadth;
        return area;
    }
    public static double areaOfCircle(double radius){
        double area = 3.14*radius*radius;
        return area;
    }
}