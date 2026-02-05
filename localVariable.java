class lv1 {
    public static void main(String[] args) {
        System.out.println(a); //Compile time error
        int a;
    }
}

class lv2 {
    public static void main(String[] args) {
        int a;
        System.out.println(a); //CTE
    }
}


class lv3 {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int x,y,z;
        x=y=z=40;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}


class lv4 {
    public static void main(String[] args) {
        System.out.println("Main Start");
        int x;
        {
            System.out.println("inner start");
            // int a=100;

            x=1000;
            System.out.println("Inner Ends");
        }
        // System.out.println(a);
        System.out.println(x);
        System.out.println("Main ends");
    }
}
