package com.example.myproject.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.myproject.entity.PostgreEntity;
import com.example.myproject.model.DynamoModel;
import com.example.myproject.repository.DynamoRepository;
import com.example.myproject.repository.PostgreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private PostgreRepository postgreRepository;

    @Autowired
    private DynamoRepository dynamoRepository;

    public List<PostgreEntity> getPostgreEntities() {
        return postgreRepository.findAll();
    }

    public DynamoModel getDynamoData(String id) {
        return dynamoRepository.findById(id).orElse(null);
    }
}
