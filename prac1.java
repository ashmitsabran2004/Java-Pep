import java.util.Scanner;

class Details{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = s.nextLine();
        System.out.println("Enter the age: ");
        int age = s.nextInt();
        s.nextLine();
        System.out.println("Enter the balance: ");
        double balance = s.nextDouble();
        s.nextLine();
        System.out.println("Enter the college name: ");
        String college = s.nextLine();


        System.out.println("User's name: " +name);
        System.out.println("User's age: " +age);
        System.out.println("User's bank balance: " +balance);
        System.out.println("User's college name: " +college);


    }
}
