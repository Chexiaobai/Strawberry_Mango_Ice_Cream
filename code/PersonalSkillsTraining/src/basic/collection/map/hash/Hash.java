package basic.collection.map.hash;

import java.util.Objects;

public class Hash {


    public static int hash(int i){
        return i%8;
    }

    /**
     * 对字符串取hash值是 获取每一个字符，然后将每个字符转换成对应的ascii吗，在
     * @param s
     * @return
     */
    public static int hash(String s){

        int hashcode=0;
        char[] ch=s.toCharArray();
        for (char c:ch) {
            hashcode +=hash(c);
    }
        return hashcode;
    }

    public static void main(String[] args) {

        System.out.println(hash(10));
        System.out.println(hash(11));
        System.out.println(hash(12));
        System.out.println(hash(13));
        System.out.println(hash(14));
        System.out.println(hash(15));
        System.out.println(hash(16));

        System.out.println(hash("adb"));
        System.out.println(Objects.hashCode("adb"));
        System.out.println(Integer.hashCode(12));//整数的hash值就是该整数值


    }
}
