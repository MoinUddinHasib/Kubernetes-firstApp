package it.reply.kubernetes.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import it.reply.kubernetes.model.Entry;

@Repository
public class EntryDaoImpl implements EntryDao {
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	private static final String KEY = "ENTRY";

	@Override
	public List<Entry> findAll() {
        return redisTemplate.opsForHash().values(KEY);
	}

	@Override
	public void save(Entry entry) {
		redisTemplate.opsForHash().put(KEY, entry.getIndice().toString(), entry);

	}


}
