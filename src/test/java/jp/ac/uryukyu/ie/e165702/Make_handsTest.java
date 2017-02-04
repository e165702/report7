package jp.ac.uryukyu.ie.e165702;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by e165702 on 2017/02/04.
 */
public class Make_handsTest {
    /**
     * {落胆(落単)している}状態では喜べない」ことを確認。
     *
     * @throws Exception
     */
    @Test
    public void make_hands_test() throws Exception {
        int test_hands;
        int i3_d = 0;
        int[] hands_list = new int[3];
        boolean  not_duplication= true;

        for (int i = 0; i <=2;) {
            test_hands = (int) (Math.random() * 3);//test_handsにランダムで1~3を数字を入れる
            hands_list[i] = test_hands;//リストのi番目にランダムで出た数字を入れる
            //同じカードが出たかどうかを判定
            if (i3_d!=0) {
                for (int i4_d = 0; i4_d <= i3_d- 1;i4_d++) {//i=のとき一回,i=2のとき二回
                    not_duplication =true;//ここでtrueに直すことで同じカードが出た場合にfalseなったものを直す。直さないとループする
                    System.out.printf("test_hands=%s\n", test_hands);
                    if (test_hands == hands_list[i4_d]) {
                        System.out.printf("i4_d=%s\n",i3_d-1);
                        System.out.printf("hands_list[i]=%s\n", hands_list[i4_d]);
                        System.out.printf("同じカードが出ました。\n");
                        not_duplication = false;
                        //System.out.printf("%s\n", not_duplication);
                        //System.out.printf("i=%s\n", i);
                        break;
                    }
                    //System.out.printf("aaaaaaaaaaaa\n");
                }//System.out.printf("iiiiiiiiiiiiiiii\n");
            }
            if (not_duplication == true) {
                System.out.printf("iiiiiiiiiiiiiiii\n");
                System.out.printf("＃＃test_hands=%s\n",test_hands);
                i3_d++;
                i++;
            }
            System.out.printf("終了\n");

        }
    }
}
