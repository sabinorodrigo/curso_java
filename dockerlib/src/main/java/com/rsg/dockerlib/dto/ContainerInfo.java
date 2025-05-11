package com.rsg.dockerlib.dto;

public record ContainerInfo(String id, String name, String imageName, String status, String memory) {

}
