package org.it.saan.member.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberRegisterServiceImpl implements MemberRegisterService {
	@Autowired
	MemberDao memberDao;
	@Autowired
	MemberLogDao memberLogDao;

	public int service(MemberDto dto) {
		memberDao.createOne(dto);
		return memberLogDao.createOne(dto.getId());
	};
}
