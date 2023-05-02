public class Main {

    public static void main(String[] args) {

        int prodotto = FirstExercise.moltiplica(2, 3);
        System.out.println("Il prodotto di 2 e 3 è " + prodotto);

        String risultato = SecondExercise.concatena("stringa", 3);
        System.out.println("Il risultato della concatenazione è " + risultato);

        String[] array = {"primo", "secondo", "terzo", "quarto", "quinto"};
        String[] newArray = ThirdExercise.inserisciInArray(array, "nuova stringa");
        for (String s : newArray) {
            System.out.print(s + " ");
        }
    }
}
