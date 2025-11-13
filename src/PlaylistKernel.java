public interface PlaylistKernel extends Standard<Playlist>

/** Add songs to the playlist
     *
     * @param song
     *
     * @updates this
     *
     */

    public void addSong(String song) {

    /**
     * Returns the first song in the playlist
     *
     * @updates this
     */
    public String getFirstSong() {
        return "";

    /**
     * Returns if a playlist is empty
     *
     * @return true if the playlist is empty, false otherwise
     * @ensures result = (this.size() == 0)
     *
     */

    boolean isEmpty() {
        return true;
    }
}
