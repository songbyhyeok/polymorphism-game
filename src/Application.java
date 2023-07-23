import Overwatch.*;

public class Application {
    private PlayerManager pm = new PlayerManager();

    private Arena arena = new Arena();
    private Player player1, player2;


    public static void main(String[] args) {
        Application app = new Application();
        app.showIntro();
    }

    private void showIntro() {
        System.out.println("오버워치에 오신 걸 환영합니다.");
        player1 = pm.pickHero(1);
        player1.init(100,3);

        player2 = pm.pickHero(2);
        player2.init(100,3);

        arena.init(player1, player2);
        arena.duel();
    }
}
