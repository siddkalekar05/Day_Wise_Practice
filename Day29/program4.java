class ServiceException extends RuntimeException {
    ServiceException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

class ExcpDemo3 {

    static void serviceLayer() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            throw new ServiceException("Service failed", e);
        }
    }

    public static void main(String[] args) {
        serviceLayer();
    }
}
