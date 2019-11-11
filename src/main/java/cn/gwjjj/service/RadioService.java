package cn.gwjjj.service;

import java.util.List;

import cn.gwjjj.model.MusicDatails;

public interface RadioService {
List<MusicDatails> findOneByMusicId(int musicId);
List<MusicDatails> findAllByMusicString(String musicString);
}
