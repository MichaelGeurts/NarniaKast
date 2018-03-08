package nl.yacht.kast;

import java.util.Random;

public class Randomizer {

    private static int DEFAULT_CHANCE = 100;

    private static boolean didIBreakTheDoor(int materialStrength, int ownStrength) {
        if (ownStrength >= materialStrength) {
            return true;
        }
        return false;
    }

    public static boolean didIEnterNarnia() {
        return generateResult(DEFAULT_CHANCE);
    }

    private static boolean generateResult(int chance) {
        int youMustHaveThisNumber = 1;
        Random random = new Random();
        int chanceOfSucceeding = random.nextInt(chance);
        if (chanceOfSucceeding == youMustHaveThisNumber) {
            return true;
        }
        return false;
    }

    public static boolean kickTheDoor(int matStrength) {
        Random random = new Random();
        int ownStrength = random.nextInt(DEFAULT_CHANCE);
        System.out.println("Trying to kick te door down with a strength of " + ownStrength);
        return didIBreakTheDoor(matStrength, ownStrength);
    }

    public static boolean didTheHouseKeeperAppeared() {
        return generateResult(HouseKeeper.CHANCE_OF_DEFEATING);
    }

    public static boolean isTheWhichDefeated(int exp) {
        return generateResult(new WhiteWhitch(exp).getCHANCE_OF_DEFEATING());
    }
}
