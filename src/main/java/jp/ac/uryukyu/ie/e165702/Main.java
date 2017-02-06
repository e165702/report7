package jp.ac.uryukyu.ie.e165702;

/**
 * Created by e165702 on 2017/02/03.
 */
public class Main{
    public static void main(String[] args){
        Human_active human_active = new Human_active();
        human_active.Player_first_active();
        if (human_active.getPlayer_score() == 21) {
            System.out.print("「blackjack」playerの勝ちです\n");
        }else if(human_active.getPlayer_score() != 21){
            human_active.Dealer_first_active();
        }
        if (human_active.getDealer_score() == 21) {
            System.out.print("「blackjack」dealerの勝ちです\n");
        }else if(human_active.getDealer_score() != 21&&human_active.getPlayer_score()<=20){
            human_active.Player_second_active();
        }
        if (21 < human_active.getPlayer_score()) {
            System.out.print("playerがburstしました。\n");
            System.out.print("dealerの勝ち。\n");
        }else if(21 > human_active.getPlayer_score() && human_active.getDealer_score()<=20){
            human_active.Dealer_second_active();
        }
        if (21 < human_active.getDealer_score()) {
            System.out.print("dealerがburstしました。\n");
            System.out.print("playerの勝ち。\n");
        }
        if (human_active.getPlayer_score()<=20 && human_active.getDealer_score() <=20){
            human_active.Final_judge();
        }

        System.out.print("終了");
    }
}

