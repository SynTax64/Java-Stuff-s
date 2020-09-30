package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing.Challenge17_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Album {
    private String nameOfAlbum;
    private LinkedList<Song> songs;

    public Album(String nameOfAlbum) {
        this.nameOfAlbum = nameOfAlbum;
        this.songs = new LinkedList<>();
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public String getNameOfAlbum() {
        return nameOfAlbum;
    }

    public void printSongs() {
        for (Song song : getSongs()) {
            System.out.println(song);
        }
    }

    public Song getSong(String songTitle) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }

    public boolean isSongExist(String songTitle) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(songTitle)) {
                return true;
            }
        }
        return false;
    }

    public boolean addSong(String songTitle, String duration) {
        if (isSongExist(songTitle)) {
            System.out.println("Song " + songTitle + " already exist");
            return false;
        } else {
            this.songs.add(new Song(songTitle, duration));
            return true;
        }
    }

    public void removeSong(String songTitle) {
        if (isSongExist(songTitle)) {
            this.songs.remove(getSong(songTitle));
        } else {
            System.out.println("Song " + songTitle + " not exist");
        }
    }

    public void playSongs() {
        LinkedList<Song> lSongs = songs;

        if (lSongs.size() > 0) {
            ListIterator<Song> it = lSongs.listIterator();
            Scanner scanner = new Scanner(System.in);
            System.out.println("You have " + lSongs.size() + " songs on your " + getNameOfAlbum() + "album");
            while (it.hasNext()) {
                printSongs();
                int o = scanner.nextInt();
                scanner.nextLine();
                switch (o) {
                    case 1:
                        System.out.println("Playing next song: " + it.next());
                        break;
                    case 2:
                        System.out.println("Playing previous song: " + it.previous());
                        break;
                    case 3:
                        System.out.println("Replaying song: ");
                        break;
                    case 0:
                        break;
                }
            }
            System.out.println("End of playlist");
        } else {
            System.out.println("");
        }


    }

    public void printInstructions() {
        System.out.println("1. Next song");
        System.out.println("2. Previous song");
        System.out.println("3. Replay song");
        System.out.println("0. Quit player");
    }

    @Override
    public String toString() {
        return nameOfAlbum;
    }
}
