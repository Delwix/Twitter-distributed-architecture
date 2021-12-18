package ma.ensias.adservice.adservice.service;

import ma.ensias.adservice.adservice.entity.Ad;
import ma.ensias.adservice.adservice.repository.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdService {
    @Autowired
    AdRepository adRepository;
    public List<Ad> getAdsByUser(Long userId){
        return adRepository.findAll();
    }
}
