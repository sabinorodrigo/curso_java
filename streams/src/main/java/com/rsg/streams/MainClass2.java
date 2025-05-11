package com.rsg.streams;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainClass2 {

	public static void main(String[] args) {
		
		try {
			
			String jsonStr = new String(Files.readAllBytes(Paths.get("pessoas.json")));
			Gson gson = new Gson();
			Type type = new TypeToken<List<Pessoa>>() {}.getType();
			List<Pessoa> lista = gson.fromJson(jsonStr, type);
			
			// DiaGenerico dia = new Dia03();
			DiaGenerico dia = new Dia04();
			
			dia.executarDesafio(lista); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
