package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SecKill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by fx on 2017/2/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SecKillDaoTest {

    @Resource
    private SecKillDao secKillDao;

    @Test
    public void queryById() throws Exception {
        long id=1000L;
        SecKill secKill=secKillDao.queryById(id);
        System.out.println(secKill.getName());
        System.out.println(secKill);
    }

    @Test
    public void queryAll() throws Exception {
        List<SecKill> secKills=secKillDao.queryAll(0,100);
        for (SecKill secKill : secKills) {
            System.out.println(secKill);
        }
    }

    @Test
    public void reduceNumber() throws Exception {
        Date killTime=new Date();
        int updateCount=secKillDao.reduceNumber(1000L,killTime);
        System.out.println("updateCount"+updateCount);
    }

}