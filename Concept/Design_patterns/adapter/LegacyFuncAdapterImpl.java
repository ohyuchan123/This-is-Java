package Concept.Design_patterns.adapter;

public class LegacyFuncAdapterImpl implements LegacyFuncAdapter {

    // 기존 Legacy interface 및 구현체를 이용
    private LegacyFunc legacyFunc;

    public LegacyFuncAdapterImpl(LegacyFunc legacyFunc) {
        this.legacyFunc = legacyFunc;
    }

    // legacy 의 결과를 이어서 추가로 처리할 내용
    private int convertLegacyData(int legacyResult) {
        System.out.println(legacyResult);
        return legacyResult * 2;
    }

    @Override
    public int calc(int num) {
        return convertLegacyData(legacyFunc.calc(num));
    }
}
