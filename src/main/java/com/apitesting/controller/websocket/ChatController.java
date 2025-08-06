package com.apitesting.controller.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.apitesting.model.websocket.ChatMessage;

@Controller
public class ChatController {

    @MessageMapping("/chat") // client sends to /app/chat
    @SendTo("/topic/messages") // broadcast to all subscribers
    public ChatMessage send(ChatMessage message) throws Exception {
        return message;
    }
}

