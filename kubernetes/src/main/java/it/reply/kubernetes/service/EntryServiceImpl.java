package it.reply.kubernetes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.reply.kubernetes.dao.EntryDao;
import it.reply.kubernetes.model.Entry;

@Service
public class EntryServiceImpl implements EntryService {
	
	@Autowired
	private EntryDao entryDao;

	@Override
	public List<Entry> getAll() {
		return entryDao.findAll();
	}

	@Override
	public void inserisci(Long indice) {
		Long val= fact(indice);
		
		Entry entry = new Entry();
		entry.setIndice(indice);
		entry.setValore(val);

		entryDao.save(entry);
	}

	private Long fact(Long indice) {
		if(indice==0) return 1L;
		return indice * fact(indice-1);
	}

}
