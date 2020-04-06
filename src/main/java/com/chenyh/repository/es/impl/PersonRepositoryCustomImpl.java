package com.chenyh.repository.es.impl;

import com.chenyh.model.Person;
import com.chenyh.repository.es.PersonRepositoryCustom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Repository;

import static org.elasticsearch.index.query.QueryBuilders.matchQuery;

/**
 * @program:
 * @description:
 * @author: HenryChen
 * @create: 20-4-6 下午8:59
 **/
@Repository
@Slf4j
public class PersonRepositoryCustomImpl implements PersonRepositoryCustom {


    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    public Page<Person> customQuery(){

        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(matchQuery("name", "76773708-01d3-4fca-8e1d-07cab364a053"))
                .withPageable(PageRequest.of(0, 10))
                .withIndices(INDEX)
                .build();

        return elasticsearchRestTemplate.queryForPage(searchQuery, Person.class);
    }



}
