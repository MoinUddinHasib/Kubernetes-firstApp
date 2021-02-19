package it.reply.kubernetes.service;

import java.util.List;

import it.reply.kubernetes.model.Entry;

public interface EntryService {

	List<Entry> getAll();

	void inserisci(Long indice);

}
