package com.teachmeskills.lesson_10.task1;

import com.teachmeskills.lesson_10.task1.model.client.Client;
import com.teachmeskills.lesson_10.task1.service.ServiceOperationCard;

/**
 * Задача 1
 * Есть клиент.
 * Клиент может иметь любое кличество карт.
 * Карта имеет три поля - cvv-код, номер карты и сумма на карте. +
 * Вывести на экран сообщение о том, сколько одинаковых карты имеет клиент.
 * Поле со значением суммы на карте не должно участвовать в сравнении.
 * Т.е. две краты с одними и теми же cvv-кодами и номерами, но разными суммами считаются одинаковыми.
 * Предусмотреть различные варианты выходного сообщения - например, у клиента нет ни одной карты
 * совсем, у клиента нет одинаковых карт и другие возможные ситуации.
 */
public class ApplicationRunner {
    public static void main(String[] args) {

        Client client = new Client("Alex",10);

        client.addCard("111", "1111-4445-3333-1111", 6300);
        client.addCard("456", "2344-1145-2333-9999", 8300);
        client.addCard("789", "3334-4655-6673-5521", 2300);
        client.addCard("555", "5555-3345-3113-1821", 1600);
        client.addCard("222", "2222-2145-6363-2222", 1300);
        client.addCard("111", "1111-4445-3333-1111", 15211);
        client.addCard("123", "1234-2145-6363-2222", 100);
        client.addCard("111", "1111-4445-3333-1111", 32100);
        client.addCard("222", "2222-2145-6363-2222", 20);

        ServiceOperationCard.getDuplicateCards(client, client.getCards());
    }
}
