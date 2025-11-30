package ENUM;

public enum PaymentStatus {

    PENDING("Payment pending..."),
    SUCCESS("Payment completed successfully!"),
    FAILED("Transaction failed!");

    private final String message;

    PaymentStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
