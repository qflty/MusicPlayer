package com.example.administrator.day2_27.EntityClass;

public class SongIdNPath {
    private String songPath;
    private int position;

    public SongIdNPath(String songPath,int position) {
        super();
        this.songPath = songPath;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public String getSongPath() {
        return songPath;
    }
}
