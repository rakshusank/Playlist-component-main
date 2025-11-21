private Sequence<Song>rep;

/**
 * @ensures this.rep = new Sequence1L<Song>()
 */

public PlaylistKernel() {
    this.rep = new Sequence1L<Song>();
}

/**
 *Returns the number of songs in the playlist
 *@returns the number of songs in the playlist
 *@ensures result = this.rep.length()
 */
public int size() {
    return this.rep.length();
}

/**
 * Adds a song to the end of the playlist
 * @param song
 * @updates this
 * @ensures this.size() = this.size() + 1
 * @requires song != null
 */

public void addSong(Song song) {
    this.rep.add(this.rep.length(), song);
}

/**
 *Returns the first song in the playlist
 *@param position index of the song to return
 *@requires 0 <= position < this.size()
 *@ensures result = this.rep.entry(position)
 *@returns the first song in the playlist
 */

 public Song getSongAt(int position) {
    return this.rep.entry(position);
 }

 /**
  *@param position index of the song to remove
  *@requires 0 <= position < this.size()
  *@updates this
  *@ensures this.size() = this.size() - 1
  *@ensures result = this.rep.entry(position)
  *@ensures the song at the given position is removed from the playlist
  *
  */

  public void removeSongAt(int position) {
    this.rep.remove(position);
  }

  /**
   *moves the song from one position to another in the playlist
   *@param fromPosition index of the song to move
   *@requires 0 <= fromPosition < this.size()
   *@requires 0 <= toPosition < this.size()
   *@ensures this.rep.entry(toPosition) = #this.rep.entry(fromPosition)
   *@ensures this.rep.entry(fromPosition) = #this.rep.entry(toPosition)
   *@updates this
   */

   public void moveSong(int fromPosition, int toPosition) {
    Song songToMove = this.rep.remove(fromPosition);
    this.rep.remove(fromPosition);
    this.rep.add(toPosition, songToMove);
   }

   /**
    *Clears the playlist
    *@ensures this.size() = 0
    *@returns the playlist to an empty state
    */

    public void clearPlaylist() {
        this.rep = new Sequence1L<Song>();
    }
