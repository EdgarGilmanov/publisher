package ru.publisher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.publisher.model.Message;
import ru.publisher.service.Publisher;

@RestController
public class IndexControl {
    private final Publisher publisher;

    public IndexControl(Publisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping("/")
    public Message index() {
        return publisher.getRandomMessage();
    }
}
