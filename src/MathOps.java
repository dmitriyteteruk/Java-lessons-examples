import java.util.Random;

public class MathOps {
    public static void main (String[] args){
        // создаение и раскрутка генератора случайных чисел
        Random rand = new Random();
        int i, j, k;

        System.out.println("Примеры математчиеских операций с целыми числами:");
        // выбор значения от 1 до 100:
        j = rand.nextInt(1, 1000) + 1;
        System.out.println("j = "  + j);

        k = rand.nextInt(20,21) + 1;
        System.out.println("k = " + k);

        i = j + k;
        System.out.println("i = " + i);

        i = j - k;
        System.out.println("i = " + i);

        i = k / j;
        System.out.println("i = " + i);

        i = k * j;
        System.out.println("i = " + i);

        i = k % j;
        System.out.println("k % j = " + i);

        j %= k;
        System.out.println("j %/ k = " + j);

        System.out.println("Примеры математических операций с вещественными числами:");

        float u,v,w;

        v = rand.nextFloat();
        System.out.println("v = " + v);

        w = rand.nextFloat();
        System.out.println("w = " + w);

        u = w + v;
        System.out.println("u = " + u);

        u = w - v;
        System.out.println("u = " + u);

        u = w * v;
        System.out.println("u = " + u);

        u = w / v;
        System.out.println("u = " + u);

        u -= v;
        System.out.println("u -= v : " + u);

    }

}
