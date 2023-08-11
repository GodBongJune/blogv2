package shop.mtcoding.blogv2.board;

import org.springframework.data.jpa.repository.JpaRepository;

/*
 * 가지고있는 메서드
 * save(), findById(), findAll(), count(), deleteById()
 */
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
