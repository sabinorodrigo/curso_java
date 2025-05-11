package com.rsg.streams;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			
			String jsonStr = new String(Files.readAllBytes(Paths.get("pessoas.json")));
			Gson gson = new Gson();
			Type type = new TypeToken<List<Pessoa>>() {}.getType();
			List<Pessoa> lista = gson.fromJson(jsonStr, type);
			
			lista.forEach(p -> System.out.println(p));
			
			Pessoa pessoa = new Pessoa(151, "Rodrigo Sabino Gomes", "rodrigo@email.com", "987.654.321-00", 37);
			
			// List<Pessoa> res1 = lista.stream().toList();
			List<Pessoa> res2 = lista.stream().collect(Collectors.toList());
			
			res2.add(pessoa);
			System.out.println(res2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
