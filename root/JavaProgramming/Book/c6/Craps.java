import java.security.SecureRandom;

public class Craps {

    public static int playerPontuation;
    public static int trysRoll = 0;

    public static int rollDice() {
        SecureRandom dice1 = new SecureRandom();
        SecureRandom dice2 = new SecureRandom();

        int face1 = 1 + dice1.nextInt(6);
        int face2 = 1 + dice2.nextInt(6);

        System.out.printf("Roll Dice: %d + %d = %d\n", face1, face2, face1 + face2);

        playerPontuation = face1 + face2;
        trysRoll += 1;

        return playerPontuation;
    }

    public static void main(String[] args) {

        boolean playerLost = true;
        boolean homeLost = true;

        while (playerLost && homeLost) {
            int result = rollDice();

            switch (result) {
                case 2:
                    playerLost = false;
                case 3:
                    playerLost = false;
                case 12:
                    playerLost = false;
            }
        }
        
    }
}