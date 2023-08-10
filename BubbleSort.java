import java.util.Arrays;
import java.util.*;

public class BubbleSort{
    /*public static void main(String[] args) {
        //int[] arr = {5,4,3,2,1};
        
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=0;j<arr.length-1;j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array :");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }*/

    public static void main(String[] args) {
        int temp,size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter values of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("***Entered List is****");
        for (int i : arr) {
            System.out.print(i+" ");
        }   
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr[j],arr[j+1]);
                }
            }
        }
        System.out.println("*********Sorted List*******");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }    
    
    int swap(int[] i,int[] j) {
        int temp;
        temp = i;
        i = j;
        j = temp;
        return new swap(i,j);
    }
}