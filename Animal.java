public class Animal{
    double height;
    double weight;
    public Animal(){
        this(0,0);
        System.out.println("In Animal -- No Arg Constructor");
    }
    public Animal (double height, double weight){
        this.height = height;
        this.weight = weight;
        System.out.println("In Animal -- 2-Arg Constructor");
    }
    public void eat(){
        System.out.println("Nom Nom Nom");}
 }