package com.offcn.dao;

import com.offcn.po.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "api",exported = true)
@CrossOrigin
public interface PersonDao extends JpaRepository<Person,Long> {
    @RestResource(path = "login",exported = false)
    public Person findByNameIsAndPasswordEquals(String name,String password);

}
