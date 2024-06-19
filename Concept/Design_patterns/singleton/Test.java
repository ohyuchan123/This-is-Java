package Concept.Design_patterns.singleton;

public class Test {
    public static void main(String[] args) {
//        Logger logger = new Logger();
//        Logger logger2 = new Logger();

        Logger logger = Logger.getInstance();
        System.out.println(logger);

        m();
    }

    public static void m(){
        Logger logger = Logger.getInstance();
        System.out.println(logger);
        logger.log("첫 번째 로그입니다.");
    }
}
