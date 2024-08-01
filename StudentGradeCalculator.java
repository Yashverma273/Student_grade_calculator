import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float English;
        float Hindi;
        float Maths;
        float Science;
        float Social;

        System.out.println("Enter English marks: ");
        English = sc.nextInt();

        System.out.println("Enter Hindi marks: ");
        Hindi = sc.nextInt();

        System.out.println("Enter Maths marks: ");
        Maths = sc.nextInt();

        System.out.println("Enter Science marks: ");
        Science = sc.nextInt();

        System.out.println("Enter Social marks: ");
        Social = sc.nextInt();

        float totalmarks = English + Hindi + Maths + Science + Social;
        float Percentage = totalmarks / 5;

        if (English <= 100 && Hindi <= 100 && Maths <= 100 && Science <= 100 && Social <= 100) {
            if (Percentage >= 90 && Percentage <= 100) {
                System.out.println("Total marks" + " " + totalmarks+"/500");
                System.out.println("Percentage" + " " + Percentage);
                System.out.println("Grade" + " " + "A+");
            } else if (Percentage >= 60 && Percentage <= 89) {
                System.out.println("Total marks" + " " + totalmarks+"/500");
                System.out.println("Percentage" + " " + Percentage);
                System.out.println("Grade" + " " + "A");
            } else if (Percentage >= 35 && Percentage <= 59) {
                System.out.println("Total marks" + " " + totalmarks+"/500");
                System.out.println("Percentage" + " " + Percentage);
                System.out.println("Grade" + " " + "B");
            } else {
                System.out.println("Total marks" + " " + totalmarks+"/500");
                System.out.println("Percentage" + " " + Percentage);
                System.out.println("Grade" + " " + "Fail");
            }
        } else {
            System.out.println("Invalid Marks");
        }
    }
}