public class Dog extends Animal{
    String breed;
    public Dog(){
        breed = "";
        System.out.println("In Dog -- No Arg Constructor");
    }
    public Dog(double height, double weight, String breed){
        super(height, weight);
        this.breed = breed;
        System.out.println("In Dog -- 3-Arg Constructor");
    }
    public void bark(){
        System.out.println("Woof!");
    }
    public void bark(int n){
        for(int i=0; i<n; i++){
            this.bark();}
    }
    @Override
    public void eat(){
        System.out.println("Who wants a treat?!");}
  
    public void play(){
        System.out.println("Let's play fetch!");}
 }