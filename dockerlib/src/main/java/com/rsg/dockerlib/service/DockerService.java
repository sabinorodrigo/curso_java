package com.rsg.dockerlib.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.rsg.dockerlib.dto.ContainerInfo;

public class DockerService {

	public static final String LIST_RUNNING_CONTAINERS ="docker stats --no-stream --format \"{{.ID}}\\t{{.CPUPerc}}\\t{{.Name}}\\t{{.MemUsage}}\\t{{.MemPerc}}\"";
	public static final String LIST_ALL_CONATINERS ="docker ps -a ";
	public static final String LIST_ALL_IMAGES = "docker image ls";
	public static final String START_CONTAINER = "docker run ";
	public static final String STOP_CONTAINER = "docker stop ";
	public static final String REMOVE_CONTAINER = "docker rm ";
	public static final String REMOVE_IMAGE = "docker image rm ";
	
	public List<ContainerInfo> listContainer() {
		String dockerOutput = runDockerCommand(LIST_RUNNING_CONTAINERS);
		String lines[] = dockerOutput.split("\n");
		List<ContainerInfo> containerInfo = new ArrayList<>();
		for (String result : lines) {
			String resultFields[] = result.split("\t");
			containerInfo.add(new ContainerInfo(resultFields[0], resultFields[1], resultFields[2], resultFields[3], resultFields[4]));
		}
		return containerInfo;
	}
	
	public String runDockerCommand(String dockerCommand) {
		ProcessBuilder processBuilder = new ProcessBuilder(dockerCommand.split(" "));
		processBuilder.redirectErrorStream(true);
		
		try {
			
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder output = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				output.append(line).append("\n");
			} 
			int exitCode = process.waitFor();
			if (exitCode != 0) {
				throw new RuntimeException("Comando Docker falhou com erro " + exitCode);
			}
			return output.toString();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao executar " + dockerCommand);
		}
	}
}
