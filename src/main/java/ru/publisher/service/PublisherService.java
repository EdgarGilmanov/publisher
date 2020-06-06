package ru.publisher.service;

import org.springframework.stereotype.Service;
import ru.publisher.model.Message;

import java.util.Date;
import java.util.Random;

@Service
public class Publisher {

    public Message getRandomMessage() {
        int msisdn = new Random().nextInt();
        Message.Type type = Message.Type.values()[(int) (Math.random() * 1.99)];
        long time = new Date().getTime();
        return new Message(msisdn, type, time);
    }
}
