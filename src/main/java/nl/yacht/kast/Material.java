package nl.yacht.kast;

import java.util.Random;

public enum Material {
    GLASS, WOOD, STEEL, IRON, GOLD;

    public static Material getRandomMaterial() {
        return Material.values()[new Random().nextInt(Material.values().length)];
    }

    public static int getMaterialStrength(Material m) {
        int materialStrength = 0;
        switch (m) {
            case GOLD:
                materialStrength = 99;
                break;
            case GLASS:
                materialStrength = 20;
                break;
            case WOOD:
                materialStrength = 40;
                break;
            case STEEL:
                materialStrength = 80;
                break;
            case IRON:
                materialStrength = 60;
                break;
        }
        return materialStrength;
    }
}
