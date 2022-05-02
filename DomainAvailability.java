/*
Thor Long
5/1/22
HW7
Interacts with DomainTest and sees if websites are avaliable
*/
public class DomainAvailability {
    private String[] validTLD = {".com", ".net", ".org", ".info", ".biz", ".name", ".pro"}; //Valid TLD
    private String [] restrictedTLD = {".biz", ".name", ".pro" }; //No similar names permitted with these TLD
    private String[] registeredDomains = {"apple.com","oracle.com","comcast.com","comcast.net","comcast.org","comcast.info","comcast.biz","nonprofit.org","home.biz","intel.com","information.info","RunningYourOwn.net","roblox.com","google.com","github.com","nytimes.com","linkedin.com","canva.com","spotify.com","amazon.com","ameritrade.com","outlook.com"};
    private int numRegisteredDomains = registeredDomains.length;

    public DomainAvailability(){
        changeStringsToLowerCase(validTLD);
        changeStringsToLowerCase(restrictedTLD);
        changeStringsToLowerCase(registeredDomains);
    }
    /*
    Makes the strings lowercase
    */
    public void changeStringsToLowerCase(String[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = array[i].toLowerCase();
        }
    }
    /*
    @param String checks validity
    @return int code 
    */
    public int checkIfDomainNameIsValid(String domainName){
        int code = 0;
        if(domainName.indexOf(".") != 1){
            code = -1; //No periods, 2 or more periods
        }else if((getPeriodPosition(domainName) == 0) || getPeriodPosition(domainName) == domainName.length() -1){
            code = -2; //Period cannot be first or last
        }else if(!(hasValidSecondLevel(domainName) || hasSpecialCharacter(domainName))){
            code = -3; //Second-level domain check
        }else if(!(checkIfTldIsValid(domainName))){
            code = -4;
        }
        /*
        for(int i = 0; i < validTLD.length; i++){
            if(!(domainName.contains(validTLD[i]))){
                code = -4; //Does not contain any of the specified TLDs
            }
        }
        */
        return code;
    }
    /*
    @param String checks if has special characters
    @return boolean
    */
    public boolean hasSpecialCharacter(String domainName){
        boolean contains = false;
        String special = " !#$%&'()*+,/:;<=>?@[]^_`{|}~";
        String stupid = String.valueOf('"'); //Had to do it this way because quotes are really stupid and messes with everything
        String [] specialArr = domainName.split("");
        for(int i = 0; i < specialArr.length; i++){
            if(special.contains(specialArr[i]) || specialArr[i].contains(stupid)){
                contains = true;
                break;
            }
        }
        return contains;
    }
    /*
    @param String searching for index
    @return int where position is
    */
    public int getPeriodPosition(String search){
        int position = -1;
        for(int i = 0; i < search.length() - 1; i++){
            if(search.charAt(i) == '.'){
                position = i;
            }
        }
        return position;
    }
    /*
    @param String sld 
    @return boolean valid of second level domain
    */
    public boolean hasValidSecondLevel(String sld){
        boolean valid = true;
        if(sld.length() < 1 || sld.length() > 63){
            valid = false;
        }else if(hasSpecialCharacter(sld)){
            valid = false;
        }else if(sld.charAt(0) == '-' || sld.charAt(sld.length() - 1) == '-'){
            valid = false;
        }
        return valid;
    }
    /*
    @param String tld
    @return boolean validity
    */
    public boolean checkIfTldIsValid(String tld){
        boolean valid = true;
        if(hasSpecialCharacter(tld)){ //This seems repetitive, why do we need to check if tld is valid if we check to see if the whole thing are valid and these parameters overlap with the other methods?
            valid = false;
        }
        return valid;
    }
    /*
    @param String domain name checks if that domain is already registered
    @return boolean avaliable or not
    */
    public boolean hasAvaliableDomain(String domainName){
        boolean avaliable = true;
        for(int i = 0; i < registeredDomains.length; i++){
            if(domainName.equals(registeredDomains[i])){
                avaliable = false;
            }
        }
        return avaliable;
    }
    /*
    @param String domain name inputs a valid domain name
    @return similar domain names
    */
    public String getSimilarDomainNames(String domainName){
        String returnDomain = "";
        int period = getPeriodPosition(domainName);
        String endTLD = domainName.substring(period, domainName.length()-1);
        domainName = domainName.substring(0,period);
        for(int i = 0; i < restrictedTLD.length; i++){
            if(domainName.contains(restrictedTLD[i])){
                return returnDomain;
            }
        }
        for(int i = 0; i < validTLD.length; i++){
            if(!(validTLD[i].equals(endTLD))){
                domainName = domainName + validTLD[i] + ", ";
            }
        }
        return returnDomain;
    }
}
