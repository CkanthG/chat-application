package com.sree.chat.model;

public record ChatMessage(
        String content,
        String sender,
        MessageType type
) {
}
