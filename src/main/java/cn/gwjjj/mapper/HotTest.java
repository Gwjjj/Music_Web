package cn.gwjjj.mapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class HotTest implements IHotTest{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int fingHot(int id){
        Integer hot = jdbcTemplate.queryForObject("select music_hot from music_datails where MUSIC_ID = ?", Integer.class,id);
        return hot;
    }

    @Override
    public void updateHot(int id, int hot) {
        jdbcTemplate.update("update music_datails set music_hot = ? where MUSIC_ID = ?",hot,id);
    }

}
