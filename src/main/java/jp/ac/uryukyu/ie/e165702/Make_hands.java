package jp.ac.uryukyu.ie.e165702;

/**
 * Created by e165702 on 2017/02/03.
 */
public class Make_hands{
    public int [] hands_list = new int [52];
    public int random_number=0;
    public int draw_card=0;
    public int count_number=0;
    public boolean not_duplication= true;//trueの時は引いたカードが重複していない
    public void Player_hands() {
        /*
        Playerがカードを引くためのメソッド
        またBLACKJACKではAは11点J,Q,Kは10となる
         */
        random_number = (int) (Math.random() * 51);
        hands_list[count_number] = random_number;
        //同じカードが出たかどうかを判定
        if (count_number != 0) {
            Draw_again();
        }
        if (not_duplication==true) {
            if (0 <= random_number && random_number <= 12) {
                System.out.printf("引いたカードは♠の%sです\n", random_number+ 1);
                draw_card = random_number + 1;//ランダムで出た0~12を1~13に変更
            } else if (12 < random_number && random_number <= 25) {
                System.out.printf("引いたカードは❤️の%sです\n", random_number- 12);
                draw_card = random_number- 12;//ランダムで出た13~25を1~13に変更
            } else if (25 < random_number && random_number <= 38) {
                System.out.printf("引いたカードは♣️の%sです\n", random_number - 25);
                draw_card = random_number- 25;//ランダムで出た26~38を1~13に変更
            } else {
                System.out.printf("引いたカードは♦️️の%sです\n", random_number - 38);
                draw_card = random_number- 38;//ランダムで出た39~51を1~13に変更
            }

            if (draw_card == 1) {
                draw_card = 11;//Aが出た場合点数を11点にしている
            } else if (11 <= draw_card && draw_card <= 13) {
                draw_card = 10;//J,Q,Kが出た場合点数を10点にしている
            }
            count_number++;

        }
    }
    public void Dealer_hands() {
        /*
        Dealerがカードを引くためのメソッド
        基本的にはPlayer_hands()と同じだがDealerはカードを1枚目しか公開しないため条件が追加されている
        */
        random_number = (int) (Math.random() * 51);
        hands_list[count_number] = random_number;
        //同じカードが出たかどうかを判定
        if (count_number != 0) {
            Draw_again();
        }
        if (not_duplication==true) {
            if (0 <= random_number && random_number <= 12) {
                if(count_number==2) {//count_number==2のとき,Dealerが1枚目を引いたときとなる
                    System.out.printf("引いたカードは♠の%sです\n", random_number + 1);
                }
                draw_card = random_number + 1;
            } else if (12 < random_number && random_number <= 25) {
                if(count_number==2) {
                    System.out.printf("引いたカードは❤️の%sです\n", random_number - 12);
                }
                draw_card = random_number- 12;
            } else if (25 < random_number && random_number <= 38) {
                if(count_number==2) {
                    System.out.printf("引いたカードは♣️の%sです\n", random_number - 25);
                }
                draw_card = random_number- 25;
            } else {
                if(count_number==2) {
                    System.out.printf("引いたカードは♦️️の%sです\n", random_number - 38);
                }
                draw_card = random_number- 38;
            }

            if (draw_card == 1) {
                draw_card = 11;
            } else if (11 <= draw_card && draw_card <= 13) {
                draw_card = 10;
            }
            count_number++;

        }
    }
    public void Draw_again() {
        /*
        同じカードを引いたときに引き直すためのメソッド
        ランダムで出た数字とhands_listに格納されているすでに出た数字を1番目から順に比較している
         */
        for (int i= 0; i <= count_number-1;i++) {
            not_duplication = true;//not_duplicationを初期化している
            if (random_number== hands_list[i]) {//ランダムに出た数字とlistのi番目を比較している
                System.out.print("同じカードを引きました。\n");
                not_duplication = false;
                break;
            }
        }

    }
}