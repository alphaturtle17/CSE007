import java.util.Arrays;
public class t2 {
    public static void main(String args[]){
        int [][] gradesArray = {{87,96,70},
                                {68,87,90},
                                {94,100,90},
                                {100,81,82},
                                {83,65,85},
                                {78,87,65},
                                {85,75,83},
                                {91,94,100},
                                {76,72,84},
                                {87,93,73}};
        System.out.println(arSort(gradesArray));

    }
    public static int [][] arSort(int [][] arr){

        for(int i = 0; i < arr.length-1; i++){
            for(int k = 0; k < arr[i].length; k++){
                int mIn = i;
                for(int j = i+1; j < arr[i].length; j++){
                    if(arr[i][j] < arr[i][mIn]){
                        mIn = j;
                    }
                }
                int temp = arr[i][mIn];
                arr[mIn] = arr[i];
                arr[i][k] = temp;
            }

        }
        return arr;
    }
}
