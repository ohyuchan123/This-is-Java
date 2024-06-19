package Concept.Design_patterns.builder.Board;

public class BoardTest {
    public static void main(String[] args) {
        Board board = new Board.Builder()
                .title("제목3")
                .content("제목3")
                .category("분류")
                .build();

        System.out.println(board);
    }
}
