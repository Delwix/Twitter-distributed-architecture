package ma.ensias.twitter.dm.service;


import ma.ensias.twitter.dm.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class DMService {

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    private WebClient.Builder webClientBuilder;


}
