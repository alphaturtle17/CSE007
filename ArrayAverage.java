/*
Thor Long
CSE 007
2/28/2022
Array average is generating and assigning numbers from 1-20 to an array
and finding its' average.
*/
public class ArrayAverage{
    public static void main(String args[]){
        int [] numArray = new int[10];
        int max;
        int min;
        double sum = 0.0;
        double avg = 0.0;
        for(int i = 0; i < numArray.length; i++){
            int num = (int)(Math.random()*19 + 1);
            numArray[i] = num;
        }

        min = numArray[0];
        max = numArray[0];

        for(int j: numArray){
            sum += j;
            if(j >= max){
                max = j;
            }else if(j <= min){
                min = j;
            }
        }
        avg = sum / numArray.length; //This is float division since sum is already a double
        System.out.println("The biggest number in the array is " + max);
        System.out.println("The smallest number in the array is " + min);
        System.out.println("The average number of the array is " + avg);
    }
}