package ma.ensias.twitter.search.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class SearchService {


    @Autowired
    private WebClient.Builder webClientBuilder;


}
