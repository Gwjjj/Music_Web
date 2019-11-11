package cn.gwjjj.mapper;

import java.util.List;

import cn.gwjjj.model.MusicDatails;
import cn.gwjjj.model.PlayerDatails;
import cn.gwjjj.model.PlaylistDetails;



public interface SearchAllMapper {
	List<MusicDatails> selectMusicBySearchText(String searchText);
	List<PlaylistDetails> selectPlaylistBySearchText(String searchText);
	List<PlayerDatails> selectPlayerBySearchText(String searchText);
}
