import java.lang.Math;
import java.util.Scanner;

public class aandpTriangle {
    private double a, b, c;
    private boolean isNum;

    public void Option4() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 sides of the triangle:");
        this.a = input.nextDouble();
        do{
            if ((a>0)){
                isNum =true;
            }else{
                System.out.println("Sides must be a positive number");
                isNum=false;
                this.a = input.nextDouble();
            }
        }while (!(isNum));


        this.b = input.nextDouble();
        do{
            if ((b>0)){
                isNum =true;
            }else{
                System.out.println("Sides must be a positive number");
                isNum=false;
                this.b = input.nextDouble();
            }
        }while (!(isNum));

        this.c = input.nextDouble();
        do{
            if ((c>0)){
                isNum =true;
            }else{
                System.out.println("Sides must be a positive number");
                isNum=false;
                this.c = input.nextDouble();
            }
        }while (!(isNum));

        double P = (a + b + c) / 2;

        System.out.println("The perimeter of the triangle is:" + P);

        System.out.println("The area of the triangle is " + (Math.sqrt(P * (P - a) * (P - b) * (P - c))));
    }
}
