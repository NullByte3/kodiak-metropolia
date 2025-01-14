package club.nullbyte3.kodiak.module1;

public class TaskObsolete {

    public static void main(String[] args) {
        System.out.println("Please, give the grams: ");
        double grams = Double.valueOf(new java.util.Scanner(System.in).nextLine());
        int leiviskas = (int) (grams / Obsolete.LEVISKA.grams);
        double remainingAfterLeviskas = grams % Obsolete.LEVISKA.grams;
        int naulas = (int) (remainingAfterLeviskas / Obsolete.NAULA.grams);
        double remainingAfterNaulas = remainingAfterLeviskas % Obsolete.NAULA.grams;
        double luotis = remainingAfterNaulas / Obsolete.LUOTI.grams;

        System.out.println(grams + " grams is "+leiviskas+" leiviskä, "+naulas+" naula, and "+luotis+" luoti.");
    }

    private enum Obsolete {

        LUOTI("luoti", 13.28),
        NAULA("naula", Obsolete.LUOTI.grams * 32),
        LEVISKA("leiviskä", Obsolete.NAULA.grams * 20);

        // I'd have used @Getters from lombok if I had, but for now, it's public.
        // I know it's not the state-of-the-art, but it should work.
        public final Double grams;
        public final String name;

        Obsolete(String name, Double grams) {
            this.grams = grams;
            this.name = name;
        }
    }
}
