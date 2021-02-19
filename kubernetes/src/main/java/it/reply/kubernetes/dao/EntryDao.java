package it.reply.kubernetes.dao;

import java.util.List;

import it.reply.kubernetes.model.Entry;

public interface EntryDao {

	List<Entry> findAll();

	void save(Entry entry);

}
