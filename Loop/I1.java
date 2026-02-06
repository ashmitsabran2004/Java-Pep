class I1{
    public static void main(String[]args){
        do{
            System.out.println("Hello");
            //System.exit(0); Unreachable statement error
            break;
        }
        while(true);

        boolean res = true;
        do{
            System.out.println("hi");
            res = false;
        }

        while(res);

        do{
            System.out.println("Good Morning");
            System.exit(0);//always used in the last to stop the loop
        }
        while(true);
    }
}
