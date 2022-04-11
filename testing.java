import java.util.Scanner;
import java.util.Arrays;
public class testing {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        int arr [] = {'H','E','L','L','O','o'};
        int arr2 [][] = {{1,2,3},{5,6,2}};

        //To print the memory reference of a two dimentional array, just print(arr[n] instead of arr[n][n] or Arrays.toString)
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }

        System.out.println(Arrays.toString(arr));
        
        //Print Stack
        System.out.println("Printing stack trace:");
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (int i = 1; i < elements.length; i++) {
            StackTraceElement s = elements[i];
            System.out.println("\tat " + s.getClassName() + "." + s.getMethodName() + "(" + s.getFileName() + ":" + s.getLineNumber() + ")");
        }

        // Get current size of heap in bytes
        long heapSize = Runtime.getRuntime().totalMemory(); 

        // Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
        long heapMaxSize = Runtime.getRuntime().maxMemory();

        // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
        long heapFreeSize = Runtime.getRuntime().freeMemory(); 

        System.out.println(heapSize);
        System.out.println(heapMaxSize);
        System.out.println(heapFreeSize);

        //Code for an insertion sort
        /*
        (insertion sort, swap each element with each other in order)
        2 0 1 3 9
        0 2 1 3 9
        0 1 2 3 9
        */
        /*
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
*/
        //Code for a selection sort
        /*
        Selection sort find smallest num, swap with that index
        3 9 0 2 1 5
        0 9 3 2 1 5
        0 1 3 2 9 5
        0 1 2 3 9 5
        0 1 2 3 5 9
        */
        for(int i = 0; i < arr.length; i++){
            int mIn = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[mIn]){
                    mIn = j;
                }
            }
            int temp = arr[mIn];
            arr[mIn] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
        
}