public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isInRepeatingPlaylist() {
        Song slow = this;
        Song fast = this;

        // Empty and one element lists have no cycles:
        if (slow == null || slow.nextSong == null) return false;

        // Keep going until there are elements in list
        while (fast != null && fast.nextSong != null)
        {
            slow = slow.nextSong; // one hop
            fast = fast.nextSong.nextSong; // two hop

            // slow can meet the fast only in a loop!
            if (slow == fast) return true;
        }
        //fast found the end of the list. No loops
        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isInRepeatingPlaylist());
    }
}