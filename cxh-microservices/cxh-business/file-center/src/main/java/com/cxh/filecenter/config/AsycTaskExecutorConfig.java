package com.cxh.filecenter.config;

import com.cxh.cxhcommoncore.config.DefaultAsycTaskConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @author zlt
 * 线程池配置、启用异步
 * @Async quartz 需要使用
 */
@Configuration
public class AsycTaskExecutorConfig extends DefaultAsycTaskConfig {

}
