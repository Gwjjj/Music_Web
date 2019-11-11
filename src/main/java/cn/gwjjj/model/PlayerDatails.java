package cn.gwjjj.model;

import java.util.Date;

public class PlayerDatails {
    private Integer playerId;

    private String playerName;

    private Integer playerCon;

    private Date playerBd;

    private String playerInfo;

    private Integer playerHot;

    private String playerImg;

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName == null ? null : playerName.trim();
    }

    public Integer getPlayerCon() {
        return playerCon;
    }

    public void setPlayerCon(Integer playerCon) {
        this.playerCon = playerCon;
    }

    public Date getPlayerBd() {
        return playerBd;
    }

    public void setPlayerBd(Date playerBd) {
        this.playerBd = playerBd;
    }

    public String getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(String playerInfo) {
        this.playerInfo = playerInfo == null ? null : playerInfo.trim();
    }

    public Integer getPlayerHot() {
        return playerHot;
    }

    public void setPlayerHot(Integer playerHot) {
        this.playerHot = playerHot;
    }

    public String getPlayerImg() {
        return playerImg;
    }

    public void setPlayerImg(String playerImg) {
        this.playerImg = playerImg == null ? null : playerImg.trim();
    }
}