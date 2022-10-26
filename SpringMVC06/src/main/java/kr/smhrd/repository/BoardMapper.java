package kr.smhrd.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.entity.Board;
import kr.smhrd.entity.Criteria;
import kr.smhrd.entity.Member;

// jdbc API(CRUD) -> 생산성이 떨어진다, 유지보수가 어렵다.
//MyBatis Framework : java-- 분리개발(mapping)--> SQL(xml)
// http:// mybatis.org

//JDBC API(CRUD)-> 생산성이 떨어진다. 
//= 개발시간이 오래걸린다.
//유지 보수가 어렵다.(JAVA+SQL) 

//위의 문제점 대안
//별도의 프레임워크이다.
//java와 sql를 분리해서 개발
//java <--분리개발(mapping) ---> sql(.xml)
//우리가할것은 java와 sql를 분리시켜야된다.
//MyBatis Framework

//http://mybatis.org
public interface BoardMapper {
	//sql를 저장할폴더가있어야된다.
	//.xml 파일로 만들어야되고 src/main/resources에 저장해야된다
	
	// BoardMapper.xml의 결과인 전체리스틀 가져오는 메소드
	// db와 연결하고 그런걸 다 mybatis에서 다해준다,
	// 이 메서드 이름을 mapper.xml에서  select id ="" 에 이름을 넣주자
	// 왜 선언만 하는가?
	// -> mybatis 프레임워크가 우리가하는 일을 대신한다.
	// 따라서 class이름대신 interface로 바뀌고
	// 이름은 BoardMapper이다. 
 
	
	// 전체리스트를 가져오는 메서드
	public List<Board> getList(Criteria cri);
	// 등록 메서드
	public void register(Board vo);//insert sql
		
	//상세보기
	public Board get(int idx); //select SQL~
	
	public void remove(int idx); //delete sql
	
	public void update(Board vo); 
	
	//조회수 누적 메소드
	public void countUpdate(int idx); //update query
	
	//Member member의 정보가 db의 정보와 맞으면 회원정보를 가져와야기때문에
	//Member를 리턴
	public Member Login(Member member);
	
	//bseq를 1씩 증가시키는 메서드
	public void replySeqUpdate(Board parent);
	
	//답글 insert 
	public void replyInsert(Board vo);
	
	public int totalCount(Criteria cri);
	
	@Select("select * from reply where title like concat('%',#{keyword},'%')")
	public List<Board> getJsonList(String keyword);  // select * from reply
	
}
