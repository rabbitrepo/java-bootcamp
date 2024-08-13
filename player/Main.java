public class Main {

    public static class Player {
        String name;
        double salary;
    }

    public static void main(String[] args) {
        // Player p = new Player();
        // System.out.println(p.name);
        // // null
        // p.name = "David";
        // p.salary = 100;
        // System.out.println(p.name);
        // // David

        // Create an array of Player with 3 elements
        // Player[] all = new Player[3]; // สร้าง Array จำนวน 3 ช่อง
        // // System.out.println(all[0]); // null

        // all[0] = new Player(); // สร้าง Instance of Player และเก็บ Address ไว้ที่
        // all[0]
        // all[0].name = "David Beckham";
        // all[0].salary = 85000;

        // all[1] = new Player();
        // all[1].name = "Michael Owen";
        // all[1].salary = 70000;

        // all[2] = new Player();
        // all[2].name = "Wayne Rooney";
        // all[2].salary = 65000;

        // // finding avg salary
        // int players = 0;
        // double accumSalary = 0;

        // for (Player p : all) {
        // if (p != null) { // Check for null to avoid NullPointerException
        // players++;
        // accumSalary += p.salary;
        // }
        // }

        // double avgSalary = (players > 0) ? accumSalary / players : 0; // Avoid
        // division by zero

        // // Print results
        // System.out.printf("No. of Players: %d\n", players); // %d for integer
        // System.out.printf("Total Salary: %.2f\n", accumSalary); // %.2f for double
        // System.out.printf("Avg Salary: %.2f\n", avgSalary); // %.2f for double

        double[] scores = { 8.5, 8.7, 8.3, 8.1, 8.7 };

        // double result = 0;
        // for (int i = 0; i < scores.length; i++) {
        // // System.out.println(scores[i]);
        // if (i + 1 < scores.length) {
        // if (scores[i] < scores[i + 1]) {
        // // System.out.println(scores[i + 1]);
        // result = scores[i];
        // }
        // }
        // }
        // System.out.println(result);

        // given an array of decimal valies, write code to print the lowest value
        if (scores.length <= 0 || scores == null) {
            System.out.println("Invalid input");
        } else {

            // Given a non-empty of decimal values, write code fragment to print the min
            double picked = 0;

            for (int i = 0; i < scores.length; i++) {

                boolean isFirst = picked == 0;

                if (isFirst) {
                    picked = scores[i];
                } else {
                    if (picked < scores[i]) {
                        picked = scores[i];
                    }
                }
            }

            System.out.println(picked);
        }
    }

}