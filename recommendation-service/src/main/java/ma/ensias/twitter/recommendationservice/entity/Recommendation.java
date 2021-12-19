package ma.ensias.twitter.recommendationservice.entity;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Recommendation {
    @Id
    private Long userId;

    @ElementCollection(targetClass=Long.class)
    private List<Long> listTweetIds;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getListTweetIds() {
        return listTweetIds;
    }

    public void setListTweetIds(List<Long> listTweetIds) {
        this.listTweetIds = listTweetIds;
    }
}
