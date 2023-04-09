package com.example.mm_springboot.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Comment {
    private int comment_id;
    private String post_id;
    private String account;
    private String date;

    public Comment(int comment_id, String post_id,String account, String date) {
        this.comment_id = comment_id;
        this.post_id = post_id;
        this.account = account;
        this.date = date;
    }
}
