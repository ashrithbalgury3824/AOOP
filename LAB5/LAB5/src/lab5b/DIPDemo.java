package lab5b;

interface MessageService {
    void sendMessage(String message, String recipient);
}

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Email sent to " + recipient + " with message: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("SMS sent to " + recipient + " with message: " + message);
    }
}

class MyApplication {
    private MessageService messageService;

    public MyApplication(MessageService service) {
        this.messageService = service;
    }

    public void processMessage(String message, String recipient) {
        messageService.sendMessage(message, recipient);
    }
}

public class DIPDemo {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MyApplication app = new MyApplication(emailService);
        app.processMessage("Hello, Alice!", "alice@example.com");

        MessageService smsService = new SMSService();
        MyApplication app2 = new MyApplication(smsService);
        app2.processMessage("Hi, Bob!", "123-456-7890");
    }
}
