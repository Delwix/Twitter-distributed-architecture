package ma.ensias.twitter.dm.entity;

import java.sql.Date;

public class Message {
    private Long id;
    private String text;
//    private User sender;
//    private User receiver;
    private Date sent;

    public Message() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getSent() {
        return sent;
    }

    public void setSent(Date sent) {
        this.sent = sent;
    }
}
