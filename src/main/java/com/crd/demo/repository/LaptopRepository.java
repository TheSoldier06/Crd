package com.crd.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crd.demo.entity.Laptop;

@Repository
public interface LaptopRepository extends  JpaRepository<Laptop,Integer>{

}
