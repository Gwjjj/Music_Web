package cn.gwjjj.service;

import java.util.List;

import cn.gwjjj.model.MusicDatails;
import cn.gwjjj.model.PlayerDatails;
import cn.gwjjj.model.PlaylistDetails;

public interface SearchService {
List<MusicDatails> searchMusicBySearchText(String searchText);
List<PlaylistDetails> searchPlaylistDetailsBySearchText(String searchText);
List<PlayerDatails> searchPlayerBySearchText(String searchText);
}
