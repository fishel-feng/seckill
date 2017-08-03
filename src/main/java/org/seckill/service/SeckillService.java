package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.SecKill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

import java.util.List;

/**
 * Created by fx on 2017/2/1.
 */
public interface SeckillService {

    List<SecKill> getSeckillList();

    SecKill getById(long seckillId);

    Exposer exportSeckillUrl(long seckillId);

    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)throws SeckillException,RepeatKillException,SeckillCloseException;

    SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5);

}
