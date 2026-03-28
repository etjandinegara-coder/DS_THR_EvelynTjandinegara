import java.util.*;

class Data {
    String nama;
    int key;
    int priority;
    int urutan;

    Data(String nama, int key, int priority, int urutan) {
        this.nama = nama;
        this.key = key;
        this.priority = priority;
        this.urutan = urutan;
    }
}

public class Question3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                sc.nextInt();
            }

            ArrayList<Data> list = new ArrayList<>();

            String[] nama = new String[n];
            int[] key = new int[n];

            for (int i = 0; i < n; i++) {
                nama[i] = sc.next();
                key[i] = sc.nextInt();
            }

            int[] priority = new int[n];
            for (int i = 0; i < n; i++) {
                priority[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                list.add(new Data(nama[i], key[i], priority[i], i));
            }

            ArrayList<Integer> urutanKey = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (!urutanKey.contains(key[i])) {
                    urutanKey.add(key[i]);
                }
            }

            for (int k : urutanKey) {
                ArrayList<Data> temp = new ArrayList<>();

                for (Data d : list) {
                    if (d.key == k) {
                        temp.add(d);
                    }
                }

                Collections.sort(temp, (a, b) -> {
                    if (a.priority != b.priority) {
                        return a.priority - b.priority;
                    } else {
                        return a.urutan - b.urutan;
                    }
                });

                for (Data d : temp) {
                    System.out.println(d.nama + " | " + d.key);
                }
            }
        }
    }
}
