package com.example.mm_springboot.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Like {

    private String like_id;
    private String post_id;
    private String account;


    public Like(String like_id, String post_id, String account) {
        this.like_id = like_id;
        this.post_id = post_id;
        this.account = account;
    }
}
