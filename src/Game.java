public class Game {
    public static void main(String[] args) {
    //Warrior player1 = new Warrior("Player1", 120, 20, 5, 42);
    //Mage player2 = new Mage("Player2", 130, 15, 7,12);
    Fight.fighting(CharacterGenerator.getRandomFighter(1),
            CharacterGenerator.getRandomFighter(2));


    }
}