package jp.ac.uryukyu.ie.e165702;

/**
 * Created by e165702 on 2017/02/03.
 *~今回の課題で作成した「BLACKJACK」のゲームの流れ~
 ・初めにPlayerにカードを2枚配る
 　　＊この時点でPlayerの点数が21となった場合,Playerの勝ちとする
 ・次にDealerにカードを2枚配る
 　　＊この時点でDealerの点数が21となった場合,Dealerの勝ちとする
 ・カードを配り終えたらPlayerの行動に入る
 　Playerはhitかstandを選択する
 　hitが選択された場合カードを1枚引く
 　　＊この時点でbustした場合,Playerの負け
 ・Playerの行動が終了したら,Dealerの行動に入る
 　Dealerは自身の合計点が17以上になるようにする
 　17以下の場合,合計点が17以上になるまでカードを引く
 　　＊この時点でbustした場合,Dealerの負け
 　17以上の場合行動を終了する
 ・Dealerの行動が終了しPlayer,Dealerともにbustしなかった場合21に近い
 　方を勝者とする。

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
        }else if(human_active.getDealer_score() != 21&&human_active.getPlayer_score()<=21){
            human_active.Player_second_active();
        }
        if (21 < human_active.getPlayer_score()) {
            System.out.print("playerがburstしました。\n");
            System.out.print("dealerの勝ち。\n");
        }else if(21 > human_active.getPlayer_score() && human_active.getDealer_score()<=21){
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

