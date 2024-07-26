package org.example.forum_spring.dao;

import org.example.forum_spring.entity.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MessageRepository extends CrudRepository<Message, UUID> {

}
