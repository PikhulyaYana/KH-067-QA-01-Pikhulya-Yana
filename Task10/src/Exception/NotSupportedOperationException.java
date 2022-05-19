package Exception;

public class NotSupportedOperationException extends RuntimeException {
    public NotSupportedOperationException() {
        System.out.println("Incorrect operation. Try one more time.");
    }
}
