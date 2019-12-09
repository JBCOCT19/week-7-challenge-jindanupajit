package com.jindanupajit.bullhorn.bluehorn.controller;


import com.jindanupajit.bullhorn.bluehorn.model.Message;
import com.jindanupajit.bullhorn.bluehorn.repository.MessageRepository;
import com.jindanupajit.bullhorn.jedi.SCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/message")
public class MessageController implements SCrudController<MessageRepository, Message> {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public MessageRepository getRepository() {
        return messageRepository;
    }

    @Override
    public Message newEntity() {
        return new Message();
    }
}
