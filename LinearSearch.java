import java.util.*;                     //@BhanuPrakash.E_724
public class LinearSearch {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array :");     //Specifying Size of data
        n = sc.nextInt();
        
        System.out.print("\n Enter values :");         //Inputing values into the Array
        int[] arr = new int[n];
        for (int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\n List of "+n+" data is :");    //Printing Entered list of data
        System.out.print("{");
        for (int i : arr) {
            System.out.print(" "+i+" ");
        }
        System.out.println("}");

        System.out.println("Enter the element to be searched : ");      //Entering element to be searched
        int ele = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {                 //Logic of LinearSearch
            if(arr[i] == ele) {
                System.out.println(ele+" is found at "+i+" - position in array");
                break;
            }
            else if (i==arr.length-1) {                        //even after checking the last element we print it as not found
                System.out.println("Element not found in this list....! Try Another element..!");
            }
        }

    }
}
