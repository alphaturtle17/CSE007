import java.util.Random;
import java.util.Arrays;
public class PracticeComp{
    public static void main(String[]args){
        Random rand = new Random();
        Animal [][] list = new Animal[3][15];
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[0].length; i++){
                switch(i){
                    case 0:
                        list[0][j] = new Animal(rand.nextInt(25), rand.nextInt(100));
                        break;
                    case 1:
                        list[1][j] = new Dog(rand.nextInt(25), rand.nextInt(50), "Mutt");
                        break;
                    case 2:
                        list[2][j] = new RescueDog("10312022", "Mutt");
                        break;
                }
            }
        }
        double totalAHeight = 0;
        double totalAWeight = 0;
        double totalDHeight = 0;
        double totalDWeight = 0;
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[i].length; j++){
                System.out.print(list[i][j] + ", ");
                totalAHeight += list[0][j].height;
                totalAWeight += list[0][j].weight;
                totalDHeight += list[1][j].height;
                totalDWeight += list[1][j].weight;
            }
            System.out.println();
        }
        double avgAH = totalAHeight / list[0].length;
        double avgAW = totalAWeight / list[0].length;
        double avgDH = totalDHeight / list[1].length;
        double avgDW = totalDWeight / list[1].length;
        System.out.println("Total Animal Height: " + totalAHeight + " Total Animal Weight: " + totalAWeight);
        System.out.println("Total Dog Height: " + totalDHeight + " Total Dog Weight: " + totalDWeight);
        System.out.println("Average Animal Height: " + avgAH + " Average Animal Weight:" + avgAW);
        System.out.println("Average Dog Height: " + avgDH + " Average Dog Weight: " + avgDW);
    }
}
 