package com.thymeleaf.crud;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContactRepository extends PagingAndSortingRepository<Contact,Long>,JpaSpecificationExecutor<Contact>{

}
