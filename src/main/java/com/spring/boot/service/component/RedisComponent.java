package com.spring.boot.service.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.*;

@Component(value = "redisComponent")
public class RedisComponent {
    private static final Logger logger = LoggerFactory.getLogger(RedisComponent.class);

//    @Autowired
//    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private HashOperations<String, String, String> hashOperation;
    @Autowired
    private ListOperations<String, String> listOperation;
    @Autowired
    private SetOperations<String, String> setOperation;
    @Autowired
    private ValueOperations valueOperations;

    public void  set(String key,Object values){
        valueOperations.set(key,values);
    }
    public Object get(String key){
        return  valueOperations.get(key);
    }
    public Object hGet(String key, String hKey){
        return hashOperation.get(key, hKey);
    }

    public List<String> hGet(String key, Collection<String> hKeys){
        return hashOperation.multiGet(key, hKeys);
    }

    public Map<String, String> hGetAll(String key){
        return hashOperation.entries(key);
    }

    public void hPut(String key, String hKey, String value){
        logger.debug("hPut key:{}, hKey:{}, value:{}", key, hKey, value);
        hashOperation.put(key, hKey, value);
    }

    public void hRemove(String key, String... hKeys){
        logger.debug("hRemove key:{}, hKeys:{}", key, hKeys);
        if(hKeys != null && hKeys.length > 0){
            Object[] objects = new Object[hKeys.length];
            for(int i = 0; i < hKeys.length; i++){
                objects[i] = hKeys[i];
            }
            hashOperation.delete(key, objects);
        }
    }

    public void leftPush(String key, String value){
        logger.debug("leftPush key:{}, value:{}", key, value);
        listOperation.leftPush(key, value);
    }

    public void rightPush(String key, String value){
        logger.debug("rightPush key:{}, value:{}", key, value);
        listOperation.rightPush(key, value);
    }

    public Object leftPop(String key){
        Object value = listOperation.leftPop(key);
        logger.debug("leftPop key:{}, value:{}", key, value);
        return value;
    }

    public Object rightPop(String key){
        Object value = listOperation.rightPop(key);
        logger.debug("rightPop key:{}, value:{}", key, value);
        return value;
    }

    public List<String> lGetAll(String key){
        Long size = lSize(key);
        if(size == null || size == 0) return new ArrayList<>();
        return lGetRange(key, 0, size - 1);
    }

    public List<String> lGetRange(String key, long start, long end){
        return listOperation.range(key, start, end);
    }

    public Long lSize(String key){
        return listOperation.size(key);
    }

    public void sAdd(String key, String... values){
        logger.debug("sAdd key:{}, values:{}", key, values);
        setOperation.add(key, values);
    }

    public void sRemove(String key, String... values){
        logger.debug("sRemove key:{}, values:{}", key, values);
        if(values != null && values.length > 0){
            Object[] objects = new Object[values.length];
            for(int i = 0; i < values.length; i++){
                objects[i] = values[i];
            }
            setOperation.remove(key, objects);
        }
    }

    public void lRemove(String key, int count, Object value){
        logger.debug("lRemove key:{}, count:{}, value:{}", key, count, value);
        listOperation.remove(key, count, value);
    }

    public Object sPop(String key){
        Object value = setOperation.pop(key);
        logger.debug("sPop key:{}, value:{}", key, value);
        return value;
    }

    public Set<String> sGetAll(String key){
        return setOperation.members(key);
    }
}
