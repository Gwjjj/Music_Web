package cn.gwjjj.model;

import java.util.Date;

public class PlaylistDetails {
    private Integer playlistId;

    private String playlistName;

    private Integer playlistUserid;

    private String playlistMusic;

    private String playlistInfo;

    private String playlistImg;

    private Date playlistCret;

    private Integer playlistHot;

    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName == null ? null : playlistName.trim();
    }

    public Integer getPlaylistUserid() {
        return playlistUserid;
    }

    public void setPlaylistUserid(Integer playlistUserid) {
        this.playlistUserid = playlistUserid;
    }

    public String getPlaylistMusic() {
        return playlistMusic;
    }

    public void setPlaylistMusic(String playlistMusic) {
        this.playlistMusic = playlistMusic == null ? null : playlistMusic.trim();
    }

    public String getPlaylistInfo() {
        return playlistInfo;
    }

    public void setPlaylistInfo(String playlistInfo) {
        this.playlistInfo = playlistInfo == null ? null : playlistInfo.trim();
    }

    public String getPlaylistImg() {
        return playlistImg;
    }

    public void setPlaylistImg(String playlistImg) {
        this.playlistImg = playlistImg == null ? null : playlistImg.trim();
    }

    public Date getPlaylistCret() {
        return playlistCret;
    }

    public void setPlaylistCret(Date playlistCret) {
        this.playlistCret = playlistCret;
    }

    public Integer getPlaylistHot() {
        return playlistHot;
    }

    public void setPlaylistHot(Integer playlistHot) {
        this.playlistHot = playlistHot;
    }
}