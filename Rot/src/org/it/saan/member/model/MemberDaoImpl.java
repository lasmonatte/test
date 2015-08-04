package org.it.saan.member.model;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDaoImpl implements MemberDao {
	@Autowired
	SqlSession session;

	@Override
	public int createOne(MemberDto dto) {
		return session.insert("org.it.saan.member.model.MemberDao.createOne", dto);
	}

	@Override
	public MemberDto readOne(String pk) {
		return session.selectOne("org.it.saan.member.model.MemberDao.readOne", pk);
	}
	
}
