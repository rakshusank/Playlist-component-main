public class PlaylistAbstract {

}

/**
 *
 * @return the first song
 * @requires !this.isEmpty()
 * @ensures result = #this.getFirstSong()
 *
 */

 public String getFirstSong() {
     String firstSong = this.songs.front();
        return firstSong;
        int length = this.songs.length();
        Playlist temp = new.Instance();

        for (int i = 0; i < length; i++) {
            String song = this.songs.front();
            temp.addSong(song);
            this.songs.remove(0);
        }


        for (int i = 0; i < length; i++) {
            String song = temp.getFirstSong();
            this.songs.add(this.songs.length(), song);
            temp.removeFirstSong();
        }

        /**
         *
         * @param pos
         * @return song at position pos
         * @requires pos >= 0 && pos < this.size()
         * @ensures result = #this.getSongAtPosition(pos)
         */

    public String getSongAtPosition(int pos) {
        String songAtPos = "";
        int length = this.songs.length();
        Playlist temp = new Instance();

        for (int i = 0; i < length; i++) {
            String song = this.songs.front();
            temp.addSong(song);
            this.songs.remove(0);
        }

        for (int i = 0; i < length; i++) {
            String song = temp.getFirstSong();
            if (i == pos) {
                songAtPos = song;
            }
            this.songs.add(this.songs.length(), song);
            temp.removeFirstSong();
        }
        return songAtPos;
    }
    @Override
    public int size() {
        return this.songs.length();
    }


 }