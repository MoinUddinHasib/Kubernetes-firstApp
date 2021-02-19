package it.reply.kubernetes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import it.reply.kubernetes.model.Entry;
import it.reply.kubernetes.service.EntryService;

@RestController
public class EntryController {
	
	@Autowired
	private EntryService entryService;
	
	@CrossOrigin
	@GetMapping("/all")
	public ResponseEntity<List<Entry>> getAll(){
		return ResponseEntity.ok().body(entryService.getAll());
	}
	
	@CrossOrigin
	@PostMapping("/{indice}")
	public ResponseEntity<String> create(@PathVariable("indice") Long indice) {
		entryService.inserisci(indice);
		return ResponseEntity.ok().body("Inserito!");
	}

}
