package pw.entrance.seed.dao;

import java.util.List;

import pw.entrance.seed.domain.Hello;

public interface HelloDao {
	public List<Hello> selectAll();
}
