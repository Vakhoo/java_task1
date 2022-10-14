public final class Fraction {
//    ამოცანა 3

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can not be 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }


    void reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
    }

    public String add(int numerator, int denominator) {
        this.numerator = this.numerator * denominator + this.denominator * numerator;
        this.denominator = this.denominator * denominator;
        reduce();
        return toString();
    }

    public String multiply(int numerator, int denominator) {
        this.numerator = this.numerator * numerator;
        this.denominator = this.denominator * denominator;
        reduce();
        return toString();
    }

    private int gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        return gcd;
    }
}

