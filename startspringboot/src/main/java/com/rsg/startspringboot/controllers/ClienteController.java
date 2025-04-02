package com.rsg.startspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rsg.startspringboot.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Bilbo", "123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Dark Magician", "322.356.553-34");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "Celtic Guardian", "233.892.908-38");
	}
}
