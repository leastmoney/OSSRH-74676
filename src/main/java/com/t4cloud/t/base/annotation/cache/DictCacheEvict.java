package com.t4cloud.t.base.annotation.cache;


import com.t4cloud.t.base.constant.CacheConstant;
import org.springframework.cache.annotation.CacheEvict;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用户全部字典缓存清除
 * <p>
 * --------------------
 *
 * @author TeaR
 * @date 2020/02/27 20:22
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@CacheEvict(value = CacheConstant.SYS_DICT, allEntries = true)
public @interface DictCacheEvict {


}
