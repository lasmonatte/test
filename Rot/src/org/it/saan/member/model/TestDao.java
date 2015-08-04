package org.it.saan.member.model;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class TestDao {

	@Autowired
	SqlSession session;

	public int readAll() {
		System.out.println("resa");
		return session.insert("org.it.saan.member.model.TestDao.createOne");
	}
	
	
}
