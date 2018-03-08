package nl.yacht.kast;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class App {
    private static int exp = 1;

    public static void main(String[] args) {
        Closet closet;
        Material material;
        int matStrength;
        boolean succes = false;
        int attempt = 1;

        do {
            closet = new Closet(Material.getRandomMaterial());
            material = closet.getMaterial();
            matStrength = Material.getMaterialStrength(material);

            System.out.println("A new closet appeared, the material of the closet is " + material + " which has a strength of " + matStrength);

            succes = canIEnterTheCloset(Randomizer.kickTheDoor(matStrength));

            if (succes) {
                if (Randomizer.didIEnterNarnia()) {
                    System.out.println("I have entered Narnia !!! Sweet mother of God spank my ass and call me Jesus");
                    System.out.println("OH NO!! A white which appeared... I must slay this which to talk to Aslan");
                    System.out.println("Lets see how much exp i have: " + exp);
                    if(Randomizer.isTheWhichDefeated(exp)){
                        System.out.println("The which is defeated!!1 I love the smell of a bloody courpse");
                        System.out.println("Hello Aslan, what is the meaning of life?");
                        System.out.println("...............");
                        System.out.println("42");
                        printLion();

                    }else{
                        exp++;
                        succes = false;
                        System.out.println("Oh no the which didnt die... She threw me out of Narnia.... Now i must try to enter Narnia again..");
                    }
                } else {
                    System.out.println("Dammit..... no Narnia....... Maybe i can enter Narnia in the next closet!");
                    succes = false;
                }
            }


            System.out.println("this was attempt " + attempt);

            System.out.println("-------------------------------------------------------");
            attempt++;
        } while (!succes);

    }

    private static void printLion() {
        System.out.println("\n" +
                "    .u:o. -c:o.  ex::u.    .czeez* .edB$ e@$$eu\n" +
                "  e$MMMMMNu^$MMMb.#BMMM$c $MMM8P.d$RM$F4RMMMMMMRb\n" +
                "A$MMMMMMMMRb^$MMMMb^$MMMP MMMMF4$MMM8\"dRMMMMMMMMMN\n" +
                "zMM8M***M$8M$.#8MMM$.$8M&J$M$%$RMM8*.$R8$#\"\"\"\"\"BMM\n" +
                "$$\".e@Rmu. \"*M\"    '    ^^             .o$$RMM$c'$\n" +
                "$.$RMMMMMM$$$$ dRRRRRRRRRR$$MMMMMMRL'$$RMMMMMMMM$.\n" +
                ".$MMMMMMMMM$\" $RMMMMMMMMMMMMMMMMMMMMb ^4$MMMMMMMM$\n" +
                "JMMMM$$**\" ..$MMMMMMMMMMMMMMMMMMMMMMM$.:c  \"***$MM\n" +
                "$M\"..oenR$\".$MMMMMMMMMMMMMMMMMMMMMMMMM$.*$$MMMRc.*\n" +
                "* d$MMMM$\"u$MMMMMMMMMMMMMMMMMMMMMMMMM8MRc\"$MMMMM$b\n" +
                ".$RMMM$# J$MF       \"MMMMMMMMM   .....4M$b \"$MMMM$\n" +
                "dMM8P\"  dMMM$ $M8P4 4MMMMMMMMM 'L\"$M$ JMMMF  \"*88M\n" +
                "$$P\\d$$ $MMMM$L..d$r4MMMMMMMMM <$$u.e$RMMMF $M$c\"$\n" +
                "$ zRMM& ^8MMMMMMMMMF'MMMMMMMMM 4MMMMMMMMMG  $MMM$r\n" +
                " $RMMMF$f)MMMMMMMMMF'MMMMMMMMM 4MMMMMMMMMF.$'$MMMM\n" +
                "'MMM$FJR$ $MMMMMMMMF4MMMMMMMMM 4MMMMMMMM$ $Rh^$MMM\n" +
                "AMM8\\dRMMF RMMMMMMM 4MMMMMMMMM  MMMMMMM$\".MMMRb$MM\n" +
                "AM$.$MMMMF.3MMMM$P*-'*********- \"*NMMMM*..RMMMM$'$\n" +
                "AP.$RMMM$:$ $M$\".oM$.'$RRRRR$\".d$5u'*M$ $$?RMMMM$'\n" +
                "$ $MMMM$\\$Rb'P eMMMMM$c\"$M8# dRMMMMRc\"F4MMb^$MMMMb\n" +
                " $RMMMPzRMM!  eRMMMMMMR$c\" dRMMMMMMMR  'MMMR.?$MM$\n" +
                " $M8$ $MMMM\"x $MMMMMMMMMM ?MMMMMMMMM$ 3'$MMM$b'$MM\n" +
                "ARM$.$RMMMP $$'BMMMMMMMMM 4MMMMMMMM8P4$$ $MMMM$.$M\n" +
                "A$F4RMMMMf $RM  *88MMM88M J8MM888$$\\ @MMMr5MMMM$.$\n" +
                " $ $RMM8P.$MMMF?b.                z$F$MMMMc3BMMM$'\n" +
                "  4MMMM$-$RMM8F4MM$ '8MMMMMMMM$ dRMM$#8MMM$r#8MMM.\n" +
                "  4MMM$.$MMMM$ RMMM$ 3MMMM$ 8MMM\n" +
                "   $MM$'MMMMP zRMMM$ .'**4P*\".$ $MMMM$'$MMMM $MM$\n" +
                "   4MMC'MMMM$:$MMMMPoM$b   .@$M$$MMMMRL^$MMMF$M8\n" +
                "    \"$$'MMM$\\$MMMM$ MMMM$.4RMMM$r$MMMMRr*MMMN$$\"\n" +
                "     'N'$MM$4$MMMMF$MMMMM$$RMMMM$4$MMMM$$MMM @\n" +
                "        #$MN4MMMMMF$MMMMM$#MMMMMM RMMMM$$M$F\n" +
                "         ?$$.$MMMMF$MMMMMF RMMMMM $MMMM\\$MP\n" +
                "           *$'$MMMb3MMMMM  RMMMMNJRMMNFJ*\n" +
                "              #88$L#8MMMr RMMM$z$M8$\"\n" +
                "                 ^*$P/*B8$$R8M\"zP*\"");
    }

    private static boolean canIEnterTheCloset(boolean b) {
        if (!Randomizer.didTheHouseKeeperAppeared()) {
            if (b) {
                System.out.println("I broke the door...... cant enter beceause reasons");
                return false;
            }
            System.out.println("The door didnt break! I can enter the closet now ( why did i kicked the door -.- )");
        } else {
            System.out.println("AHHHHHHH the houseKeeper heared me and now she is torturing me!!!!");
            System.out.println("Crawling to a new place with the hopes of a new closet");
            try {
                TimeUnit.MILLISECONDS.sleep(HouseKeeper.TIME_OUT_MS);
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            return false;
        }
        return true;
    }
}
