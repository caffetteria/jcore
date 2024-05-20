package io.github.caffetteria.jcore.lang;

public class CoreRuntimeException extends RuntimeException {

    public CoreRuntimeException() {
    }

    public CoreRuntimeException(String message) {
        super(message);
    }

    public CoreRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoreRuntimeException(Throwable cause) {
        super(cause);
    }

}
