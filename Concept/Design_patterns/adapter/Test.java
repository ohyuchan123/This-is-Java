package Concept.Design_patterns.adapter;

public class Test {
    public static void main(String[] args) {
        // Legacy system 처리
//      LegacyFunc legacyFunc = new LegacyFuncImpl();
//      System.out.println(legacyFunc.calc(10));
        // New system 처리
        LegacyFunc legacyFunc = new LegacyFuncImpl();
        LegacyFuncAdapter legacyFuncAdaper = new LegacyFuncAdapterImpl(legacyFunc);
        System.out.println(legacyFuncAdaper.calc(10));
    }
}
