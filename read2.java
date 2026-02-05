import java.util.Scanner;
class Read{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter user data");
        short s1 = s.nextByte();
        int i = s.nextByte();
        float f = (float)s.nextDouble();
        double d = s.nextByte();
        byte b = (byte)d;
        System.out.println(s1+"\n"+i+"\n"+f+"\n"+d+"\n"+b);
    }
}

