package com.example.demo.controller;

import com.example.demo.model.Greet;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @ApiOperation(value = "getGreeting", notes="get greeting ratatatira",nickname = "getGreeting")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Server error, znaci greska brale"),
            @ApiResponse(code = 404, message = "Service not found, znaci servis nije pronadjen"),
            @ApiResponse(code = 200, message = "Successful retrieval, znaci uspesno",
                    response = Greet.class, responseContainer = "List") })
    @GetMapping(value = {"/hello"})
    public String getGreeting() {
        return "Hello World";
    }

    //    http://localhost:9090/hello?queryParam=Hello_World
    @PostMapping("/hello")
    public String getGreetingWithQueryParam(@RequestParam String queryParam) {
        return queryParam;
    }

    //    http://localhost:9090/hello/Hello World
    @GetMapping("/hello/{pathParam}")
    public String getGreetingWithPathParam(@ApiParam(value = "pathParam, znaci parametar",
            required = false, defaultValue = "Hello Worldic")@PathVariable String pathParam){
        return pathParam;
    }

// https://web.postman.co/
//    POST, http://localhost:9090/hello/body, Body, raw, JSON
//    {
//        "hello": "Helloo",
//        "world": "World"
//    }
    @PostMapping("/hello/body")
    public String getGreetingWithBodyParam(@RequestBody Greet bodyParam){
        return bodyParam.getHello() + " " + bodyParam.getWorld();
    }

//    http://localhost:9090/swagger-ui.html#/

}
