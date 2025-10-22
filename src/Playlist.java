public class Playlist{
  private Sequence<String> songs;

  public Playlist(){
    this.songs = new Sequence1L<>();
  }

  /** adds songs to the playlist*/
  
  public void addSong(String song){
    this.songs.add(this.songs.length(), song);
  }

  /** removes song from the playlist*/

  public String removeSong(){
    this.songs.moveToFront();
    return this.songs.remove(0);
  }

  /** Returns number of songs in the playlist */

  public int length(){
    return this.songs.length();

    /** check for empty playlist*/

    public boolean isEmpty(){
      return this.songs.length() == 0;
    
    

 
    
