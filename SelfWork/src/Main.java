public class Main {

    public Main() {
    }

    public static void main(String[] args) throws Exception {
        NotificationFactory notificationFactory = new NotificationFactory();

        DanielForsell pushNotification = notificationFactory.createNotification("PushNotification");
        pushNotification.notifyUser();
        

        DanielForsell SMSNotification = notificationFactory.createNotification("SMSNotification");
        SMSNotification.notifyUser();

        DanielForsell emailNotification = notificationFactory.createNotification("EmailNotification");
        emailNotification.notifyUser();

    }
}
