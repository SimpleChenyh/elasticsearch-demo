package com.chenyh.dao;

import com.chenyh.model.Person;
import com.chenyh.repository.es.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @program:
 * @description:
 * @author: HenryChen
 * @create: 20-4-6 下午3:33
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class PersonRepositoryTest {


    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;


    @Autowired
    private PersonRepository personRepository;
    // 28M 35M
    @Test
    public void test1() {

        for (int i = 0; i < 100000; i++) {
            Person person = new Person()
                    .setAge(new Random().nextInt())
                    .setName(UUID.randomUUID().toString());
            Person save = personRepository.save(person);
//            log.error("Saved id [{}]",save.getId());
        }

    }

    @Test
    public void test2() {

        for (int i = 0; i < 1000; i++) {
            List<Person> persons = new ArrayList();
            for (int j = 0; j < 100; j++) {
                Person person = new Person()
                        .setAge(new Random().nextInt())
                        .setName(UUID.randomUUID().toString());
                persons.add(person);
            }

            personRepository.saveAll(persons);
//            log.error("Saved id [{}]",save.getId());
        }

    }

    @Test
    public void test3() {

        Page<Person> people = personRepository.customQuery();

        log.error("Size : [{}]",people.getSize());
        log.error("Result : [{}]",people.getContent());

    }

}