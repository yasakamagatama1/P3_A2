import java.util.Scanner;

public class TriangleSoftware {
    public static void main(String[] args) {
        // Local variable
        Scanner input = new Scanner(System.in);
        int Choice;
        ExistTriangle eT = new ExistTriangle();
        SpecialTriangle sT = new SpecialTriangle();
        hypotenuseTringle hT = new hypotenuseTringle();
        aandpTriangle aT = new aandpTriangle();

        // Display menu graphics
        while (true) {
            System.out.println("|   Options:                                        |");
            System.out.println("|   1. Check the triangle's existence.              |");
            System.out.println("|   2. Check the triangle's speciality.             |");
            System.out.println("|   3. Find the hypotenuse of the triangle.         |");
            System.out.println("|   4. Find the area and perimeter of the triangle. |");
            System.out.println("|   5. Exit                                         |");
            System.out.println("=====================================================");

            System.out.print("Choose:");

            Choice = input.nextInt();

            // Switch construct


            switch (Choice) {
                case 1:
                    eT.Option1();
                    break;
                case 2:
                    sT.Option2();
                    break;
                case 3:
                    hT.Option3();
                    break;
                case 4:
                    aT.Option4();
                    break;
                case 5:
                    System.out.println("Exit selected");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
                // }
            }
        }
    }
}
