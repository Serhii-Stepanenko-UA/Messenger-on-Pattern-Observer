package app;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів спостерігачів (користувачів)
        Observer observer1 = new MessageObserver("User1");
        Observer observer2 = new MessageObserver("User2");
        Observer observer3 = new MessageObserver("User3");

        // Створення об'єкта системи миттєвих повідомлень
        Messenger messenger = new Messenger();

        // Додавання користувачів до системи миттєвих повідомлень
        messenger.addObserver(observer1);
        messenger.addObserver(observer2);
        messenger.addObserver(observer3);

        // Надсилання тестових повідомлень
        messenger.sendMessageToAll("Це тестове повідомлення.");
        System.out.println();

        // Відправлення спеціального повідомлення
        messenger.sendSpecialMessage("Нагадування про акцію!");

    }
}