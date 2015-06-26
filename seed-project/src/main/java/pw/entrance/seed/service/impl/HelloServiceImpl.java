package pw.entrance.seed.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pw.entrance.seed.dao.HelloDao;
import pw.entrance.seed.domain.Hello;
import pw.entrance.seed.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {
	
	@Autowired
	private HelloDao helloDao;

	public String sayHello() {
		List<Hello> list = this.helloDao.selectAll();
		StringBuffer sb = new StringBuffer();
		if (list != null && !list.isEmpty()) {
			for (Hello elem : list) {
				sb.append("hello, " + elem.getName());
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
}
