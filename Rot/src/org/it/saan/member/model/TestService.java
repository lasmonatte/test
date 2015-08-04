package org.it.saan.member.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {

		@Autowired
		TestDao testDao;

		public int service() {
			System.out.println("SAfasfsafsafa");
			return testDao.readAll();
		};
	}

