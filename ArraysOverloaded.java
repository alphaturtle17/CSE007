/*
Thor Long
Lab 8
4/4/2022
VS Code
The objective of this is just to overload arrays and to see how the different forms of arrays can be formatted and all, making methods and so
*/
import java.util.Arrays;
public class ArraysOverloaded{
    public static void main(String[] args){
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        int [] arr2 = {2,4,6,8,10};
        int [] arr3 = {2,4,6,8,10};
        boolean truth = equals(arr1,arr2);
        System.out.println(truth);
        truth = equals(arr2,arr3);
        System.out.println(truth);
        int [] [] arr4 = {{1,2,3,4,5,6,7,8,9},{2,4,6,8,10}};
        int [] [] arr5 = {{1,2,3,4,5,6,7,8,9},{2,4,6,8,10}};
        int [] [] arr6 = {{1,2,3,4,5},{2,4,6,8,10}};
        truth = equals(arr4,arr5);
        System.out.println(truth);
        truth = equals(arr4,arr6);
        System.out.println(truth);
        int [] joinArr1 = join(arr1,arr2);
        System.out.println(Arrays.toString(joinArr1));
        int [] [] joinArr2 = join(arr4,arr5);
        System.out.println(Arrays.deepToString(joinArr2));
        System.out.println(indexOf(arr1, 9));
        System.out.println(elementAt(arr1, 0));

    }
    /*
    Method that returns the integer found at an index
    Preconditions: list must be a one dimentional array, index <= list.length
    Postconditions: Returns an int, or -1
    */
    public static int elementAt(int [] list, int index){
        int numFound = -1;
        for(int i = 0; i < list.length; i++){
            if(index == i){
                numFound = list[index];
                break;
            }
        }
        return numFound;
    }
    /*
    Method that returns the integer found at an index
    Preconditions: list must be a two dimentional array
    Postconditions: Returns the number found at a index from an array
    */
    public static int elementAt(int [][] list, int [] index){
        int numFound = -1;
        for(int row = 0; row < list.length; row++){
            for(int col = 0; col < list[row].length; col++){
                if(list[row][col] == list[index]){

                }
            }
        }
        return numFound;
    }
    /*
    Method appends list1 and list2 into a single array
    Preconditions: list1 and list2 must be two dimentional arrays of ints
    Postconditions: Returns int [][] list3 that contains list1 and list2 in a single array
    */
    public static int [] [] join(int [][] list1, int [][] list2 ){
        int [] [] list3 = new int[list1.length][];
        for(int row = 0; row < list3.length;row++){
            list3[row] = new int[list1[row].length+ list2[row].length];
            int index;
            for(index = 0; index< list1[row].length; index++){
                list3[row][index] = list1[row][index];
            }
            for(int index2 = 0; index2 < list2[row].length; index2++, index++){
                list3[row][index] = list2[row][index2];
            }
            }
            return list3;
        }
    /*
    Method that finds the index of a number in a one dimentional array
    Preconditions: list1 must be a single dimentional array, num must be an int
    Postcondition: Returns int, -1 if not found
    */
    public static int indexOf(int [] list1, int num){
        int index1 = -1;
        for(int index = 0; index < list1.length; index++){
            if(list1[index] == num){
                return index;
            }
        }
        return index1;
    }
    /*















    
    */
    public static int indexOf(int [][] list1, int [] num){
        int index1 = -1;
        for(int index = 0; index < list1.length; index++){
            if(list1[index] == num){
                return index;
            }
        }
        return index1;
    }
    /*
    Method appends list1 and list2 into a single array
    Preconditions: list1 and list2 must be one dimentional arrays of ints
    Postconditions: Returns int [] list3 that contains list1 and list2 in a single array
    */
    public static int [] join(int [] list1, int[] list2){
        int [] list3 = new int[list1.length+list2.length];
        for(int index = 0; index < list3.length; index++){
            if(index < list1.length){
                list3[index] = list1[index];
            }
            else
                list3[index] = list2[index - list1.length];
        }
        return list3;
    }
    /*
    Method that returns boolean value if multidimentional arrays are identical
    Preconditions: list1 and list2 must be two dimentional arrays of ints.
    Postconditions: Return true/false
    */
    public static boolean equals(int [] [] list1, int [] [] list2){
        if(list1.length != list2.length){
            return false;
        }
        else {
            for(int row = 0; row < list1.length; row++){
                if(list1[row].length!= list2[row].length){
                    return false;
                }
                else{
                    for(int col = 0; col < list1[row].length; col++){
                        if(list1[row][col] != list2[row][col]){
                            return false;
                        }
                    }
                }
            }
        }

            return true;
        }   
    public static boolean equals(int [] arr1, int [] arr2){
        /*
        Method that returns boolean value if arrays are identical
        Preconditions: list1 and list2 must be one dimentional arrays of ints.
        Postconditions: Return true/false
        */        
        if(arr1.length != arr2.length){
            return false;
        }
        else{
            for(int index = 0; index < arr1.length; index++){
                if(arr1[index] != arr2[index]){
                    return false;
                }
            }
        }
        return true;
        }
}