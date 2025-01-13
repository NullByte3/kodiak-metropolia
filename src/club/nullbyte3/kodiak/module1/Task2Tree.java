package club.nullbyte3.kodiak.module1;

public class Task2Tree {

    public static void main(String[] args) {
        String star = "*";
        for (int i = 0; i < 5; i++) {
            System.out.println(" ".repeat(4 - i) + star);
            star += "**";
        }
    }

}
