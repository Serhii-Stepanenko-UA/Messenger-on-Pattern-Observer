package app;

import java.util.ArrayList;
import java.util.List;

class Messenger {
    private final List<Observer> observers = new ArrayList<>();

    // Додавання спостерігача до системи
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Видалення спостерігача з системи
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Надсилання повідомлення всім спостерігачам
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Відправлення повідомлення всім користувачам
    public void sendMessageToAll(String message) {
        System.out.println("Повідомлення для всіх користувачів: " + message);
    }

    // Відправлення спеціального повідомлення
    public void sendSpecialMessage(String message) {
        System.out.println("Спеціальне повідомлення: " + message);
    }

    // Метод для отримання списку спостерігачів
    public List<Observer> getObservers() {
        return observers;
    }
}