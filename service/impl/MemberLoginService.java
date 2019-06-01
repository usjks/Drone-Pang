package service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import service.MemberVO;
import service.common.JDBCUtil;

public class MemberLoginService {

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	public boolean login(MemberVO vo) throws Exception {
		MemberDAOJDBC memberDAO = new MemberDAOJDBC();
		boolean loginResult = false; // 기본값 

		String loginID = memberDAO.loginOk(vo);

		if (loginID != null) { // 아이디 값이 있다면 
			loginResult = true; //  tryue qksghks 
			System.out.println(loginResult);

		}

		return loginResult;  

	}

	public void logout(HttpSession session) {
		session.invalidate(); // 세션 끄기 
	}
	
	
	public boolean idCheck(MemberVO vo) throws Exception {
		 MemberDAOJDBC memberDAO = new MemberDAOJDBC();
		 boolean idcheckResult = false ;
		String checkID = memberDAO.checkID(vo);
		
		if (checkID != null) {
			idcheckResult = true;
			System.out.println(idcheckResult);

		}
		 
		 System.out.println(idcheckResult);
		 return idcheckResult; 
	}

}
