package sward_offer;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 回文数
 * 随机输入一个数，判断它是不是对称数（回文数）（如3,121,12321,45254），不能用字符串库函数
 */
public class PalindromeNum {

    /**
     * 第一种：将数字转成字符串来处理
     * @param temp  控制台输入的数字
     */
    public static  void checkNumInString(String temp){

        char[] tempArr = temp.toCharArray();

        boolean isPalindrome = false;
        flag:for(int i=0;i<tempArr.length/2;i++){
            for(int j=tempArr.length-1-i; j>tempArr.length/2;j--){
                if(tempArr[i]== tempArr[j]){
                    isPalindrome = true;
                    break;
                }else{
                    isPalindrome = false;
                    break flag;
                }
            }
        }
        if (isPalindrome){
            System.out.println(temp+"是回文");
        }else{
            System.out.println(temp+"不是回文");
        }

    }
    public static int checkNumWithoutString(){


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger temp = new BigInteger(String.valueOf(scan.nextBigInteger()));
        try {
            //将数字放进字符数组中
            PalindromeNum.checkNumInString(temp.toString());
            //PalindromeNum.checkNumWithoutString();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("只允许输入数字");
        }
    }
}
