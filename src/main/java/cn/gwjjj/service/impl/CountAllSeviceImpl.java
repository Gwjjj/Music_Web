package cn.gwjjj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.gwjjj.mapper.MusicOrderMapper;
import cn.gwjjj.model.MusicDatails;
import cn.gwjjj.service.CountAllService;
import org.springframework.stereotype.Service;

@Service
public class CountAllSeviceImpl implements CountAllService {
	@Resource
	public MusicOrderMapper musicHotMapper;
	
	public List<MusicDatails> MusicDatailsList;
	public List<MusicDatails> countAllByCreateTime() {
		MusicDatailsList=musicHotMapper.countAllByCreateTime();
		return MusicDatailsList;
	}
	public List<MusicDatails> countAllByHot() {
		MusicDatailsList=musicHotMapper.countAllByHot();
		return MusicDatailsList;
	}
	public List<MusicDatails> countAsiaByHot() {
		MusicDatailsList=musicHotMapper.countAsiaByHot();
		return MusicDatailsList;
	}
	public List<MusicDatails> countAmericaByHot() {
		MusicDatailsList=musicHotMapper.countAmericaByHot();
		return MusicDatailsList;
	}
	public List<MusicDatails> countJapanAndKoreaaByHot() {
		MusicDatailsList=musicHotMapper.countJapanAndKoreaaByHot();
		return MusicDatailsList;
	}
	
}
