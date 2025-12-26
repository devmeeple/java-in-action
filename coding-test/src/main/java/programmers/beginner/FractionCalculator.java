package programmers.beginner;

public class FractionCalculator {

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분수의 덧셈(통분)
        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;

        // 최대 공약수 구하기
        int gcd = 0;
        for (int i = 1; i <= numerator && i <= denominator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }

        numerator = numerator / gcd;
        denominator = denominator / gcd;

        return new int[]{numerator, denominator};
    }
}
