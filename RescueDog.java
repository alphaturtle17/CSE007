public class RescueDog extends Dog{
    String gotchaDate;
    public RescueDog(){
        super();
        gotchaDate = "N/A";
        System.out.println("In RescueDog -- No Arg Constructor");
    }
    public RescueDog(String gotchaDate, String breed){
        super.breed = breed;
        this.gotchaDate=gotchaDate;
        System.out.println("In RescueDog -- 2-Arg Constructor");
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("Give me a bone!"); }
 }