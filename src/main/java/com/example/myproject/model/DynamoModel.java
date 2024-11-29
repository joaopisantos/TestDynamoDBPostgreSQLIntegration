package com.example.myproject.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "DynamoTable")
public class DynamoModel {
    private String id;
    private String data;

    @DynamoDBHashKey(attributeName = "id")
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    // Other getters and setters
}
