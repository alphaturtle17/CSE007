/*
Thor Long
1/28/2022
CSE 007: Lab 1
Converting 150.32 pounds to kilograms
Coded on VS Code
*/
public class ConvertWeight {
    public static void main(String args[]){
        final double kgPerPound = 0.45359237;
        double weightInPounds = 150.32;
        double weightInKilograms;

        weightInKilograms = kgPerPound * weightInPounds;

        System.out.println(weightInPounds + " pounds is equal to " + weightInKilograms + " kilograms");
    }
}
