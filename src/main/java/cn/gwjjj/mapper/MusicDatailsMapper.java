package cn.gwjjj.mapper;

import java.util.List;
import cn.gwjjj.model.MusicDatails;
import cn.gwjjj.model.MusicDatailsExample;
import org.apache.ibatis.annotations.Param;

public interface MusicDatailsMapper {
    int countByExample(MusicDatailsExample example);

    int deleteByExample(MusicDatailsExample example);

    int deleteByPrimaryKey(Integer musicId);

    int insert(MusicDatails record);

    int insertSelective(MusicDatails record);

    List<MusicDatails> selectByExample(MusicDatailsExample example);

    MusicDatails selectByPrimaryKey(Integer musicId);

    int updateByExampleSelective(@Param("record") MusicDatails record, @Param("example") MusicDatailsExample example);

    int updateByExample(@Param("record") MusicDatails record, @Param("example") MusicDatailsExample example);

    int updateByPrimaryKeySelective(MusicDatails record);

    int updateByPrimaryKey(MusicDatails record);
}