package controller;

import java.util.List;
import model.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.Buyers;

@RestController
@RequestMapping("/buyers")
public class BuyersController {

    @Autowired
    private Buyers buyers;
    
    @PostMapping
    public Buyer adiciona(Buyer buyer){
        return buyers.save(buyer);
    }
    
    @GetMapping
    public List<Buyer> lista(){
        return buyers.findAll();
    }
}
