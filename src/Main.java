public class Main {
    static float discriminant(float a, float b, float c) {
        //    ამოცანა 1
        return b * b - 4 * a * c;
    }
    static String smallStr(String[] array) {
        //    ამოცანა 2
        String min = array[0];

        for (String s : array) {
            if (s.length() < min.length()) {
                min = s;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(discriminant(1, 2, 3));
        String[] array = new String[]{"Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda"};
        System.out.println(smallStr(array));
        Fraction fract = new Fraction(2,4);
        System.out.println(fract.multiply(2,4));
        System.out.println(fract.add(1,4));
    }

}