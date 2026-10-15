package dev.backendstudies.modernjava;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MoneyTest {

    @Test
    void normalisesScaleByCurrency() {
        assertThat(Money.of("10", "EUR").amount()).hasToString("10.00");
        assertThat(Money.of("10", "JPY").amount()).hasToString("10");
    }

    @Test
    void addsAmountsInTheSameCurrency() {
        var total = Money.of("10.10", "EUR").plus(Money.of("0.20", "EUR"));
        assertThat(total).isEqualTo(Money.of("10.30", "EUR"));
    }

    @Test
    void subtractsAndDetectsNegative() {
        var result = Money.of("5.00", "CHF").minus(Money.of("7.50", "CHF"));
        assertThat(result.isNegative()).isTrue();
        assertThat(result).isEqualTo(Money.of("-2.50", "CHF"));
    }

    @Test
    void rejectsDifferentCurrencies() {
        assertThatThrownBy(() -> Money.of("1", "EUR").plus(Money.of("1", "CHF")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Different currencies");
    }

    @Test
    void rejectsNulls() {
        assertThatThrownBy(() -> new Money(null, java.util.Currency.getInstance("EUR")))
                .isInstanceOf(NullPointerException.class);
    }
}
