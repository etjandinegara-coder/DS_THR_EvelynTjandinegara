import java.util.*;

class Card {
    int value;
    int type;

    Card(int value, int type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card c = (Card) o;
        return value == c.value && type == c.type;
    }

    @Override
    public int hashCode() {
        return value * 31 + type;
    }

    @Override
    public String toString() {
        return value + "," + type;
    }
}

public class Question4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder inputBuilder = new StringBuilder();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.isEmpty()) break;
                inputBuilder.append(line).append(" ");
            }

            String[] data = inputBuilder.toString().trim().split(" ");

            List<List<Card>> stacks = new ArrayList<>();

            for (String data1 : data) {
                String[] parts = data1.split(",");
                Card card = new Card(
                        Integer.parseInt(parts[0]),
                        Integer.parseInt(parts[1])
                );
                boolean placed = false;
                for (int j = 0; j < stacks.size(); j++) {
                    if (!stacks.get(j).contains(card)) {
                        stacks.get(j).add(card);
                        placed = true;
                        break;
                    }
                }

                if (!placed) {
                    List<Card> newStack = new ArrayList<>();
                    newStack.add(card);
                    stacks.add(newStack);
                }
            }

            for (List<Card> stack : stacks) {
                for (Card c : stack) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }

            sc.close();
        }
    }
}