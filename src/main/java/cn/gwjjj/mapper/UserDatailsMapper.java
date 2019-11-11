package cn.gwjjj.mapper;

import java.util.List;
import cn.gwjjj.model.UserDatails;
import cn.gwjjj.model.UserDatailsExample;
import org.apache.ibatis.annotations.Param;

public interface UserDatailsMapper {
    int countByExample(UserDatailsExample example);

    int deleteByExample(UserDatailsExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserDatails record);

    int insertSelective(UserDatails record);

    List<UserDatails> selectByExample(UserDatailsExample example);

    UserDatails selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserDatails record, @Param("example") UserDatailsExample example);

    int updateByExample(@Param("record") UserDatails record, @Param("example") UserDatailsExample example);

    int updateByPrimaryKeySelective(UserDatails record);

    int updateByPrimaryKey(UserDatails record);
}