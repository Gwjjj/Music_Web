package cn.gwjjj.service.impl;

import cn.gwjjj.mapper.HotTest;
import cn.gwjjj.mapper.MusicDatailsMapper;
import cn.gwjjj.model.MusicDatails;
import cn.gwjjj.service.TTTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
@Service
@Transactional
public class TTTestImpl implements TTTest {
    @Autowired
    private HotTest hotTest;
    public void test(){
        int hot1 = hotTest.fingHot(1);
        int hot2 = hotTest.fingHot(2);
        hotTest.updateHot(hot1 - 100,1);
        int i = 1/0;
        hotTest.updateHot(hot2 + 100,2);
    }
}
