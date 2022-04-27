/*
Thor Long
CSE 007
4/26/2022
Song creates a song object with name, artist, album, time. Methods manipulating
VSCode
*/
public class Song{
    private String name;
    private String artist;
    private String album;
    private int time;
    private static int numSongs;
    public Song(String name, String artist, String album, int time){
        this.name=name;
        this.artist=artist;
        this.album=album;
        this.time=time;
    }
    /*
    @param
    @return String
    */
    public String getName(){
        return name;
    }
    /*
    @param
    @return String
    */   
    public String getArtist(){
        return artist;
    }
    /*
    @param
    @return String
    */
    public String getAlbum(){
        return album;
    }
    /*
    @param int
    */
    public static void setNumSongs(int number){
        numSongs = number;
    }
    /*
    @param
    @return int numSongs
    */
    public static int getNumSongs(){
        return numSongs;
    }
}