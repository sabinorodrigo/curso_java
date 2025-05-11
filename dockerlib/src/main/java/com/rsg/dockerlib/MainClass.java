package com.rsg.dockerlib;

import com.rsg.dockerlib.service.DockerService;

public class MainClass {

	public static void main(String[] args) {
		
		DockerService dockerService = new DockerService();
		
		System.out.println(dockerService.listContainer());
	}
}
