import java.util.Scanner;
class Ques2{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        System.out.println("Enter the number: "+num);
        for(int i = 1; i <= 1; i++){
            if(num >=1 && num <=26){
                char ch = (char)('A' + num - 1);
                System.out.println(num+ " = "+ch);
            }
            else{
                System.out.println("Out of Bound");
            }
            break;
        }
    }
}
