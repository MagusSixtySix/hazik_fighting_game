public class Game {
    public static void main(String[] args) {
    Warrior player1 = new Warrior("Player1", 120, 20, 5, 12);
    Warrior player2 = new Warrior("Player2", 130, 15, 3,21);

    while (Fight.fighting(player1, player2)){
        System.out.println("Újabb kör!");
    }
    }
}