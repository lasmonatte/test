package org.it.saan.member.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IdCheckService {
	
	@Autowired
	MemberDao dao;
	
	public boolean service(String id) {
		MemberDto dto = dao.readOne(id);
		if(dto == null) 
			return true;
		else 
			return false;
	}
}
