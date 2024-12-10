package com.substring.chat.playload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MessageRequest {

    private String content;
    private String sender;
    private String roomId;

    public String getContent(){
        return content;
    }
    public String getRoomId(){
        return roomId;
    }
    public String getSender(){
        return sender;
    }



}