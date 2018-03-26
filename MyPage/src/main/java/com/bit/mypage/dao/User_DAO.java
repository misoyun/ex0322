package com.bit.mypage.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit.mypage.vo.User_VO;

@Repository
public class User_DAO {

	@Autowired
	SqlSession sqlSession;
	
	public int insert(User_VO vo) 
	{
		return sqlSession.insert("joinUser", vo);
	}
	
	public boolean logincheck(User_VO vo) {
		String pw = sqlSession.selectOne("getPassword", vo);
		if(pw.equals(vo.getPw()))
			return true;
		else
			return false;
	}
	public int update(User_VO vo)
	{
		return sqlSession.update("updateUser", vo);
	}

	public int delete(User_VO vo)
	{
		return sqlSession.delete("deleteUser", vo);
	}
	
	public int searchFriend(String id)
	{
		return sqlSession.select("searchFriend", id);
	}

	public int showFriends(String id)
	{
		return sqlSession.selectList("showFriends", id);
	}
	
	
}
