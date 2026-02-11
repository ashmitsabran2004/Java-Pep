class A{
    //this() call statement
    A(){
        System.out.println("Empty Constructor");
    }
    A(int a){
        this();
        System.out.println(a);
    }
    A(int a, int b){
        this(a);
        System.out.println(b);
    }
    public static void main(String[]args){
        new A(10,20);
    }
}
