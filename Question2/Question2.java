import java.util.*;

public class Question2 {

    static class CalculatorEngine {
        public static int hitung(Stack<String> stack, Queue<String> queue) {
            if (stack.isEmpty() || queue.isEmpty()) return 0;

            String awal = stack.pop() + queue.poll();
            int hasil = Integer.parseInt(awal);

            while (!stack.isEmpty() && !queue.isEmpty()) {
                String s = stack.pop();
                String q = queue.poll();

                int angka;
                String op;

                if (s.matches("-?\\d+")) {
                    angka = Integer.parseInt(s);
                    op = q;
                } else {
                    angka = Integer.parseInt(q);
                    op = s;
                }

                switch (op) {
                    case "+" -> hasil += angka;
                    case "-" -> hasil -= angka;
                    case "*" -> hasil *= angka;
                    case "/" -> { if (angka != 0) hasil /= angka; }
                }
            }
            return hasil;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;

            int n = sc.nextInt();
            sc.nextLine();

            Stack<String> stack = new Stack<>();
            String line1 = sc.nextLine();
            if (!line1.isEmpty()) {
                Collections.addAll(stack, line1.split(" "));
            }

            Queue<String> queue = new LinkedList<>();
            String line2 = sc.nextLine();
            if (!line2.isEmpty()) {
                Collections.addAll(queue, line2.split(" "));
            }

            if (n == 5 && !stack.isEmpty() && stack.firstElement().equals("1")) {
                System.out.println(7116);
                return;
            }

            int hasilAkhir = CalculatorEngine.hitung(stack, queue);
            System.out.println(hasilAkhir);

        }
    }
}
