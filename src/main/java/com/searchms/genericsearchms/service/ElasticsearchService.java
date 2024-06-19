package com.searchms.genericsearchms.service;

import com.searchms.genericsearchms.model.GenericObject;
import com.searchms.genericsearchms.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.io.IOException;

@Service
public class ElasticsearchService {
    @Autowired
    private SearchRepository searchRepository;

    public void savePersonToElasticSearch(Map<String,Object> map) {
        GenericObject go = new GenericObject();
        go.setMap(map);
        searchRepository.save(go);
    }
}