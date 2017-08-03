package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * Created by fx on 2017/2/1.
 */
public interface SuccessKilledDao {

    int insertSuccessKilled(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

    SuccessKilled queryByIdWithSecKill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

}
