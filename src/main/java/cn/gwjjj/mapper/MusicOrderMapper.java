package cn.gwjjj.mapper;

import java.util.List;

import cn.gwjjj.model.MusicDatails;

public interface MusicOrderMapper {
List<MusicDatails> countAllByHot();
List<MusicDatails> countAllByCreateTime();
List<MusicDatails> countAsiaByHot();
List<MusicDatails> countAmericaByHot();
List<MusicDatails> countJapanAndKoreaaByHot();
}
