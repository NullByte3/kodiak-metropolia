package club.nullbyte3.kodiak.module1;

public class Task4Cats {
    private String name;

    public Task4Cats(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        Task4Cats cat = new Task4Cats("Whiskers");
        Task4Cats rex = new Task4Cats("Rex");
        cat.meow();
        cat.meow();
        rex.meow();
        cat.meow();
    }
}