package com.chenyh.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @program:
 * @description:
 * @author: HenryChen
 * @create: 20-4-6 上午11:54
 **/

@Data
@Accessors(chain = true)
@Document(indexName = "person")
public class Person {
    @Id
    private String id;
    private String name;
    private int age;
//    private String note;

}
