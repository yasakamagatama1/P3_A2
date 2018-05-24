import java.lang.Math;
import java.util.Scanner;

public class hypotenuseTringle {
    private double a, b;
    private boolean isNum;

    public void Option3() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 sides of the triangle:");
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


        System.out.println("The hypotenuse of this triangle is:" + (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))));


    }
}
