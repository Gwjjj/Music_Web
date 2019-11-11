package cn.gwjjj.test;

import cn.gwjjj.mapper.MusicDatailsMapper;
import cn.gwjjj.model.MusicDatails;

import cn.gwjjj.service.TTTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AopTest {
    @Resource
    private TTTest tttest;
    @Test
    public void test(){
        tttest.test();

    }
}
