package dev.backendstudies.modernjava;

/**
 * Sealed interfaces + pattern matching in switch.
 * The compiler guarantees that the switch covers every case.
 */
public sealed interface DebtEvent {

    record DebtRegistered(String debtId, Money amount) implements DebtEvent {}

    record PaymentReceived(String debtId, Money amount) implements DebtEvent {}

    record DebtCancelled(String debtId, String reason) implements DebtEvent {}

    static String describe(DebtEvent event) {
        return switch (event) {
            case DebtRegistered(var id, var amount) -> "Debt " + id + " registered: " + amount.amount();
            case PaymentReceived(var id, var amount) -> "Payment of " + amount.amount() + " on debt " + id;
            case DebtCancelled(var id, var reason) -> "Debt " + id + " cancelled: " + reason;
        };
    }
}
