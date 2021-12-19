package com.twitter.blockservice.blockservice.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String blocker;
    private String blockee;

    public Block() {
    }

    public Block(String blocker, String blockee) {
        super();
        this.blocker = blocker;
        this.blockee = blockee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlocker() {
        return blocker;
    }

    public void setBlocker(String blocker) {
        this.blocker = blocker;
    }

    public String getBlockee() {
        return blockee;
    }

    public void setBlockee(String blockee) {
        this.blockee = blockee;
    }
}
