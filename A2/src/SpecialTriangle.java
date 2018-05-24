import java.lang.Math;
import java.util.Scanner;

public class SpecialTriangle {
    private double a, b, c;
    private boolean isNum;

    public void Option2() {

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

        if (a == b && b == c) {
            System.out.println("It is an equilateral triangle!");
        } else if (a == b || b == c || c == a) {
            System.out.println("It is an isosceles triangle!");
        } else System.out.println("It is an scalene triangle!");

        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
            System.out.println("It is a right-angled triangle!");
        }
    }
}
