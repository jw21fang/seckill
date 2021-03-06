package com.seckill.exception;

/**
 * 描述:
 * 秒杀关闭异常
 *
 * @outhor ljw
 * @create 2018-01-05 21:03
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
