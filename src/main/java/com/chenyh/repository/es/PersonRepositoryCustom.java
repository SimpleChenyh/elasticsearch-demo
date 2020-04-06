package com.chenyh.repository.es;

import com.chenyh.model.Person;
import org.springframework.data.domain.Page;

/**
 * @program:
 * @description:
 * @author: HenryChen
 * @create: 20-4-6 下午8:57
 **/
public interface PersonRepositoryCustom {
    String INDEX = "person";

    Page<Person> customQuery();

}
