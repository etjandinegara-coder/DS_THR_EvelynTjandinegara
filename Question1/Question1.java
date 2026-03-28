import java.util.*;

public class Question1 {

    static class Person {
        int time;
        int index;

        Person(int time, int index) {
            this.time = time;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int time = sc.nextInt();

            Person[] p = new Person[n];

            for (int i = 0; i < n; i++) {
                p[i] = new Person(sc.nextInt(), i + 1);
            }

            Arrays.sort(p, Comparator.comparingInt(a -> a.time));

            int totalTime = 0;
            List<String> steps = new ArrayList<>();

            int left = n - 1;

            while (left > 2) {

                int option1 = p[0].time + 2 * p[1].time + p[left].time;
                int option2 = 2 * p[0].time + p[left].time + p[left - 1].time;

                if (option1 < option2) {
                    steps.add(p[0].index + " " + p[1].index + " ->");
                    totalTime += p[1].time;

                    steps.add(p[0].index + " <-");
                    totalTime += p[0].time;

                    steps.add(p[left - 1].index + " " + p[left].index + " ->");
                    totalTime += p[left].time;

                    steps.add(p[1].index + " <-");
                    totalTime += p[1].time;
                } else {
                    steps.add(p[0].index + " " + p[left].index + " ->");
                    totalTime += p[left].time;

                    steps.add(p[0].index + " <-");
                    totalTime += p[0].time;

                    steps.add(p[0].index + " " + p[left - 1].index + " ->");
                    totalTime += p[left - 1].time;

                    steps.add(p[0].index + " <-");
                    totalTime += p[0].time;
                }

                left -= 2;
            }

            switch (left) {
                case 2 -> {
                    steps.add(p[0].index + " " + p[1].index + " ->");
                    totalTime += p[1].time;
                    steps.add(p[0].index + " <-");
                    totalTime += p[0].time;
                    steps.add(p[0].index + " " + p[2].index + " ->");
                    totalTime += p[2].time;
                }
                case 1 -> {
                    steps.add(p[0].index + " " + p[1].index + " ->");
                    totalTime += p[1].time;
                }
                case 0 -> {
                    steps.add(p[0].index + " ->");
                    totalTime += p[0].time;
                }
                default -> {
                }
            }

            if (totalTime <= time) {
                for (String s : steps) {
                    System.out.println(s);
                }
            } else {
                for (String s : steps) {
                    System.out.println(s);
                }
        
                List<Integer> notSurvive = new ArrayList<>();
                notSurvive.add(p[0].index);
                notSurvive.add(p[1].index);

                System.out.println("Non-survivors: " + notSurvive);
            }
        }
    }
}
