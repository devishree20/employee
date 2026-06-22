

public class day14_factory {

    interface Notification {
        void send(String to, String message);
    }

    class CreditNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Credit: " + message + ", to " + to);
        }
    }

    class DebitNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Debit: " + message + ", to " + to);
        }
    }

    static Notification getNotification(day14_factory factory, String type) {
        return switch (type) {
            case "Credit" -> factory.new CreditNotification();
            case "Debit" -> factory.new DebitNotification();
            default -> throw new IllegalArgumentException(
                    "Invalid notification type: " + type);
        };
    }

    public static void main(String[] args) {
        day14_factory factory = new day14_factory();

        String type = "Credit";
        getNotification(factory, type)
                .send("240824", "Amount 800 Credited");
    }
}

