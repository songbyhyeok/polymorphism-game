import Overwatch.*;

import java.util.Scanner;

public class Arena {

    private Player player1, player2;

    public void init(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void duel() {
        System.out.println("대결을 시작해주세요!");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("플레이어 1번 차례입니다");
            System.out.println("스킬을 골라주세요");

            String str = "";
            String str1 = "";
            String str2 = "";
            System.out.println(player1.getIdentity());
            switch (player1.getIdentity()) {
                case 1:
                    str = "1. 팅겨내기";
                    str1 = "2. 질풍참";
                    str2 = "3. 이단점프";
                    break;
                case 2:
                    str = "1. 폭풍화살";
                    str1 = "2. 음파화살";
                    str2 = "3. 벽타기";
                    break;
                case 3:
                    str = "1. 피스키퍼";
                    str1 = "2. 자탄수류탄";
                    str2 = "3. 구르기";
                    break;
            }

            System.out.println(str + ' ' + str1 + ' ' + str2);

            int num = sc.nextInt();
            if (num == 1) {
                player2.setHp(player2.getHp() - player1.attack());
            } else if (num == 2) {
                player2.setHp(player2.getHp() - player1.eattack());
            } else {
                switch (player1.toString()) {
                    case "Overwatch.Genji":
                        ((Genji) player1).doublejump();
                        break;
                    case "Overwatch.Hanzo":
                        ((Hanzo) player1).wall();
                        break;
                    case "Overwatch.Mccree":
                        ((Mccree) player1).gurugi();
                        break;
                }

                /*if (player1.getIdentity() == 1) {
                    ((Genji) player1).doublejump();
                } else if (player1.getIdentity() == 2) {
                    ((Hanzo) player1).wall();
                } else {
                    ((Mccree) player1).gurugi();
                }*/

            }
            System.out.println("Player2 HP : " + player2.getHp());
            if (player2.getHp() <= 0) {
                System.out.println("플레이1이 이겼습니다");
                break;
            }

            System.out.println("플레이어 2번 차례입니다");
            switch (player2.getIdentity()) {
                case 1:
                    str = "1. 팅겨내기";
                    str1 = "2. 질풍참";
                    str2 = "3. 이단점프";
                    break;
                case 2:
                    str = "1. 폭풍화살";
                    str1 = "2. 음파화살";
                    str2 = "3. 벽타기";
                    break;
                case 3:
                    str = "1. 평타치기";
                    str1 = "2. 자탄수류탄";
                    str2 = "3. 구루기";
                    break;
            }

            System.out.println(str + ' ' + str1 + ' ' + str2);

            num = sc.nextInt();
            if (num == 1) {
                player1.setHp(player1.getHp() - player2.attack());
            } else if (num == 2) {
                player1.setHp(player1.getHp() - player2.eattack());
            } else {
                switch (player2.toString()) {
                    case "Overwatch.Genji":
                        ((Genji) player2).doublejump();
                        break;
                    case "Overwatch.Hanzo":
                        ((Hanzo) player2).wall();
                        break;
                    case "Overwatch.Mccree":
                        ((Mccree) player2).gurugi();
                        break;
                }

                /*if (player2.getIdentity() == 1) {
                    ((Genji) player2).doublejump();
                } else if (player2.getIdentity() == 2) {
                    ((Hanzo) player2).wall();
                } else {
                    ((Mccree) player2).gurugi();
                }*/

            }

            System.out.println("Player1 HP : " + player1.getHp());
            if (player1.getHp() <= 0) {
                System.out.println("플레이2이 이겼습니다");
                break;
            }
        }

    }


}
