package am.iunetworks.JohnVahanyan.week3;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Battle {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
//            players.add(new Player(i + 1 + "", (int) (Math.random() * 100), (int) (Math.random() * 100)));
        }
        start(players);
    }

    private static void start(List<Player> players) {
        while (players.size() != 1) {
            List<Player> deadPlayersThatNeedToRemove = new ArrayList<>();
            for (int i = 0; i < players.size() - 1; i++) {
//                Player deadPlayer = fightAndReturnDeadPlayer(players.get(i), players.get(i + 1));
//                deadPlayersThatNeedToRemove.add(deadPlayer);
            }
            players.removeAll(deadPlayersThatNeedToRemove);
        }
//        System.out.println(MessageFormat.format("Winner is: {0}", players.get(0)));
    }

    private static Player fightAndReturnDeadPlayer(Player player1, Player player2) {
        long currentTimeMillisStart = System.currentTimeMillis();

        boolean firstPlayerTurn = true;
        //make random
        while (!player1.isDead() || !player2.isDead()) {
            if (firstPlayerTurn) {
                player1.setHealth(player1.getHealth() - player2.getPower());
            } else {
                player2.setHealth(player2.getHealth() - player1.getPower());
            }
            firstPlayerTurn = !firstPlayerTurn;
        }

        long currentTimeMillisEnd = System.currentTimeMillis();
        System.out.println(currentTimeMillisEnd - currentTimeMillisStart);


        return player1.isDead() ? player1 : player2;
    }

    static class Player {
        private String name;

        private int power;
        private int health;

        public Player(String name, int power, int health) {
            this.name = name;
            this.power = power;
            this.health = health;
        }

        public boolean isDead() {
            return health <= 0;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "name='" + name + '\'' +
                    ", power=" + power +
                    ", health=" + health +
                    '}';
        }
    }
}
