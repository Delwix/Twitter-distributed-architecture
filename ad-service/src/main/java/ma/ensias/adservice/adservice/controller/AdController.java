package ma.ensias.adservice.adservice.controller;

import ma.ensias.adservice.adservice.entity.Ad;
import ma.ensias.adservice.adservice.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ad")
public class AdController {
    @Autowired
    AdService adService;


    @GetMapping("/{id}")
    public List<Ad> getAds(@PathVariable("id") Long userId){
        return adService.getAdsByUser(userId);
    }
}
