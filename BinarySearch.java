import java.util.*;                     //@BhanuPrakash.E_724
public class BinarySearch {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array :");     //Specifying Size of data
        n = sc.nextInt();
        
        System.out.print("\n Enter values in Ascending Order:");         //Inputing values into the Array
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

        BinarySearch obj = new BinarySearch();              //Creating Class Object for calling Binarsrch method
        obj.BinarySrch(arr,ele,n);                         //Calling Method 

        int result = obj.BinarySrch(arr,ele,n);             //Receiving data from called method              
        if(result==-1) {
            System.out.println("Element is not found in the list...!");
        }
    }

    int BinarySrch(int[] arr , int ele , int n) {
        int first = 0,last = n;
        int mid = (first+last)/2;
        for(int i=0;i<arr.length;i++){
            if(ele<arr[mid]){
                last = mid;
                mid = (first+last)/2;
            }
            else if(ele>arr[mid]) {
                first = mid;
                mid = (first+last)/2;
            }
            else if(arr[mid]==ele) {
                System.out.println(ele+" is found at "+mid+" - position of array");
                break;
            }
            else {
                System.out.println("");
            }
        }
        return -1;
    }

}