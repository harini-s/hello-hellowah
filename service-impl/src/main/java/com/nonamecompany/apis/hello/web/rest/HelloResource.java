package com.nonamecompany.apis.hello.web.rest;

import com.nonamecompany.apis.hello.service.api.HelloApi;
import com.nonamecompany.apis.hello.service.api.model.HelloResponse;
import org.springframework.http.ResponseEntity;

public class HelloResource implements HelloApi {

    @Override
    public ResponseEntity<HelloResponse> getHelloMessage(String xApplicationId) {



        return null;
    }
}
