package Concept.Design_patterns.builder.methodchain;

public class Test {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
//      // 3 + 5
//      calc.setFirst(3);
//      calc.setSecond(5);
//      calc.showAdd();
//      // 3 - 1
//      calc.setSecond(1);
//      calc.showSub();
//      // 6 - 1
//      calc.setFirst(6);
//      calc.showSub();

        // method chain
        calc.setFirst(3).setSecond(5).showAdd().setSecond(1).showSub();


        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        sb.append("def");
        sb.append("123")
                .append("456")
                .append("789");
    }
}
