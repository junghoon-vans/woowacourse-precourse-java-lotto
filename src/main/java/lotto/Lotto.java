package lotto;

import static lotto.Validation.validateLotto;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validateLotto(numbers);
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return this.numbers.toString();
    }
}
