package com.substring.chat.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Message {
    private String sender;
    private String content;
    private LocalDateTime timeStamp;

    public Message(){}

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
        this.timeStamp=LocalDateTime.now();
    }
    public String getContent(){
        return content;
    }
    public String getSender(){
        return sender;
    }


    public void setContent(String content){
        this.content=content;
    }
    public void setSender(String sender){
        this.sender=sender;
    }
    public void setTimeStamp(LocalDateTime timeStamp){
        this.timeStamp=timeStamp;
    }

}
