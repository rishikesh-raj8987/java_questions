import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your current salary:- ");
        int salary = input.nextInt();

        if(salary >= 30000){
            salary = salary + 2000;
        }
        else {
            salary = salary + 1000;
        }
        System.out.println("Salary after bonus is " + " "+ salary );
    }
}
