package jp.ac.uryukyu.ie.e165702;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by e165702 on 2017/02/04.
 */
public class Human_activeTest {
    /**
     * 「カードを引いたときに点数が加算されている」ことを確認。
     * @throws Exception
     */
    @Test
    public void human_active_test() throws Exception {
        Make_hands make_hands = new Make_hands();
        int human_hands=0;
        int human_score=0;
        for (int i = 0; i <= 1;) {
            make_hands.Human_hands();
            if (make_hands.i5_d) {
                human_hands = make_hands.hands2;
                human_score = human_score + human_hands;//総合得点
                System.out.printf("human_score=%sです\n", human_score);
                i++;

            }
        }
    }
}
