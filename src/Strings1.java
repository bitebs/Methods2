public class Strings1 {
    public static void main(String[] args) {
        String s="Hello world!";
        int n = 4;
        char c = s.charAt(n);
        int numUTF = (int)c;
        System.out.println(c);
        System.out.println(numUTF);
       // System.out.println(s.charAt(n));
        //System.out.println((int)s.charAt(n));
        //byte, short, int, long, char, float, double

     /*
        long l=1000000000l;
        int i= (int) l;
        System.out.println(i);

      */

        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        s =""+c1+c2+c3+c4+c5+c6+c7+c8;
        System.out.println(s);
        char[] arr={'2', '\u00B7', '\u03C0'};
        System.out.println(arr);

        String s1 = "first", s2 = "second";
        //System.out.println(s1.compareTo(s2));
        //System.out.println(s1.charAt(0)-s2.charAt(0));


        //Проверить что все символы являются числами
        //проверить является ли числом хотя бы один символ
        /*
        s="123r";
        boolean flag = true;
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) flag = false;
        }
        System.out.println(flag);

         */

        //проверить является ли числом хотя бы один символ

        s="123r";
        boolean flag = false;
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) flag = true;
        }
        System.out.println(flag);



    }
}
