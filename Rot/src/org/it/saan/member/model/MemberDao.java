package org.it.saan.member.model;

public interface MemberDao {
	public int createOne(MemberDto dto);
	public MemberDto readOne(String pk);
}
