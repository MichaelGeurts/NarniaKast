package nl.yacht.kast;

public class WhiteWhitch {
    public  int CHANCE_OF_DEFEATING = 100;

    public WhiteWhitch(int exp){
        CHANCE_OF_DEFEATING = determineChance(exp);
    }

    private int determineChance(int exp) {
        return Math.round(100/exp);
    }

    public int getCHANCE_OF_DEFEATING() {
        return CHANCE_OF_DEFEATING;
    }
}
