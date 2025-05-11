package com.rsg.streams;

import java.util.List;

public class Dia04 extends DiaGenerico {

	@Override
	public void executarDesafio(List<Pessoa> lista) {
		
		lista.stream()
		.filter(p -> p.getNome().contains("Ana "))
		.toList()
		.forEach(p -> System.out.println(p));
		
	}
}
