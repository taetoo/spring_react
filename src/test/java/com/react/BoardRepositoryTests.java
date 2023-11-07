package com.react;

import com.react.domain.Board;
import com.react.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import java.util.stream.IntStream;

@SpringBootTest
@Commit
public class BoardRepositoryTests {

    @Autowired
    BoardRepository boardRepository;

    // 게시판의 게시물 샘플 데이터 300개 생성하는 테스트
    @Test
    public void insertBoardDummies() {
        IntStream.range(0, 300).forEach(i->{
            Board board = new Board();

            board.setTitle("Sample Board Title " + i);
            board.setContent("Content Sample ..."+i+" of Board");
            board.setWriter("user0"+(i%10));

            boardRepository.save(board);
        });
    }

}
