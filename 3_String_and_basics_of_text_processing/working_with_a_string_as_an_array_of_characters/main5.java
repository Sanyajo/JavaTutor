public class mian5 {

    public static void main(String[] args) {
        String str = " Hello   world word ";
        str = str.trim();
        str = str.replaceAll("\s{2,}", " ");
        System.out.println(str);

    }
}