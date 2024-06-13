package Concept.Design_patterns.adapter;

public class LegacyImpl implements LegacyFunc{

    @Override
    public int calc(int num) {
        // Legacy 는 x 10
        return 0;
    }
}
