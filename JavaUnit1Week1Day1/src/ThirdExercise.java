public class ThirdExercise {

    public static void inserisciInArray(String[] args) {

        String[] array1 = {"primo", "secondo", "terzo", "quarto", "quinto"};
        String nuovaStringa = "sesto";
        String[] array2 = inserisciInArray(array1, nuovaStringa);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

    public static String[] inserisciInArray(String[] array, String nuovaStringa) {
        String[] nuovoArray = new String[6];
        for (int i = 0; i < array.length; i++) {
            if (i < 3) {
                nuovoArray[i] = array[i];
            } else if (i == 3) {
                nuovoArray[i + 1] = array[i];
            } else {
                nuovoArray[i + 1] = array[i];
            }
        }
        nuovoArray[3] = nuovaStringa;
        return nuovoArray;
    }
}
