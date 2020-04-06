//package com.chenyh.config;
//
//import org.elasticsearch.client.Client;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.boot.autoconfigure.elasticsearch.rest.RestClientAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.convert.support.DefaultConversionService;
//import org.springframework.data.elasticsearch.client.ClientConfiguration;
//import org.springframework.data.elasticsearch.client.RestClients;
//import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
//import org.springframework.data.elasticsearch.core.ElasticsearchEntityMapper;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.data.elasticsearch.core.EntityMapper;
//import org.springframework.stereotype.Component;
//
///**
// * @program:
// * @description:
// * @author: HenryChen
// * @create: 20-3-17 上午7:25
// **/
//@Configuration
//@Component
//public class ElasticSearchConfiguration extends AbstractElasticsearchConfiguration {
//
//
//
//    @Override
//    public RestHighLevelClient elasticsearchClient() {
//        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                .connectedTo("localhost:9200")
//                .build();
//
//        return RestClients.create(clientConfiguration).rest();
//    }
//
//    @Bean
//    @Override
//    public EntityMapper entityMapper() {
//        ElasticsearchEntityMapper entityMapper = new ElasticsearchEntityMapper(elasticsearchMappingContext(),
//                new DefaultConversionService());
//        entityMapper.setConversions(elasticsearchCustomConversions());
//
//        return entityMapper;
//    }
//
//}
