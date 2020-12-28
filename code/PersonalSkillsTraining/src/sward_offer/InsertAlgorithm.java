package sward_offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 插入算法
 * 时间复杂度：插入排序需要进行n-1轮，每一轮在最坏情况下的比较复制次数分别是1次、2次、3次……一直到n-1次，最坏时间复杂度是O(n^2)
 * 空间复杂度：由于插入排序是在原地进行排序，并没有引入额外的数据结构，所以空间复杂度是O(1)
 */
public class InsertAlgorithm {

    /**
     * 优化后
     * 优化思想：将插入元素单独提出来，最终比较大小后，再将插入元素放置在对应的插入位置
     * @param oldArr
     */
    public static void sort(int[] oldArr){
        for(int i=1;i<oldArr.length;i++){
            int insertValue=oldArr[i];
            int j=i-1;
            for(;j>=0&&insertValue<oldArr[j];j--){
                oldArr[j+1]=oldArr[j];
            }
            oldArr[j+1]=insertValue;
        }
    }

    /**
     * 优化前
     * 思路：将前后两个元素进行交换赋值，尤其注意的是，需要先将插入元素提出来，不能放在第二个for循环中
     * @param oldArr
     */
    public static void sort_(int[] oldArr){

        for(int i=1;i<oldArr.length;i++){
            int j=i-1;
            int temp=oldArr[i];
            for(;j>=0;j--){
//              int temp=oldArr[i];    //不能放在此处，因为oldArr[i]中的值有可能是交换过的值，不是之前插入的那个值
                if(temp<oldArr[j]){
                    oldArr[j+1]=oldArr[j];
                    oldArr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一串数字，中间用逗号隔开");//这句话必须写在nextline之前
        String tempStr=scanner.nextLine();
        System.out.println("tempStr:"+tempStr);

        String[] tempArr=tempStr.split(" ");

        //将字符串数组转换成数字数组，转化时，要trim
        int[] sortArr=new int[tempArr.length];

        int k=0;
         for(int i=0;i<tempArr.length;i++){
            String temp=tempArr[i].trim();
            if(!"".equals(temp)){
                sortArr[k]=Integer.parseInt(temp);
                k++;
            }
        }
//        sort(sortArr);
        sort_(sortArr);
        System.out.println("元素："+ Arrays.toString(sortArr));
    }
}
