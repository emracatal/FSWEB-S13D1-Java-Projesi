import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------shouldWakeUp");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("----------hasTeen");
        System.out.println(hasTeen(9, 99, 18));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("-----------isCatPlaying");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("----------area rectangle");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter width:");
            double width = scanner.nextDouble();
            System.out.println("Enter height:");
            double height = scanner.nextDouble();
            System.out.println("rectangle area with user input " + area(width, height));
        } catch (Exception ex) {
            System.out.println("invalid input");
        }

        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        System.out.println("----------area circle");

        try{
            System.out.println("Enter radius:");
            double radius = scanner.nextDouble();
            System.out.println("circle area with user input " + area(radius));
        }catch(Exception ex){
            System.out.println("invalid input");
        }
        System.out.println(area(5.0));
        System.out.println(area(-1.0));
    }


    public static boolean shouldWakeUp(boolean isBarking, int time) {
        if (time < 0 || time > 24 || !isBarking) return false;
        return (time < 8 || time >= 20);
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return (age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer && temp > 25 && temp <= 45) {
            return true;
        } else if (!isSummer && temp > 25 && temp <= 35) {
            return true;
        } else {
            return false;
        }
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        } else {
            return width * height;
        }
    }

    public static double area(double radius) {
        if (radius < 0) return -1;
        return radius * radius * Math.PI;
    }

}
