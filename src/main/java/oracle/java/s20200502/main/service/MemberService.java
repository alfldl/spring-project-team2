package oracle.java.s20200502.main.service;

import javax.servlet.http.HttpSession;

import oracle.java.s20200502.main.model.Member;

public interface MemberService {
	Member login(Member member, HttpSession session);//로그인 체크 Service
	int memberShip(Member member);//회원가입 처리 Service
	Member duplicateCheck(Member member);//이메일 중복체크
	Member nickNameCheck(Member member);//닉네임 중복체크
	Member myInfoSave(Member member);//회원정보수정
	Member memberDelete(Member member);//회원탈퇴
	Member pwChange(Member member);//회원 비밀번호 수정
	Member emailNumSearch(Member member);//이메일 고유넘버 가져오기
	Member PassSearch(Member member);//패스워드 재설정 실행
	Member idExistenceChk(Member member);//아이디 존재 여부
	Member myIfoUpdate(Member member,HttpSession session);//회원정보 수정 세션 업데이트
}
