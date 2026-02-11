class Main1{
    public static void main(String[]args){
        System.out.println("Main Starts");
        demo(); //method call statement -> caller method
        demo1(); // no method no calling
        System.out.println("Main Ends");
    }
    public static void demo(){
        System.out.println("Demo() method");
    }
}
