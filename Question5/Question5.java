import java.util.*;

class Kartu {
    int nilai, kategori;

    Kartu(int n, int k) {
        nilai = n;
        kategori = k;
    }

    @Override
    public String toString() {
        return nilai + "," + kategori;
    }
}

public class Question5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Kartu>[] pemain = new ArrayList[4];

            for (int i = 0; i < 4; i++) {
                pemain[i] = new ArrayList<>();
                String[] input = sc.nextLine().split(" ");

                for (String s : input) {
                    String[] parts = s.split(",");
                    int n = Integer.parseInt(parts[0]);
                    int k = Integer.parseInt(parts[1]);
                    pemain[i].add(new Kartu(n, k));
                }

                pemain[i].sort((a, b) -> {
                    if (a.kategori != b.kategori)
                        return a.kategori - b.kategori;
                    return a.nilai - b.nilai;
                });
            }

            int sekarang = sc.nextInt() - 1;

            Stack<Kartu> tumpukan = new Stack<>();
            int pemainTerakhir = -1;
            int jumlahPass = 0;

            while (true) {
                ArrayList<Kartu> tangan = pemain[sekarang];

                if (tumpukan.isEmpty() || sekarang == pemainTerakhir) {
                    Kartu dipilih = tangan.remove(0);
                    tumpukan.push(dipilih);
                    pemainTerakhir = sekarang;
                    jumlahPass = 0;
                } else {
                    Kartu atas = tumpukan.peek();

                    boolean berhasil = false;

                    for (int i = 0; i < tangan.size(); i++) {
                        Kartu k = tangan.get(i);
                        if (k.kategori == atas.kategori && k.nilai > atas.nilai) {
                            tumpukan.push(k);
                            tangan.remove(i);
                            pemainTerakhir = sekarang;
                            jumlahPass = 0;
                            berhasil = true;
                            break;
                        }
                    }

                    if (!berhasil) {
                    }
                }

                if (jumlahPass == 3) {
                    sekarang = pemainTerakhir;
                    jumlahPass = 0;
                    continue;
                }

                if (pemain[sekarang].isEmpty()) {
                    System.out.println(sekarang + 1);

                    while (!tumpukan.isEmpty()) {
                        System.out.println(tumpukan.pop());
                    }
                    break;
                }

                sekarang = (sekarang + 1) % 4;
            }

        }
    }
}
