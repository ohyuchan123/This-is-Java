package Grammer.Enum;

public class WeekExample {
        // Enum 타입 정의
        public enum Grade {
            A, B, C, D, F
        }

        public static void main(String[] args) {
            int score = 85;
            Grade grade = getGrade(score);

            System.out.println("학생의 점수: " + score);
            System.out.println("학생의 학점: " + grade);
        }

        // 점수에 따라 학점을 반환하는 메서드
        public static Grade getGrade(int score) {
            if (score >= 90) {
                return Grade.A;
            } else if (score >= 80) {
                return Grade.B;
            } else if (score >= 70) {
                return Grade.C;
            } else if (score >= 60) {
                return Grade.D;
            } else {
                return Grade.F;
            }
        }
}

