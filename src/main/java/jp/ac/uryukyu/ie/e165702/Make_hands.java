package jp.ac.uryukyu.ie.e165702;

/**
 * Created by e165702 on 2017/02/03.
 */
public class Make_hands{
    private int [] hands_list = new int [52];
    private int hands1=0;
    public int hands2=0;
    private int i3_d=0;
    public boolean i5_d= true;//trueの時はかぶってない
    //Hands_list2 h2 = new Hands_list2();
    //public int [] hands_list = new int[52];

    //public   int[] hands_list = new int[52];
    //int player_id_3;
    public void Human_hands() {
        hands1 = (int) (Math.random() * 5);
        //System.out.printf("i3_d=%s\n", i3_d);
        hands_list[i3_d] = hands1;
        //System.out.printf("hands1=%s\n",hands1);
        //System.out.printf("hands_list[i3_d]=%s\n", h2.hands_list[h2.i3_d]);*/
        //System.out.printf("number=%s\n",number);
        //System.out.printf("i3_d=%s\n",i3_d);
        //同じカードが出たかどうかを判定
        if (i3_d != 0) {
            Human_hands2();
        }
        if (i5_d=true) {
            if (0 <= hands1 && hands1 <= 12) {
                System.out.printf("このカードは♠の%sです\n", hands1 + 1);
                hands2 = hands1 + 1;
            } else if (12 < hands1 && hands1 <= 25) {
                System.out.printf("このカードは❤️の%sです\n", hands1 - 12);
                hands2 = hands1 - 12;
            } else if (25 < hands1 && hands1 <= 38) {
                System.out.printf("このカードは♣️の%sです\n", hands1 - 25);
                hands2 = hands1 - 25;
            } else {
                System.out.printf("このカードは♦️️の%sです\n", hands1 - 38);
                hands2 = hands1 - 38;
            }

            if (hands2 == 1) {
                hands2 = 11;
            } else if (11 <= hands2 && hands2 <= 13) {
                hands2 = 10;
            }
            i3_d++;

            //private boolean bust;
        }
        //System.out.printf("%s,%s,%s,%s,%s\n",hands_list[0],hands_list[1],hands_list[2],hands_list[3],hands_list[4]);
    }
    public void Human_hands2() {
        for (int i4_d = 0; i4_d <= i3_d-1;i4_d++) {
            //System.out.printf("i4_d=%s\n", i4_d);
            //System.out.printf("hands_list[i4_d]=%s\n", hands_list[i4_d]);
            //System.out.printf("i3_d=%s\n", i3_d);
            if (hands1 == hands_list[i4_d]) {
                System.out.printf("同じカードが出ました。\n");
                //System.out.printf("hands1=%s\n", hands1);
                //System.out.printf("hands_list=%s\n", hands_list[i4_d]);
                i5_d = false;
                break;
            }
        }

    }
    public int getI3_d(){return i3_d;}
}