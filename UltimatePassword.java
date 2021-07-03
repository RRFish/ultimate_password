
public class UltimatePassword {
    public static void main(String[] args) {
        Gamer p1 = new EvenAI("OddAI");
        Gamer p2 = new Player("yotsai");
        Game game = new Game(p1, p2, 100, 0);

        game.startGame();


    }
    
}