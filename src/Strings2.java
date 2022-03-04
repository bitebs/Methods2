public class Strings2 {
    public static void main(String[] args) {
        //заменить символ в строке точку на вопроссительный знак
        String s = "Why is garbage collection necessary in Java.";
        int pos = s.indexOf(".");
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(pos, '?');

        System.out.println(sb);

        //удалить все скобки из выражения
        s = "What are the {wrapper} {classes} in Java?";
        s = s.replaceAll("[{}]", "");
        System.out.println(s);
    }
}
