package com.pingu.exercise.api;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChatService {

	public ChatMessage send(ChatMessage chatMessage){
		chatMessage.setContent("[발송] "+chatMessage.getContent());
		return chatMessage;
	}
}
