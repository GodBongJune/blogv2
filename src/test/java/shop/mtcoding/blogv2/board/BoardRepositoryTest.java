package shop.mtcoding.blogv2.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import shop.mtcoding.blogv2.user.User;

@DataJpaTest
public class BoardRepositoryTest {
    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void save_test() {
        // 비영속객체
        Board board = Board.builder()
                .title("제목6")
                .content("내용6")
                .user(User.builder().id(2).build())
                .build();
        // userId넣는거 잘 이해해
        // User user = new User();
        // user.setId(1);
        // board.setUser(user);
        // System.out.println("테스트: " + board.getId());

        // 영속 객체
        boardRepository.save(board); // insert 자동으로 실행
        // DB데이터와 동기화됨
        System.out.println("테스트 :" + board.getId());

    }

}
