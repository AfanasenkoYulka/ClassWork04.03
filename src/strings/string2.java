package strings;

public class string2 {
    public static void main(String[] args) {
        //Заменить символ в строке (точку на вопросительный знак
        String s = "Why is garbage collection necessary in Java.";
        int pos = s.indexOf(".");
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(pos, '?');

        System.out.println(sb);

        //Удалить все скобки из выражения
        s = "What are the {wrapper} {classes} in Java?";
        String s2;

        System.out.println(s);
    }
}