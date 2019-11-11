package cn.gwjjj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.gwjjj.model.PlaylistDetails;
import cn.gwjjj.model.PlaylistDetailsExample;
import cn.gwjjj.model.UserDatails;
import cn.gwjjj.service.PlaylistService;
import org.springframework.stereotype.Service;

import cn.gwjjj.mapper.PlaylistDetailsMapper;

@Service
public class PlaylistServiceImpl implements PlaylistService {
    
	@Resource
	private PlaylistDetailsMapper playlistDetailsMapper;
	
	public List<PlaylistDetails> findPlaylistByUserDatails(UserDatails Userdatails) {
		// TODO Auto-generated method stub
		int userId=Userdatails.getUserId();
		PlaylistDetailsExample example=new PlaylistDetailsExample();
		PlaylistDetailsExample.Criteria criteria=example.createCriteria();
		criteria.andPlaylistUseridEqualTo(userId);
		List<PlaylistDetails> playlistDetailslist=playlistDetailsMapper.selectByExample(example);
		
		return playlistDetailslist;
	}

	public String findMusicById(int playlistId) {
		// TODO Auto-generated method stub
		PlaylistDetails playlistDetails=playlistDetailsMapper.selectByPrimaryKey(playlistId);
		String str=playlistDetails.getPlaylistMusic();
		return str;
	}

}
