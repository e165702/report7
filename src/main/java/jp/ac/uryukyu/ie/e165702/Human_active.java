package jp.ac.uryukyu.ie.e165702;

/**
 * Created by e165702 on 2017/02/03.
 */
import java.util.Scanner;
public class Human_active extends Make_hands{
    //Hands_list h = new Hands_list();
    private int bust_count = 0;
    private int player_hands=0;

    public void Player_first_active() {
        //playerに初期カードを配布
        System.out.printf("playerの初期行動。\n");
        for (int i = 0; i <= 1; ) {
            Human_hands();
            if (i5_d) {
                player_hands = hands2;
                bust_count = bust_count + player_hands;//総合得点
                System.out.printf("playerの点数は%sです\n", bust_count);
                i++;

            }
        }
    }
    public void Player_second_active() {
        System.out.printf("playerの行動。\n");
        //h.i3_d = 4;
        //playerカードの追加
        while (bust_count <= 21) {
            System.out.printf("1,hit 2,stand\n");
            String input;
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
            //System.out.printf("%s\n", input);
            int c = Integer.parseInt(input);
            if (c == 1) {
                for (int i2 = 0; i2 < 1; i2++) {
                    Human_hands();
                    if (i5_d) {
                        player_hands = hands2;
                        bust_count = bust_count + player_hands;//総合得点
                        System.out.printf("playerの点数は%sです\n", bust_count);
                        i2++;
                    }
                }
            } else {
                System.out.printf("standが選択されました。\n");
                break;
            }
        }
    }

    private int bust_count2 = 0;
    private int dealer_hands=0;
    public void Dealer_first_active() {
        //dealer初期カード配布
        System.out.printf("dealerの初期行動。\n");
        //h.i3_d = 2;
        for (int i = 0; i <= 1; ) {
            Human_hands();
            if (i5_d) {
                dealer_hands = hands2;
                bust_count2 = bust_count2 + hands2;//総合得点
                System.out.printf("dealerの点数は%sです\n", bust_count2);
                i++;
            }
        }
    }
    public void Dealer_second_active(){
        System.out.printf("dealerの行動。\n");
        //System.out.printf("%s\n",1);
        while (bust_count2 <= 20) {
            //System.out.printf("%s\n",2);
            if (bust_count2 <= 16) {
                //System.out.printf("%s\n",3);
                for (int i2 = 0; i2 < 1; i2++) {
                    //h.i3_d = h.i3_d+1;
                    Human_hands();
                    if (i5_d) {
                        if (0 <= dealer_hands && dealer_hands <= 12) {
                            dealer_hands = hands2;
                            bust_count2 = bust_count2 + hands2;
                            System.out.printf("dealerの点数は%sです\n", bust_count2);
                        }
                    }
                }
            }break;
        }
    }
    public int getBust_count(){return bust_count;}
    public int getBust_count2(){return bust_count2;}
}

