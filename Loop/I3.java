class I3{
    public static void main(String[]args){
        for( ; ; ){
            System.out.println("hiii");
            break;
        }

        boolean res = true;
        for( ; res ; ){
            System.out.println("How are you?");
            res = false;
        }

        for( ; true ; ){
            System.out.println("Bye Bye");
            System.exit(0);
        }
    }
}
