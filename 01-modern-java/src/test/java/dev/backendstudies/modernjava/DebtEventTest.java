package dev.backendstudies.modernjava;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DebtEventTest {

    @Test
    void describesEveryEventType() {
        assertThat(DebtEvent.describe(new DebtEvent.DebtRegistered("D-1", Money.of("150", "EUR"))))
                .isEqualTo("Debt D-1 registered: 150.00");
        assertThat(DebtEvent.describe(new DebtEvent.PaymentReceived("D-1", Money.of("50", "EUR"))))
                .isEqualTo("Payment of 50.00 on debt D-1");
        assertThat(DebtEvent.describe(new DebtEvent.DebtCancelled("D-1", "time-barred")))
                .isEqualTo("Debt D-1 cancelled: time-barred");
    }
}
