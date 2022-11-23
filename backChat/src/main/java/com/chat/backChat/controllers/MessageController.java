package com.chat.backChat.controllers;

<<<<<<< HEAD
import com.chat.backChat.entities.Message;
import com.chat.backChat.entities.User;
import com.chat.backChat.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MessageController {

    @Autowired
    private MessageRepository repository;

    @GetMapping("/message")
    public List<Message> index(){
        return repository.findAll();
    }

    @GetMapping("/message/{messageId}")
    public Message getMessage(@PathVariable Long messageId) {
        Message message = null;
        Optional<Message> optionalMessage = repository.findById(messageId);
        if(optionalMessage.isPresent()){
            message = optionalMessage.get();
        }

        return message;
    }

    @PostMapping("/message")
    public Message create(@RequestBody Message message){
        return repository.save(message);
    }

    @PutMapping("/message/{id}")
    public Message update(@PathVariable Long id, @RequestBody Message message){
        // getting blog
        Message messageToUpdate = repository.findById(id).get();
        messageToUpdate.setDatetime(message.getDatetime());
        messageToUpdate.setText(message.getText());
        messageToUpdate.setUser_sender(message.getUser_sender());
        messageToUpdate.setUser_receiver(message.getUser_receiver());
        return repository.save(messageToUpdate);
    }

    @DeleteMapping("message/{id}")
    public boolean delete(@PathVariable Long id){
        repository.deleteById(id);
        return true;
    }
=======
public class MessageController {
>>>>>>> origin/malik
}
