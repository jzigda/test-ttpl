package am.iunetworks.week3;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;

    private List<Integer> numbers;

    public Player(String name) {
        this.name = name;
        this.numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                '}';
    }
}

public class Lottery {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            players.add(new Player(i + 1 + ""));
        }
        Player winner = start(players);
    }

    private static Player start(List<Player> players) {
        while (true) {
            int number = (int) (Math.random() * 1000);
            System.out.println(MessageFormat.format("Picked number is : {0}", number));
            for (Player player : players) {
                player.getNumbers()
                        .remove(Integer.valueOf(number));
                if (player.getNumbers().isEmpty()) {
                    System.out.println(MessageFormat.format("Winner is {0}", player.getName()));
                    return player;
                }
            }
        }
    }
}

