import java.util.Scanner;

public class ExistTriangle {
    private double a,b,c;
    private boolean isNum;

    public void Option1(){

        Scanner input = new Scanner (System.in);

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

        ExistTriangle eT = new ExistTriangle();

        if (eT.isTriangleexist(a,b,c)){
            System.out.println("Sides entered can form a triangle!");
        }else System.out.println("Sides entered cannot form a triangle!");

    }

    public boolean isTriangleexist(double a, double b, double c){
        if ( (a + b) >  c &&  (b + c) > a && (c + a) > b){
            return true;
        }else {
            return false;
        }
    }
    }
