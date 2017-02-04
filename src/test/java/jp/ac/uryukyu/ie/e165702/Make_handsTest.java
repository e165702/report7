package jp.ac.uryukyu.ie.e165702;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by e165702 on 2017/02/04.
 */
public class Make_handsTest {
    /**
     * 「同じカードが出たときに引き直している」ことを確認。
     *
     * @throws Exception
     */
    @Test
    public void make_hands_test() throws Exception {
        int test_hands;
        //int i3_d = 0;
        int[] hands_list = new int[3];
        boolean  not_duplication= true;
        Make_hands make_hands = new Make_hands();

        for (int i = 0; i <=2;) {
            make_hands.hands1 = (int) (Math.random() * 3);
            make_hands.hands_list[make_hands.i3_d] = make_hands.hands1;
            //同じカードが出たかどうかを判定
            if (make_hands.i3_d != 0) {
                make_hands.Human_hands2();
            }
            if (make_hands.not_duplication==true) {
                System.out.printf("引いたカードは%s\n",make_hands.hands1);
                //System.out.printf("%s,%s,%s\n",make_hands.hands_list[0],make_hands.hands_list[1],make_hands.hands_list[2]);
                make_hands.i3_d++;
                i++;
            }

        }
        System.out.printf("終了\n");
    }
}
