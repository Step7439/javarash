package JavaSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class weighet {
        public static void main(String[] args) throws IOException {
            while (true) {
                BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
                double weight = Double.parseDouble(bis.readLine());
                double height = Double.parseDouble(bis.readLine());
                Body.calculator(weight, height);
            }
        }

        public static class Body {
            public static void calculator(double weight, double height) {
                double result = weight / (height * height);
                if (result < 18.5) {
                    System.out.println("Не довес меньше чем 18.5");
                } else if (result > 18.5 && result < 25) {
                    System.out.println("Нормальный между 18,5 и 25");
                } else if (result > 25 && result < 30) {
                    System.out.println("Избыточный вес между 25 и 30");
                } else {
                    System.out.println("Ожирения 30 и больия");
                }
            }

        }

}
