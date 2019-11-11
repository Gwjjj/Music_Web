package cn.gwjjj.model;

import java.util.Date;

public class MusicDatails {
    private Integer musicId;

    private String musicName;

    private String musicPe;

    private Date musicCreate;

    private String musicInf;

    private Integer musicHot;

    private Integer musicPlace;

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName == null ? null : musicName.trim();
    }

    public String getMusicPe() {
        return musicPe;
    }

    public void setMusicPe(String musicPe) {
        this.musicPe = musicPe == null ? null : musicPe.trim();
    }

    public Date getMusicCreate() {
        return musicCreate;
    }

    public void setMusicCreate(Date musicCreate) {
        this.musicCreate = musicCreate;
    }

    public String getMusicInf() {
        return musicInf;
    }

    public void setMusicInf(String musicInf) {
        this.musicInf = musicInf == null ? null : musicInf.trim();
    }

    public Integer getMusicHot() {
        return musicHot;
    }

    public void setMusicHot(Integer musicHot) {
        this.musicHot = musicHot;
    }

    public Integer getMusicPlace() {
        return musicPlace;
    }

    public void setMusicPlace(Integer musicPlace) {
        this.musicPlace = musicPlace;
    }
}