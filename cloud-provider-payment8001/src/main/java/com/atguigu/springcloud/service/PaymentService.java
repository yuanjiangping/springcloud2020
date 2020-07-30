package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author yuanjiangping
 */
public interface PaymentService {

    /**
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * @param id  根据id查询订单信息
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
