package com.chenyh.repository.es;

import com.chenyh.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


/**
 * @program:
 * @description:
 * @author: HenryChen
 * @create: 20-4-6 下午3:21
 **/
public interface PersonRepository extends CrudRepository<Person,String>,PersonRepositoryCustom {


    Page<Person> findByName(String name, Pageable pageable);


}
