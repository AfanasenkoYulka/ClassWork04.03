package strings;

public class strings1 {
    private static Object Integer;

    public static void main(String[] args) {
        //Получить символ по его номеру, а так же номер символа в кодовой таблице UTF-8
        String s="Hello, world!";
        int n = 4;
        char c = s.charAt(n);
        int numUTF = c;
        System.out.println(c);
        System.out.println(numUTF);

        //byte, short, int, long, char,float, double
/*
        long l=100000000l;
        int i= (int) l;
        System.out.println(i);

 */
        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        s=""+c1+c2+c3+c4+c5+c6+c7+c8;
        System.out.println(s);
        char[] arr={'2', '\u00B7', '\u03C0'};
        System.out.println(arr);

        String s1 = "first", s2 = "second";
        System.out.println(s1.compareTo(s2));

        //int - Integer; char - Character
        Integer a;

        // Проверить, что все символы являються числами
        s="123s";
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isDigit(ch));

        }


    }
}
