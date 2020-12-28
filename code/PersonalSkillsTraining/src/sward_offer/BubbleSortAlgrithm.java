package sward_offer;

import java.util.Arrays;

/**
 *  冒泡排序
 *  思想：将相邻的两个数进行比较大小，小的放在左侧，大的放在右侧，每一轮都会将最大的数字交换到最右侧
 *
 *  缺点是：比较次数太多
 */
public class BubbleSortAlgrithm {


    /**
     * 第一种写法
     *
     * 优化前
     * @param sortArr
     */
    public static void sort_(int[] sortArr){
        System.out.println("原始数组："+Arrays.toString(sortArr));
        for(int i=0;i<sortArr.length;i++){//轮
            for(int j=1;j<sortArr.length-i;j++){//比较
                int temp=sortArr[j];
//                System.out.println("打印比较：i="+sortArr[i]+" j="+sortArr[j]);
                if(sortArr[j-1]>sortArr[j]){
                    sortArr[j]=sortArr[j-1];
                    sortArr[j-1]=temp;
                }
            }
            System.out.println("第"+i+"轮结束："+Arrays.toString(sortArr));
        }
    }



    /**
     *
     * 第二种写法
     *
     * 优化后，数据交换完 排序完后，在下一行进行比较一次，通过设置的isSort来判断 当前内循环内，有没有交换顺序，如果没有，则直接跳出循环体，打印排序后的结果
     * @param sortArr
     */
    public static void sort(int[] sortArr){
        System.out.println("原始数组："+Arrays.toString(sortArr));
        for(int i=0;i<sortArr.length;i++){//轮
            boolean isSort=false;   //来个标志吧，用它来标志，内循环中，有没有交换元素
            for(int j=1;j<sortArr.length-i;j++){//比较
                int temp=sortArr[j];
                if(sortArr[j-1]>sortArr[j]){
                    sortArr[j]=sortArr[j-1];
                    sortArr[j-1]=temp;
                    isSort=true;
                }
            }
            if(isSort==false){ //没有交换过元素，说明已经有序啦。。。。
                break;
            }
            System.out.println("第"+i+"轮结束："+Arrays.toString(sortArr));
        }
    }


    /**
     * 第三种写法
     *
     * @param sortArr
     */
    public static void  bubbleSortOptimization(int[] sortArr){
        int lastExchangeIndex=0;//记录最后一次比较的下标
        int sortBorder=sortArr.length-1;

        System.out.println("原始数组："+Arrays.toString(sortArr));
        for(int i=0;i<sortArr.length;i++){
            boolean isSort=false;
            for(int j=1;j<sortBorder;j++){
                int temp=sortArr[j];
                if(sortArr[j-1]>sortArr[j]){
                    sortArr[j]=sortArr[j-1];
                    sortArr[j-1]=temp;
                    isSort=true;
                    lastExchangeIndex=j;
                }
            }
            System.out.println("lastExchangeIndex:"+lastExchangeIndex);
            sortBorder=lastExchangeIndex;
            if(isSort==false){
                break;
            }
            System.out.println("第"+i+"轮结束："+Arrays.toString(sortArr));
        }
    }


    /**
     * 第四种写法
     *
     * @param sortArr
     */
    public  static  void  cockTailSort(int[] sortArr){

        for (int i=0;i<sortArr.length/2;i++){//因为是左右轮回遍历，所以在此除以2

//            boolean isSort=false;
            for(int j=1;j<sortArr.length-i;j++){

                int temp=sortArr[j];
                if(sortArr[j-1]>sortArr[j]){
                    sortArr[j]=sortArr[j-1];
                    sortArr[j-1]=temp;
//                    isSort=true;
                }
               /* if(isSort==false){
                    break;
                }*/
            }
            for(int j=sortArr.length-i-1;j>i;j--){

                if(sortArr[j]<sortArr[j-1]){
                    int temp=sortArr[j];
                    sortArr[j]=sortArr[j-1];
                    sortArr[j-1]=temp;
                }
            }
            System.out.println("第"+i+"轮结束："+Arrays.toString(sortArr));
        }
    }


    /**
     * 第五种写法
     *
     * @param sortArr
     */
    public static void cockTailSortOptmion(int[] sortArr){

        for(int i=0;i<sortArr.length/2;i++){

            boolean isSort=false;
            for(int j=0;j<sortArr.length-i;j++){

                if(sortArr[j]>sortArr[j+1]){
                    int temp=sortArr[j+1];
                    sortArr[j+1]=sortArr[j];
                    sortArr[j]=temp;
                    isSort=true;
                }
            }

            if(isSort==false){
                break;
            }

            isSort=false;
            for(int j=sortArr.length-i-1;j>i;j--){

                if(sortArr[j]<sortArr[j-1]){
                    int temp=sortArr[j];
                    sortArr[j]=sortArr[j-1];
                    sortArr[j-1]=sortArr[j];
                    isSort=true;
                }
            }
            if (isSort==false){
                break;
            }
        }
    }


    /**
     * 第六种写法
     *
     * @param sortArr
     */
    public static void cockTailOption_last(int[] sortArr){

        for (int i=0;i<sortArr.length;i++){

            

        }

    }



    public static void main(String[] args) {
        int[] sortArr={1,3,0,-3,56,98,24,12,36,-1};
//        int[] sortArr={1,-3,0,3,56,98};
//        sort_(sortArr);
//        sort(sortArr);
//        bubbleSortOptimization(sortArr);
        cockTailSort(sortArr);
        System.out.println(Arrays.toString(sortArr));
    }
}
