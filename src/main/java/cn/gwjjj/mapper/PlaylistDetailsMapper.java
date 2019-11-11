package cn.gwjjj.mapper;

import java.util.List;

import cn.gwjjj.model.PlaylistDetails;
import cn.gwjjj.model.PlaylistDetailsExample;
import org.apache.ibatis.annotations.Param;

public interface PlaylistDetailsMapper {
    int countByExample(PlaylistDetailsExample example);

    int deleteByExample(PlaylistDetailsExample example);

    int deleteByPrimaryKey(Integer playlistId);

    int insert(PlaylistDetails record);

    int insertSelective(PlaylistDetails record);

    List<PlaylistDetails> selectByExample(PlaylistDetailsExample example);

    PlaylistDetails selectByPrimaryKey(Integer playlistId);

    int updateByExampleSelective(@Param("record") PlaylistDetails record, @Param("example") PlaylistDetailsExample example);

    int updateByExample(@Param("record") PlaylistDetails record, @Param("example") PlaylistDetailsExample example);

    int updateByPrimaryKeySelective(PlaylistDetails record);

    int updateByPrimaryKey(PlaylistDetails record);
}