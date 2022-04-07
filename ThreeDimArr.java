/*
Thor Long
4/6/2022
CSE 007
Three dimentional arrays that make the ragged ararys and assigns double values to it
*/
import java.util.Random;
import java.util.Arrays;
public class ThreeDimArr {
    public static void main(String args[]){
        Random rand = new Random();

        double [][][] arrSet = createRandom3D(3, rand);
        assign(arrSet, rand);
        printArray(arrSet);
        System.out.println("Index at: " + Arrays.toString(findSmallest(arrSet)));
        System.out.println("Index at: " + Arrays.toString(findLargest(arrSet)));
        findLongest(arrSet);
        largestAvg(arrSet);
    }   
    /*
    Generates an integer within a range
    Pre: Input range
    Post: Return int value
    */
    public static int getInt(int integer, Random rand){
        integer = rand.nextInt(integer);
        return integer;
    }
    /*
    Creates a random 3D array
    Pre: sets is the amount of sets, random must be declared 
    Post: returns empty array
    */
    public static double [][][] createRandom3D(int sets, Random rand){
        int row = getInt(10, rand);
        int col = getInt(10, rand);
        double [][][] arrSet = new double[sets][row][col];
        return arrSet;
    } 
    /*
    @param arrSet type int[][][]
    @return arrSet[][][] ???? I really don't know how to pre/post condition
    */
    public static double [][][] assign(double [][][] arrSet, Random rand){
        for(int sets = 0; sets < arrSet.length; sets++){
            for(int row = 0; row < arrSet[sets].length; row++){
                for(int col = 0; col < arrSet[sets][row].length; col++){
                    double random = Math.random() * 10 + 1;
                    double n = 0;
                    n = random;
                    n = n * Math.pow(10, 2);
                    n = Math.floor(n);
                    n = n / Math.pow(10, 2);
                    arrSet[sets][row][col] = n;
                }
            }
        }        
        return arrSet;
    }
    /*
    @param list
    */
    public static void printArray(double [] [] [] list){
        for(int depth = 0; depth < list.length; depth ++){
            for(int row = 0; row < list[depth].length; row++){
                for(int col = 0; col< list[depth][row].length; col++){
                    double n = list[depth][row][col];
                  //  n = n * Math.pow(10, 2);
                   // n = Math.floor(n);
                   // n = n / Math.pow(10, 2);
                    System.out.print(n + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    /*
    @param ??
    */
    public static int [] findSmallest(double [] [] [] list){
        double smallest = list[0][0][0];
        int [] result = new int[3];
        int d = 0;
        int r = 0;
        int c = 0;
        for(int depth = 0; depth < list.length; depth ++){
            for(int row = 0; row < list[depth].length; row++){
                for(int col = 0; col< list[depth][row].length; col++){
                    if(list[depth][row][col] < smallest){
                        smallest = list[depth][row][col];
                        d = depth;
                        r = row;
                        c = col;
                    }
                }
            }
        }
        result[0] = d;
        result[1] = r;
        result[2] = c;
        return result;
    }
        /*
    @param 
    @return largest double value index
    */
    public static int [] findLargest(double [] [] [] list){
        double smallest = list[0][0][0];
        int [] result = new int[3];
        int d = 0;
        int r = 0;
        int c = 0;
        for(int depth = 0; depth < list.length; depth ++){
            for(int row = 0; row < list[depth].length; row++){
                for(int col = 0; col< list[depth][row].length; col++){
                    if(list[depth][row][col] > smallest){
                        smallest = list[depth][row][col];
                        d = depth;
                        r = row;
                        c = col;
                    }
                }
            }
        }
        result[0] = d;
        result[1] = r;
        result[2] = c;
        return result;
    }
    /*
    @param var list
    @return nothing
    */
    public static void findLongest(double [][][] list){
        System.out.println(list[0][0]);
    }
    /*
    @param list type double[][][]
    @return na print largest average value from list
    */
    public static void largestAvg(double [][][] list){
        double [] results = new double[3];
        double average;
        double counter = 0;
        double largest = 0;
        int d = 0;
        int r = 0;
        for(int depth = 0; depth < list.length; depth ++){
            for(int row = 0; row < list[depth].length; row++){
                for(int col = 0; col< list[depth][row].length; col++){
                    counter += list[depth][row][col];
                }
                average = counter / list[depth].length;
                if(average > largest){
                    largest = average;
                    d = depth;
                    r = row;
                }
                average = 0;
            }
        }        
        largest = largest * Math.pow(10, 2);
        largest = Math.floor(largest);
        largest = largest / Math.pow(10, 2);
        results[0] = largest;
        results[1] = d; //what set
        results[2] = r; //what row is largest avg
        System.out.println(Arrays.toString(results));
    }
}
