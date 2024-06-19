package Concept.Design_patterns.builder.Board;

public class Board {
    private String title;
    private String content;
    private String category;

    @Override
    public String toString() {
        return "Board{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public Board(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.category = builder.category;
    }

    // Board를 사용하는 쪽에 먼저 노출되어서 가짜 set 작업을 수행한 후, 마지막에 build() 호출되면 진짜 Board 객체를 생성해서 return 합니다.
    public static class Builder{
        private String title;
        private String content;
        private String category;

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder content(String content){
            this.content = content;
            return this;
        }

        public Builder category(String category){
            this.category = category;
            return this;
        }

        public Board build(){
            return new Board(this);
        }
    }
}
