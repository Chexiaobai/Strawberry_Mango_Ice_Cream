package sward_offer;

import java.util.Scanner;

/**
 * 微软的一道题，将一个字符串转换成整数
 *
 * 思路整理：循环遍历字符串，将字符串的每个字符转换成对应的整数
 *
 */
public class StringToInteger {

    public static void StringConvertInteger(String str) throws  Exception{

       if (str == null ||"".equals(str)){
//            throw  Exception("字符串为空");
//            throw  Exception("");
           throw  new Exception("字符串为空");
        }else if("-".equals(str.charAt(0))){

        }else if("+".equals(str.charAt(0))){

        }else{//在0~9之间

            for(int i=0;i<str.length();i++){
                char str_=str.charAt(i);
                if (str_<'0'){

                }else if(str_>'9'){

                }else{

                }
            }
        }
    }

    public static void main(String[] args) {

        //测试用例
        //abcdefg
        //+1234
        //+fafgg
        //$@gfdg
        //-fdg
        //-123

        System.out.println("最大值："+ Integer.MAX_VALUE);
        System.out.println("最小值："+ Integer.MIN_VALUE);

        int s='9';
        System.out.println(s);

        //欧莱雅肌底精华液75ml  298
        //科颜氏白泥面膜 125ml  208
        //YSL b20
        //衰败城市all nighter定妆喷雾 200
        //兰芝紫色隔离霜   160
        //

        System.out.println("");

        Scanner scanner=new Scanner(System.in);
//        String firstScanner=scanner.next();  //读取，遇到空格就结束 例如：fdasf adfasfdsa sadfafag，只能读出来fdasf
        String firstScanner=scanner.nextLine();  //读取一行  例如：fdasf adfasfdsa sadfafag，读出来fdasf adfasfdsa sadfafag
//        int firstScanner =scanner.nextInt();
//        float firstScanner =scanner.nextFloat();
        System.out.println(firstScanner);
        scanner.hasNext();


        /*String secondScanner=scanner.nextLine();
        System.out.println(secondScanner);*/

    }

}
