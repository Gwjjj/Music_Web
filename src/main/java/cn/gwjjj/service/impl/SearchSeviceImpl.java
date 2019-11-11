package cn.gwjjj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.gwjjj.mapper.SearchAllMapper;
import cn.gwjjj.model.MusicDatails;
import cn.gwjjj.model.PlayerDatails;
import cn.gwjjj.model.PlaylistDetails;
import cn.gwjjj.service.SearchService;
import org.springframework.stereotype.Service;

@Service
public class SearchSeviceImpl implements SearchService {
	@Resource
	private SearchAllMapper searchAllMapper;

	public List<MusicDatails> searchMusicBySearchText(String searchText) {
		// TODO Auto-generated method stub
		List<MusicDatails> musicDatailsList = searchAllMapper.selectMusicBySearchText(searchText);
		return musicDatailsList;
	}

	public List<PlaylistDetails> searchPlaylistDetailsBySearchText(String searchText) {
		// TODO Auto-generated method stub
		List<PlaylistDetails> playlistDetailsList = searchAllMapper.selectPlaylistBySearchText(searchText);
		return playlistDetailsList;
	}

	public List<PlayerDatails> searchPlayerBySearchText(String searchText) {
		List<PlayerDatails> playerDatails = searchAllMapper.selectPlayerBySearchText(searchText);
		return playerDatails;
	}

}
