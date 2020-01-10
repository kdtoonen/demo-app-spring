package com.bluemorphost.demo;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.jayway.restassured.RestAssured.given;

public class ApiTestCompetition {

    private PropertyReader propertyReader = new PropertyReader();

    private String serverName = propertyReader.getPropertyValue("test.server.name");
    private String serverPort = propertyReader.getPropertyValue("test.server.port");
    private Response response;

    @Test
    public void testCreateCompetition() throws Throwable {
        JSONObject requestParams = new JSONObject();
        requestParams.put("competitionName", "World Championship 2020");
        requestParams.put("competitionStartDateTime", "2020-02-02T20:20:20.000");
        String servicePath = "/competition";
        RestAssured.baseURI = serverName + ":" + serverPort + servicePath;
        response = given().contentType("application/json").body(requestParams.toJSONString()).post();
        Assert.assertEquals(201, response.getStatusCode());
        Assert.assertEquals("World Championship 2020", response.getBody().jsonPath().getString("competitionName"));
        Assert.assertEquals("2020-02-02T20:20:20.000", response.getBody().jsonPath().getString("competitionStartDateTime"));

        System.out.println(response.getBody().asString());
    }
}
