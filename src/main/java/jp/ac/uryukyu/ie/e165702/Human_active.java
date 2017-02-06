package jp.ac.uryukyu.ie.e165702;

/**
 * Created by e165702 on 2017/02/03.
 */
import java.util.Scanner;
/*
PlayerとDealerが行動をするためのクラス
 */
public class Human_active extends Make_hands{
    private int player_score = 0;
    //private int player_hands=0;

    public void Player_first_active() {
        /*Playerに初期カードを配布するメソッド
        Playerに二枚カードが配られる
         */
        System.out.printf("playerの初期行動。\n");
        for (int i = 0; i <= 1; ) {
            Player_hands();
            if (not_duplication==true) {
                //player_hands = draw_card;
                player_score = player_score + draw_card;//Playerの合計得点を更新
                System.out.printf("playerの点数は%sです\n", player_score);
                i++;

            }
        }
    }
    public void Player_second_active() {
        /*playerのカードを追加するメソッド
        1を入力することでhitを選択する
       hitが選択されるとカードを一枚引く
       2を入力することでstandを選択する
       standが選択されるとPlayerは行動を終了する
         */
        System.out.print("playerの行動。\n");
        while (player_score <= 21) {
            System.out.print("1,hit 2,stand\n");
            String input;
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
            int c = Integer.parseInt(input);
            if (c == 1) {
                for (int i = 0; i < 1; i++) {
                    Player_hands();
                    if (not_duplication==true) {
                        //player_hands = draw_card;
                        player_score = player_score + draw_card;//Playerの合計得点を更新
                        System.out.printf("playerの点数は%sです\n", player_score);
                        i++;
                    }
                }
            } else {
                System.out.print("standが選択されました。\n");
                System.out.print("Player行動終了\n");

                break;
            }
        }
    }

    private int dealer_score = 0;
    //private int dealer_hands=0;
    public void Dealer_first_active() {
        /*Dealerに初期カードを配布するメソッド
        Dealerに二枚カードが配られる
         */
        System.out.print("dealerの初期行動。\n");
        for (int i = 0; i <= 1; ) {
            Dealer_hands();
            if (not_duplication==true) {
                //dealer_hands = draw_card;
                dealer_score = dealer_score + draw_card;//Dealerの合計得点を更新
                i++;
            }
        }
    }
    public void Dealer_second_active(){
        /*
        Dealerのカードを追加するメソッド
        Deal合計点が16以下の場合カードを一枚追加する
        Deal合計点が17以上の場合Dealerの行動を終了する
         */
        System.out.print("dealerの行動。\n");
        while (dealer_score <= 20) {
            if (dealer_score <= 16) {
                for (int i = 0; i < 1; i++) {
                  Dealer_hands();
                    if (not_duplication==true) {
                        //if (0 <= dealer_hands && dealer_hands <= 12) {
                            //dealer_hands = draw_card;
                            dealer_score = dealer_score + draw_card;//Dealerの合計得点を更新
                        //}
                    }
                }
            }
            break;
        }
        System.out.print("Dealer行動終了\n");
    }
    public void Final_judge(){
        /*
        Player,Dealerともにbustしなかったとき,21に近いほうを判断するメソッド
         */
        System.out.print("最終ジャッジ。\n");
        int player_judge = player_score - 21;
        int dealer_judge = dealer_score - 21;
        if (player_judge >= dealer_judge) {
            System.out.print("playerの勝ち。\n");
        }else if(player_judge == dealer_judge){
            System.out.print("引き分け\n");
        }
        else{
            System.out.print("dealerの勝ち。\n");
        }
    }
    public int getPlayer_score(){return player_score;}
    public int getDealer_score(){return dealer_score;}
}

