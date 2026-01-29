public class Game {

    public static void main(String[] args) {
        String nom = "Sebas";
        int vida = 100;
        int nivell = 5;

        mostrarJugador(nom, vida, nivell);
    }

    public static void mostrarJugador(String nom, int vida, int nivell) {
        System.out.println("Nom: " + nom);
        System.out.println("Vida: " + vida);
        System.out.println("Nivell: " + nivell);
    }
}
