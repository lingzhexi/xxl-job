package com.sunway.sc.annotation;

import com.sunway.sc.config.XxlJobConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 名称： EnableJobExecute
 * <br>描述：job执行器控制注解	
 * @author lingzx
 * @version 1.0
 * <br>Program Name:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(XxlJobConfig.class)
@Documented
@Inherited
public @interface EnableJobExecute {

}
