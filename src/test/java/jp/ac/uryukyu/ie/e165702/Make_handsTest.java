package jp.ac.uryukyu.ie.e165702;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by e165702 on 2017/02/04.
 */
public class Make_handsTest {
    /**
     * 「同じカードが出たときに引き直している」ことを確認。
     * 必ず
     *引いたカードは0
     *引いたカードは1
     *引いたカードは2
     *の全てが表示される
     * @throws Exception
     */
    @Test
    public void make_hands_test() throws Exception {
        Make_hands make_hands = new Make_hands();
        for (int i = 0; i <=2;) {
            make_hands.random_number = (int) (Math.random() * 3);
            make_hands.hands_list[make_hands.count_number] = make_hands.random_number;
            //同じカードが出たかどうかを判定
            if (make_hands.count_number != 0) {
                make_hands.Draw_again();
            }
            if (make_hands.not_duplication==true) {
                System.out.printf("引いたカードは%s\n",make_hands.random_number);
                make_hands.count_number++;
                i++;
            }

        }
        System.out.printf("終了\n");
    }
}
