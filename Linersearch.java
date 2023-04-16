public class Linersearch {
//Store the value in variable

private static int[] arr;
//check whether the array element == to the value of te variable
//If yes then display
public static int method1(int[] arr, int value){
    //Traverse the array
    for (int i=0; i<=arr.length-1; i++){
        if(arr[i]==value){
            System.out.println("Item found"+arr[i]);
            return i;

        }
        
    }
    return -1;
  

}
   public static void main(String[] args) {
    int[] arr1={5,4,3,2,8,7,6};
    int value=6;
  
    System.out.println("the value found out at index:" +method1(arr1, value));
   } 
}