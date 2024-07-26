package org.example.forum_spring.service;

import org.example.forum_spring.dao.MessageRepository;
import org.example.forum_spring.entity.Message;

import java.util.List;
import java.util.UUID;

public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
    public List<Message> getAllMessages() {
        return (List<Message>) messageRepository.findAll();
    }

    public Message createOrUpdateMessage(Message message) {
        return messageRepository.save(message);
    }

    public void deleteMessage(UUID id) {
        messageRepository.deleteById(id);
    }

    public Message findMessageById(UUID id) {
        return messageRepository.findById(id).orElse(null);
    }
}
