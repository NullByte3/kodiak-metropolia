package club.nullbyte3.kodiak.module1;

public class TaskMathPractice {
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            int correct = 0;
            for (int i = 0; i < 10; i++) {
                int rand1 = (int) (Math.random() * 9) + 1;
                int rand2 = (int) (Math.random() * 9) + 1;
                System.out.println("("+(i+1)+"/10) What is " + rand1 + " * " + rand2 + "?");
                int answer = Integer.valueOf(new java.util.Scanner(System.in).nextLine());
                if (answer == rand1 * rand2) {
                    correct++;
                }
            }
            if (correct == 10) {
                System.out.println("Congratulations! You got all correct!");
            } else {
                System.out.println("You got " + correct + " correct out of 10.");
            }
        }
    }
}
