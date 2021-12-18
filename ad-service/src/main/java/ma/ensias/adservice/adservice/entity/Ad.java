package ma.ensias.adservice.adservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ad {
    @Id
    private Long adId;
    private String Text;

    public Ad(Long adId, String text) {
        this.adId = adId;
        Text = text;
    }

    public Ad(){
    }

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
