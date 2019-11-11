package cn.gwjjj.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import cn.gwjjj.mapper.MusicDatailsMapper;
import cn.gwjjj.model.MusicDatails;
import cn.gwjjj.service.RadioService;
import org.springframework.stereotype.Service;

@Service
public class RadioServiceImpl implements RadioService {

	@Resource
	private MusicDatailsMapper musicDatailsMapper;

	public List<MusicDatails> findOneByMusicId(int musicId) {
		// TODO Auto-generated method stub
		List<MusicDatails> musicDatailsList = new ArrayList<MusicDatails>();
		MusicDatails musicDatails = musicDatailsMapper.selectByPrimaryKey(musicId);
		musicDatailsList.add(musicDatails);
		return musicDatailsList;
	}

	public List<MusicDatails> findAllByMusicString(String musicString) {
		// TODO Auto-generated method stub
		String[] musicstrs=musicString.split(",");
		List<MusicDatails> musicDatailsList=new ArrayList<MusicDatails>();
    	for(int i=0;i<musicstrs.length;i++){
    		MusicDatails musicDatails=musicDatailsMapper.selectByPrimaryKey(Integer.valueOf(musicstrs[i]));
    		musicDatailsList.add(musicDatails);
    	}
		return musicDatailsList;
	}
	
	
}
