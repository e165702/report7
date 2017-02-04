package jp.ac.uryukyu.ie.e165702;

/**
 * Created by e165702 on 2017/02/03.
 */
import java.util.Scanner;
public class Human_active extends Make_hands{
    //Hands_list h = new Hands_list();
    private int player_score = 0;
    private int player_hands=0;

    public void Player_first_active() {
        //playerに初期カードを配布
        System.out.printf("playerの初期行動。\n");
        for (int i = 0; i <= 1; ) {
            Player_hands();
            if (not_duplication==true) {
                player_hands = draw_card;
                player_score = player_score + player_hands;//総合得点
                System.out.printf("playerの点数は%sです\n", player_score);
                i++;

            }
        }
    }
    public void Player_second_active() {
        System.out.printf("playerの行動。\n");
        //h.i3_d = 4;
        //playerカードの追加
        while (player_score <= 21) {
            System.out.printf("1,hit 2,stand\n");
            String input;
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
            //System.out.printf("%s\n", input);
            int c = Integer.parseInt(input);
            if (c == 1) {
                for (int i = 0; i < 1; i++) {
                    Player_hands();
                    if (not_duplication==true) {
                        player_hands = draw_card;
                        player_score = player_score + player_hands;//総合得点
                        System.out.printf("playerの点数は%sです\n", player_score);
                        i++;
                    }
                }
            } else {
                System.out.printf("standが選択されました。\n");
                break;
            }
        }
    }

    private int dealer_score = 0;
    private int dealer_hands=0;
    public void Dealer_first_active() {
        //dealer初期カード配布
        System.out.printf("dealerの初期行動。\n");
        //h.i3_d = 2;
        for (int i = 0; i <= 1; ) {
            Dealer_hands();
            if (not_duplication==true) {
                dealer_hands = draw_card;
                dealer_score = dealer_score + draw_card;//総合得点
                //System.out.printf("dealerの点数は%sです\n", dealer_score);
                //System.out.printf("%s,%s,%s,%s\n",hands_list[0],hands_list[1],hands_list[2],hands_list[3]);
                i++;
            }
        }
    }
    public void Dealer_second_active(){
        System.out.printf("dealerの行動。\n");
        //System.out.printf("%s\n",1);
        while (dealer_score <= 20) {
            //System.out.printf("%s\n",2);
            if (dealer_score <= 16) {
                //System.out.printf("%s\n",3);
                for (int i = 0; i < 1; i++) {
                    //h.i3_d = h.i3_d+1;
                  Dealer_hands();
                    if (not_duplication==true) {
                        if (0 <= dealer_hands && dealer_hands <= 12) {
                            dealer_hands = draw_card;
                            dealer_score = dealer_score + draw_card;
                            //System.out.printf("dealerの点数は%sです\n", dealer_score);
                        }
                    }
                }
            }break;
        }
    }
    public int getBust_count(){return player_score;}
    public int getBust_count2(){return dealer_score;}
}

