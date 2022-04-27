/*
Thor Long
4/20/2022
Week13Participation
All accessor methods and getter methods in order to edit and such.
*/
public class TVShow {
    private String name;
    private String stream;
    private String genre;
    private double avgLength;
    private int episodes = 0;
    private static int shows = 0;
    
    public TVShow(){ //Constructor (null)
        name = "n/a";
        stream = "n/a";
        genre = "n/a";
        avgLength = 0;
        shows++; //Increment shows here because it's upon creation of a show
    }
    public TVShow(String name, String stream, String genre, double avgLength){ //Constructor 
        //Almost named each thing itself and didn't look at precedence, need to use this.
        this.name = name;
        this.stream = stream;
        this.genre = genre;
        this.avgLength = avgLength;
        shows++;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStream(String stream){
        this.stream = stream;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setLength(double avgLength){
        this.avgLength = avgLength;
    }
    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }
    //  
    public String getName(){
        return name;
    }
    public String getStream(){
        return stream;
    }
    public String getGenre(){
        return genre;
    }
    public double getLength(){
        return avgLength;
    }
    public int getEpisodes(){
        return episodes;
    }
    public static int getShows(){
        return shows;
    }
    //
    public void airEpisodes(){
        this.episodes++;
    }
    public void airEpisodes(int num){
        this.episodes += num;
    }
    public double getTotalAirtime(){
        double total = this.episodes * this.avgLength;
        return total;
    }
    public void display(){
        System.out.println("Name : \t Streaming Service: \t Genre: ");
        System.out.println(this.name + "\t" + this.stream + "\t" + this.genre);
    }
}
