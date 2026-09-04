package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "Чтобы мудро жизнь прожить, знать надобно немало," +
                "Два важных правила запомни для начала: " +
                "Ты лучше голодай, чем что попало есть," +
                "И лучше будь один, чем вместе с кем попало.";
        String s2 = s1.toUpperCase();
        char c1;
        char c2;
        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);//c1 равен символу итерирующимся наприме букве Ч и так далее,
                              // если да приравнивается
            c2 = s2.charAt(i);//c2 равен символу итерирующимся наприме букве Ч и так далее,
            // если да приравнивается
            if (c1 != ',' && c1 != ':' && c1 != ' ' && c1 != '.' && c1 == c2 ) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}
