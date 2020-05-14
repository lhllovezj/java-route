//String中常用方法

public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "adce";
        String s2 = "abceeee";
        System.out.println(s1.compareTo(s2));
        System.out.println("xyz".compareTo("yxz")); // -1

        //判断是否包含某个子串，返回值是boolean
        String s3 = "andylhl";
        String s4 = "lhhl";
        String s5 = "lhl";
        System.out.println(s3.contains(s4)); //false
        System.out.println(s3.contains(s5)); //true

        //判断是否以某个字符串结尾，返回值是boolean
        System.out.println("abc.xyz".endsWith(".cn"));
        System.out.println("abc.xyz".endsWith(".xyz"));

        //equals()
        System.out.println("abc".equals("abc"));

        String s6 = "abcdefghijklmn";
        System.out.println(s6.indexOf("gi"));

        String s7 = "abcabcdefdef";
        System.out.println(s7.lastIndexOf("abc"));

        System.out.println("SCcHJ".toLowerCase());
    }
}
