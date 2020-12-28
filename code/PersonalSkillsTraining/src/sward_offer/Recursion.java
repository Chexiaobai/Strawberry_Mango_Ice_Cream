package sward_offer;

import java.util.Date;

/**
 * 递归，斐波那契
 */
public class Recursion {
    public  static  int num = 0;

    /**
     * 最原始 随着n的增加，函数的执行次数猛增
     *   n   执行次数
     *   5   15
     *   10  177
     *   15  1973
     *   25  242785
     * @param n
     * @return
     */
    public static int fun(int n ){
        num++;
        return n<2?2:fun(n-1)+fun(n-2);
    }

    public static int qpow(int a ,int n){
        int ans = 1;
        /**while (n){
            if(n&1) ans *=a;

        }*/

        return 0;
    }

    public static void main(String[] args) {

        Date time = new Date();
        System.out.println("开始time:"+time.getTime());
        Recursion.fun(25);
        System.out.println("recursion.num:"+Recursion.num);
        Date time1 = new Date();
        System.out.println("结束time:"+time1.getTime());

        int n =5;

        int temnp = n&1;
        int te = n <<1;
        int re = n >>1;
        int res = n >>1;
        System.out.println("n&1:"+temnp +" te:"+te +" re:"+re +" res:"+res);



    }
}
