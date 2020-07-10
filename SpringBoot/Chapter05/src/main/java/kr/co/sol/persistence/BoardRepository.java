package kr.co.sol.persistence;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import kr.co.sol.board.dto.Member;

public interface BoardRepository extends CrudRepository<Member, Integer> {
	List<Member> findByTitle(String searchKeyword);
	List<Member> findByContentContaining(String searchKeyword);
	List<Member> findByTitleContainingOrContentContaining(String title, String content); 
	List<Member> findByTitleContainingOrderBySeqDesc(String searchKeyword);
//	List<Board2> findByTitleContaining(String searchKeyword, Pageable paging);
	Page<Member> findByTitleContaining(String searchKeyword, Pageable paging);
	@Query("SELECT b FROM Board2 b WHERE b.title like %?1% ORDER BY b.seq DESC")
	List<Member> queryAnnotationTest1(String searchKeyword);
	@Query("SELECT b FROM Board2 b WHERE b.title like %:searchKeyword% ORDER BY b.seq DESC")
	List<Member> queryAnnotationTest2(@Param("searchKeyword") String searchKeyword);
	@Query("select b.seq, b.title, b.writer, b.createDate from Board2 b where b.title like %?1% order by b.seq desc")
	List<Object[]> queryAnnotationTest3(@Param("searchKeyword") String searchKeyword);
	@Query(value="select seq, title, writer, create_date from board2 where title like '%'||?1||'%' order by seq desc",nativeQuery=true)
	List<Object[]> queryAnnotationTest4(String searchKeyword);
	@Query("select b from Board2 b")
	List<Member> queryAnnotationTest5(Pageable paging);
}
