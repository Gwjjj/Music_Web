package cn.gwjjj.service;

import java.util.List;

import cn.gwjjj.model.MusicDatails;

public interface CountAllService {
public List<MusicDatails>  countAllByCreateTime();
List<MusicDatails> countAllByHot();
List<MusicDatails> countAsiaByHot();
List<MusicDatails> countAmericaByHot();
List<MusicDatails> countJapanAndKoreaaByHot();

}
