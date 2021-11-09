package com.cxh.searchsclient.client.feign.fallback;

import cn.hutool.db.PageResult;
import com.cxh.searchsclient.client.feign.SearchService;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;

/**
 * searchService降级工场
 *
 * @author zlt
 */
@Slf4j
public class SearchServiceFallbackFactory implements FallbackFactory<SearchService> {
    @Override
    public SearchService create(Throwable throwable) {
        return (indexName, searchDto) -> {
            log.error("通过索引{}搜索异常:{}", indexName, throwable);
            return null;
        };
    }
}
