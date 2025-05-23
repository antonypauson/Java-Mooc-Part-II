public class Calcuator {

    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("number should be positive");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= 1;
        }
        return answer;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if (subsetSize > setSize) {
            throw new IllegalArgumentException("subset must be smaller than the set");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);
        return numerator / denominator;
    }
}
