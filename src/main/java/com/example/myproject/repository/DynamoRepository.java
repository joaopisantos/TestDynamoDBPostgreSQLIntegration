package com.example.myproject.repository;

import com.example.myproject.model.DynamoModel;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface DynamoRepository extends CrudRepository<DynamoModel, String> {
}
