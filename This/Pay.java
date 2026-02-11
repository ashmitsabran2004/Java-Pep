class Pay{
    double avl_bal;
    String holderName;

    public Pay(double x){
        avl_bal = x;
    }

    public Pay(String holderName)//holdernName="sheela";
    {
        //this.attribute = LocalVar;
        this.holderName=holderName;
    }

    public static void main(String[]args){
        Pay p1 = new Pay(100.0);
        System.out.println(p1.avl_bal);//100.0

        Pay p2 = new Pay("Sheela");
        System.out.println(p2.holderName);//sheela
    }
}
