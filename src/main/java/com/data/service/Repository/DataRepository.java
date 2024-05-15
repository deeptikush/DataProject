package com.data.service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.service.DataEntity.Item;

public interface DataRepository extends JpaRepository<Item, Integer>{

}
