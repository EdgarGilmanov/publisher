package ru.publisher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.publisher.model.Message;
import ru.publisher.service.PublisherService;

@RestController
public class PublisherControl {
    private final PublisherService publisherService;

    public PublisherControl(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping("/")
    public Message index() {
        return publisherService.getRandomMessage();
    }
}
