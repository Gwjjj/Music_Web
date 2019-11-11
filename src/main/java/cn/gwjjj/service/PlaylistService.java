package cn.gwjjj.service;

import java.util.List;

import cn.gwjjj.model.PlaylistDetails;
import cn.gwjjj.model.UserDatails;

public interface PlaylistService {
List<PlaylistDetails> findPlaylistByUserDatails(UserDatails Userdatails);
String findMusicById(int playlistId);
}
