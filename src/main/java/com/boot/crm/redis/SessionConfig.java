package com.boot.crm.redis;

import org.springframework.context.annotation.Configuration;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 本处为redis使用的第二个场景:共享session
 *
 * @Author: 华为周旭阳
 * @Date:Create in 2019/1/3 14:42
 * @Description:
 *          共享Session是第二个典型应用场景，这是利用了Redis的堆外内存特性。
 *          要保证分布式应用的可伸缩性，带状态的Session对象是绕不过去的一道坎。
 *          一种方式是将Session持久化到数据库中，缺点是读写成本太高。
 *          另一种方式是去Session化，比如Play直接将Session存到客户端的Cookie中，缺点是存储信息的大小受限。
 *          将Session缓存到Redis中，既保证了可伸缩性，同时又避免了前面两者的限制
 *
 * 1.maxInactiveIntervalInSeconds: 设置Session失效时间，
 *   使用Redis Session之后，原Boot的server.session.timeout属性不再生效
 *
 */
//@Configuration
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400)   //1.
public class SessionConfig {

}
