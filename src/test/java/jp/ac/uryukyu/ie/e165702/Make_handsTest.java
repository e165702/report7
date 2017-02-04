package jp.ac.uryukyu.ie.e165702;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by e165702 on 2017/02/04.
 */
public class Make_handsTest {
    /**
    * {落胆(落単)している}状態では喜べない」ことを確認。
    * @throws Exception
    */
    @Test
    public void make_hands_test() throws Exception {
        int test_hands=0;
        int i3_d=0;
        int [] hands_list = new int [52];
        Make_hands make_hands = new Make_hands();
        for (int i=0;i<=2;) {
            test_hands = (int) (Math.random() * 3);
            //同じカードが出たかどうかを判定
            if (i3_d != 0) {
                for (int i4_d = 0; i4_d <= i3_d-1;i4_d++) {
                    if (hands1 == hands_list[i4_d]) {
                        System.out.printf("同じカードが出ました。\n");
                        i5_d = false;
                        break;
                    }
                }
            }
            if (make_hands.i5_d) {
                System.out.printf("test_hans=%s",test_hands);
                i3_d++;

            }
        }
    }

}
