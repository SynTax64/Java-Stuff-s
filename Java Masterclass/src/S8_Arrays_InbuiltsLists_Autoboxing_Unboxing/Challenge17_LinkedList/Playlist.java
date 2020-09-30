package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing.Challenge17_LinkedList;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Album> albums;

    public Playlist() {
        this.albums = new ArrayList<>();
    }

    public void printAlbums() {
        for (Album album : albums) {
            System.out.println("Album: " + album + ", has " + album.getSongs().size() + " songs");
        }
    }

    public void addAlbum(String newAlbum) {
        if (isAlbumExist(newAlbum)) {
            System.out.println("Album " + newAlbum + " already exist");
        } else {
            albums.add(new Album(newAlbum));
        }
    }


    public boolean isAlbumExist(String albumName) {
        for (Album album : albums) {
            if ((album.getNameOfAlbum().equals(albumName))) {
                return true;
            }
        }
        return false;
    }

    public void removeAlbum(String albumName) {
        if (isAlbumExist(albumName)) {
            albums.remove(getAlbum(albumName));
        } else {
            System.out.println("Can't remove album which not exist");
        }
    }

    public Album getAlbum(String albumName) {
        for (Album album : albums) {
            if (album.getNameOfAlbum().equals(albumName)) {
                return album;
            }
        }
        return null;
    }
}
