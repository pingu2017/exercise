package com.pingu.exercise.api;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("exercise")
public class Controller {
	private final ChatService chatService;
	@GetMapping("/{word}")
	public String test (@PathVariable String word){
		return word;
	}

	@MessageMapping("chat/message")
	@SendTo("/topic/public")
	public ChatMessage sendMessage(ChatMessage chatMessage){
		return chatService.send(chatMessage);
	}
}
