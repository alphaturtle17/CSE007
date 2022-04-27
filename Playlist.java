/*
Thor Long
CSE 007
4/26/2022
Playlist creates a Song[] object with name, creator, numsongs in array
VSCode
*/
public class Playlist {
    private String name;
    private String creator;
    private Song[] songs;
    final int CAPACITY = 20;
    public Playlist(String name, String creator,int numSongs) {
        this.name = name;
        this.creator = creator;
        songs = new Song[numSongs];
    
    }
    /*
    @param
    @return String
    */
    public String getName() {
        return name;
    }
    /*
    @param array Song[]
    @return Song[]
    */
    public Song[] getSongs() {
        return songs;
    }
    /*
    @param Song adds a Song to Song[]
    */
    public void addSong(Song song) {
        int numSongs = Song.getNumSongs();
        if (numSongs < songs.length) {
            songs[numSongs++] = song;
        } else {
            System.out.println("Your playlist is full");
        }
        Song.setNumSongs(numSongs);
    }
    /*
    @param Song removes a Song from Song[]
    */
    public void removeSong(Song song) {
        boolean removed = false;
        int i;
        int numSongs = Song.getNumSongs();
        for(i = 0; i < numSongs; i++){
            if(songs[i].getName().equals(song.getName())){
                songs[i] = null;
                removed = true;;
                numSongs--;
                Song.setNumSongs(numSongs);
                break;
            }
        }
        if(removed){
            for(int j=i; j< numSongs; j++){
                songs[j] = songs[j+1];
            }
        } else {
            System.out.println(song.getName()+" was not found in the playlist");
        }
    }
}