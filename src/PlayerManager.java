import Overwatch.*;

import java.util.Scanner;

public class PlayerManager {
    private Scanner scan = new Scanner(System.in);


    public Player pickHero(int playerNumber) {
        System.out.println(playerNumber + "번째 플레이어 영웅을 골라주세요.");
        System.out.println("1. 겐지, 2. 한조, 3. 맥크리");

        int selectedHero = scan.nextInt();

        while (!(0 < selectedHero && selectedHero < 4)) {
            System.out.println("영웅을 골라주세요.");
            System.out.println("1. 겐지, 2. 한조, 3. 맥크리");

            selectedHero = scan.nextInt();
        }

        Player player = null;

        switch (selectedHero) {
            case 1: // 겐지
                player = new Genji();
                ((Genji) player).setIdentity(1);
                System.out.println((Genji) player+" 영웅을 골랐습니다!");
                break;
            case 2: // 한조
                player = new Hanzo();
                ((Hanzo) player).setIdentity(2);
                System.out.println((Hanzo) player+ " 영웅을 골랐습니다!");
                break;
            case 3: // 맥크리
                player = new Mccree();
                ((Mccree) player).setIdentity(3);
                System.out.println((Mccree) player +" 영웅을 골랐습니다!");
                break;
        }

        System.out.println(player.toString());

        return player;
    }
}
