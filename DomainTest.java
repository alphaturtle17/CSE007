/*
Thor Long
5/1/22
HW7
Interacts with DomainAvaliability and sees if websites are avaliable
*/
import java.util.Scanner;
public class DomainTest {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        boolean running = true;
        DomainAvailability domain = new DomainAvailability();
        do{
            System.out.println("Enter a domain name (type x to exit): ");
            String name = getString(scnr);
            int code = domain.checkIfDomainNameIsValid(name);
            if(name.toLowerCase().equals("x")){
                break;
            }
            if(code == 0){ //Means it's a valid domain, not necessarily avaliable
                boolean avaliable = domain.hasAvaliableDomain(name);
                if(avaliable == true){
                    System.out.println("Domain " + name + " is valid and avaliable!");
                }else{
                    System.out.println("Alternative domains: ");
                    System.out.println(domain.getSimilarDomainNames(name));
                }
            }else if(code == 1){
                System.out.println("There are either no or 2 or more periods. Domain must only have 1 (ex. apple.com)");
            }else if(code == 2){
                System.out.println("The period must not be the first or last character.");
            }else if(code == 3){
                System.out.println("Second level domain name is invalid.");
            }else if(code == 4){
                System.out.println("The top level domain name is invalid");
            }
        }while(running == true);
    }
    /*
    @param Scanner
    @return String user
    */
    public static String getString(Scanner scnr){
        String response = "";
        response = scnr.nextLine();
        return response;
    }
}
