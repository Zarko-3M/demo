package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@ApiModel
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Greet {

    private @Setter(AccessLevel.PROTECTED) Long id;

    private String hello;
    private String world;

    public Greet(String hello, String world) {
        this.hello = hello;
        this.world = world;
    }

    @ApiModelProperty(position = 1, required = true, value = "Hellou")
    public String getHello() {
        return hello;
    }

//    public void setHello(String hello) {
//        this.hello = hello;
//    }

    @ApiModelProperty(position = 2, required = true, value = "Worldu")
    public String getWorld() {
        return world;
    }

//    public void setWorld(String world) {
//        this.world = world;
//    }

//    @Override
//    public String toString() {
//        return "Greet{" +
//                "Hello='" + hello + '\'' +
//                ", World='" + world + '\'' +
//                '}';
//    }

//    rad sa main-devopment granama na git-u
}
