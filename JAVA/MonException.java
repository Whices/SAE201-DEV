public class MonException extends Exception {
    public MonException(String message) {
        super(message);
        System.out.println("Erreur : " + message);
    }

    @Override
    public String toString() {
        return "MonException : " + getMessage();
    }
}



