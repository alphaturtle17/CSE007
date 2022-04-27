/*
Thor Long
CSE 007
4/26/2022
Manipulates Song.class and Playlist.class in order to make objects and simulate a playlist and queue for music
VSCode
*/
import java.util.Scanner;
import java.util.Random;
public class MakePlaylist {
    public static void main(String args[]){

        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        String pName = "";
        String uName = "";
        int songsInPlaylist = 0;

        System.out.println("Enter a name for your playlist");
        pName = scnr.nextLine();
        System.out.println("Enter your name");
        uName = scnr.nextLine();
        System.out.println("Enter a number of songs to add to your playlist (< 20, > 0");
        boolean good = false;
        do{
            songsInPlaylist = checkInt(scnr);
            if(songsInPlaylist <= 20){
                good = true;
            }else{
                good = false;
                scnr.nextLine();
                System.out.println("Must be between 1 and 20 inclusive");
            }
        }while(good == false);

        Playlist playlist = new Playlist(pName, uName, songsInPlaylist);

        for(int i = 0; i < songsInPlaylist; i++){
            System.out.println("Enter a name for the song");
            scnr.nextLine();
            String songName = scnr.nextLine();
            System.out.println("Enter artist name");
  
            String artistName = scnr.nextLine();
            System.out.println("Enter the album");

            String albumName = scnr.nextLine();
            System.out.println("Enter length of time");

            int lengthTime = checkInt(scnr);
            Song song = new Song(songName, artistName, albumName, lengthTime);
            playlist.addSong(song);
        }


        boolean removing = true;
        do{
            System.out.println("Do you want to remove any songs from your playlist? Y/N");
            String response = scnr.next();
            scnr.nextLine();
            if(response.toLowerCase().equals("y")){
                removing = true;
                System.out.println("What song do you want to remove from the playlist?");
                String rSong = scnr.nextLine();
                for(int i = 0; i < songsInPlaylist; i++){
                    if(playlist.getSongs()[i].getName().equals(rSong)){
                        playlist.removeSong(playlist.getSongs()[i]);
                        removing = false;
                        break;
                    }
                }
            }else{
                removing = false;
            }
        }while(removing == true);


        int numQueue = 0;
        boolean qAdd = true;
        do{
            System.out.println("Enter the amount of songs to put onto your queue: ");
            numQueue = checkInt(scnr); //Validate input
            if(numQueue <= playlist.getSongs().length){
                qAdd = false;
            }else{
                qAdd = true;
            }
        }while(qAdd == true);
        
        Playlist queue = new Playlist("Queue", uName, numQueue);

        for(int i = 0; i < numQueue; i++){
            queue.addSong(playlist.getSongs()[i]);
        }

        System.out.println("\nPossible songs to queue: ");
        for(int i = 0; i < queue.getSongs().length; i++){
            System.out.println(queue.getSongs()[i].getName());
        }

        //Will eventually randomize the queue Playlist
        boolean running = true;
        do{
            System.out.println("Queue: ");
            int index;
            Song temp;
            for(int i = queue.getSongs().length - 1; i > 0; i--)
            {
                index = rand.nextInt(i + 1);
                temp = queue.getSongs()[index];
                queue.getSongs()[index] = queue.getSongs()[i];
                queue.getSongs()[i] = temp;
            }
            for(int i = 0; i < queue.getSongs().length; i++){
                System.out.println(queue.getSongs()[i].getName());
            }
            System.out.println("Type -1 to confirm, anything else to randomize");
            if(scnr.hasNextInt() == true){
                if(scnr.nextInt() == -1){
                    running = false;
                }else{
                    running = true;
                }
            }else{
                running = true;
            }
        }while(running == true);
        System.out.println("Finally end");
    }
    
    //@param scnr
    //@return number int
    public static int checkInt(Scanner scnr){
        boolean good = false;
        int number = 0;
        do{
            if(scnr.hasNextInt() == true){
                number = scnr.nextInt();
                good = true;
            }else{
                System.out.println("Invalid data type");
                scnr.nextLine();
                good = false;
            }
        }while(good == false);
        return number;
    }
}

