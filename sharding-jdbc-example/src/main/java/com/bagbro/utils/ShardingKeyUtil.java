package com.bagbro.utils;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;
import java.util.logging.Logger;

/**
 * @Auther: Bag Bro
 * @Date: 2020/12/8 14:47
 * @Description:
 * @Version: 1.0
 */
@Slf4j
public class ShardingKeyUtil implements ShardingKeyGenerator {

    private static final String KEY_TYPE = "bagbro_key";

    private SnowflakeShardingKeyGenerator snowGenerator = new SnowflakeShardingKeyGenerator();

    @Override
    public Comparable<?> generateKey() {
        log.info("######执行自定义主键生成器######");
        return snowGenerator.generateKey();
    }

    @Override
    public String getType() {
        return KEY_TYPE;
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
