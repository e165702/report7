package jp.ac.uryukyu.ie.e165702;

/**
 * Created by e165702 on 2017/02/03.
 */
public class Main{
    public static void main(String[] args){
        Human human = new Human();
        human.Player_first_active();
        if (human.getBust_count() == 21) {
            System.out.printf("「blackjack」playerの勝ちです\n");
        }else if(human.getBust_count() != 21){
            human.Dealer_first_active();
        }
        if (human.getBust_count2() == 21) {
            System.out.printf("「blackjack」dealerの勝ちです\n");
        }else if(human.getBust_count2() != 21&&human.getBust_count()<=20){
            human.Player_second_active();
        }
        if (21 < human.getBust_count()) {
            System.out.printf("bustしました。\n");
            System.out.printf("dealerの勝ち。\n");
        }else{
            human.Dealer_second_active();
        }
        if (21 < human.getBust_count2()) {
            System.out.printf("bustしました。\n");
            System.out.printf("playerの勝ち。\n");
        }
        if (human.getBust_count()<=20 && human.getBust_count2() <=20){
            //最終ジャッジ
            System.out.printf("最終ジャッジ。\n");
            int player_jage = human.getBust_count() - 21;
            int dealer_jage = human.getBust_count2() - 21;
            if (player_jage >= dealer_jage) {
                System.out.printf("playerの勝ち。\n");
            }else if(player_jage == dealer_jage){
                System.out.printf("引き分け\n");
            }
            else{
                System.out.printf("dealerの勝ち。\n");
            }
        }

        System.out.printf("終了");
    }
}

