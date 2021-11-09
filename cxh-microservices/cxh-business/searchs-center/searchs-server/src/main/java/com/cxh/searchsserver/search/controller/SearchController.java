package com.cxh.searchsserver.search.controller;


import cn.hutool.db.PageResult;
import com.cxh.searchsclient.model.SearchDto;
import com.cxh.searchsserver.search.service.ISearchService;
import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 通用搜索
 *
 * @author zlt
 */
@Slf4j
@RestController
@Api(tags = "搜索模块api")
@RequestMapping("/search")
public class SearchController {
    private final ISearchService searchService;

    public SearchController(ISearchService searchService) {
        this.searchService = searchService;
    }

    /**
     * 查询文档列表
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     */
    @GetMapping("/{indexName}")
    public PageResult<JsonNode> strQuery(@PathVariable String indexName, @RequestBody(required = false) SearchDto searchDto) throws IOException {
        if (searchDto == null) {
            searchDto = new SearchDto();
        }
        return searchService.strQuery(indexName, searchDto);
    }
}
