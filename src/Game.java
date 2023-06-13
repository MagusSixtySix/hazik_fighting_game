public class Game {
    public static void main(String[] args) {
    Warrior player1 = new Warrior("Player1", 120, 20, 5, 42);
    Warrior player2 = new Warrior("Player2", 130, 15, 7,58);
    int round = 1;

    while (Fight.fighting(player1, player2)){
        System.out.println(round+". kör!");
        round++;
    }
    }
}