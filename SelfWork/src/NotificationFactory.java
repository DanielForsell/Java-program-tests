
public class NotificationFactory {

    public NotificationFactory() {
    }

    public DanielForsell createNotification(String notification) {

        switch (notification) {
            case "EmailNotification":
                return new EmailNotification();

            case "PushNotification":
                return new PushNotification();

            case "SMSNotification":
                return new SMSNotification();

            default:
                break;
        }

        return null;
    }
}
