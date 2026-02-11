class Calci{
    //Constructor Overloading
    Calci(){

    }
    Calci(int a){

    }
    Calci(double b){

    }
    Calci(int a, double b){
        System.out.println(a+" "+b);
    }
    Calci(double a, int b){
        System.out.println(a+" "+b);
    }
    public static void main(String[]args){
        //Calci c1 = new Calci(100, 200);//Ambiguity(confusion)
        Calci c1 = new Calci(100.0, 200);
        Calci c2 = new Calci(100, 200.0);
    }
}
