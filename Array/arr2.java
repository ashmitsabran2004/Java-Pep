import java.util.Arrays;
class arr2{
    public static void main(String[]args){
        int arr[]={1,2,3,4};
        for(int i=0; i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n----------------------");
        System.out.println(Arrays.toString(arr));
    }
}
