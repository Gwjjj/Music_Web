package cn.gwjjj.mapper;

import java.util.List;

import cn.gwjjj.model.PlayerDatails;
import cn.gwjjj.model.PlayerDatailsExample;
import org.apache.ibatis.annotations.Param;

public interface PlayerDatailsMapper {
    int countByExample(PlayerDatailsExample example);

    int deleteByExample(PlayerDatailsExample example);

    int deleteByPrimaryKey(Integer playerId);

    int insert(PlayerDatails record);

    int insertSelective(PlayerDatails record);

    List<PlayerDatails> selectByExample(PlayerDatailsExample example);

    PlayerDatails selectByPrimaryKey(Integer playerId);

    int updateByExampleSelective(@Param("record") PlayerDatails record, @Param("example") PlayerDatailsExample example);

    int updateByExample(@Param("record") PlayerDatails record, @Param("example") PlayerDatailsExample example);

    int updateByPrimaryKeySelective(PlayerDatails record);

    int updateByPrimaryKey(PlayerDatails record);
}