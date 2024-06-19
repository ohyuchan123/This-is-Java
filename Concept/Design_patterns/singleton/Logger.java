package Concept.Design_patterns.singleton;

import java.time.LocalDateTime;

// app 전체에서 log를 담당하는 클래스
// 이 클래스의 객체는 단 한개
public class Logger {

    // private static Logger 변수
//    private static Logger logger = new Logger(); // 방법 : 1
    private static Logger logger; //방법 : 2

    // 생성자를 private로
    private Logger(){ }

    // static 메서드로 외부에서 객체를 얻을 수 있는 방법 제공
    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message){
        LocalDateTime ldt = LocalDateTime.now();
        String date = ldt.getYear() + "/" + ldt.getMonthValue() + "/" +
                ldt.getDayOfMonth();
        String time = ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond();

        System.out.println("["+date+" "+time+"] "+message);
    }
}
