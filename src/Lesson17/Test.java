package Lesson17;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123");
        StringBuilder sb2 = sb.append("45");// не создается объект, а будет ссылыаться на sb
        // и результат у них будет одинаковый

        sb2 = sb2.append("6").append("7");
        System.out.println("sb= " + sb);
        System.out.println("sb2= " + sb2);
    }
}
