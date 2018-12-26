package controller;

import java.util.List;
import javax.validation.Valid;
import model.Buyer;
import model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.Payments;

@RestController
@RequestMapping("/transactions")
public class PaymentsController {

    @Autowired
    private Payments payments;

    @PostMapping
    public Payment recieveBoleto(@Valid @RequestBody Payment payment){
        payment.setType("boleto");
        return payments.save(payment);
    }
    
    @PostMapping
    public Payment recieveCard(@Valid @RequestBody Payment payment, @Valid @RequestBody Buyer buyer){
        return payments.save(payment);
    }
    
    @GetMapping
    public List<Payment> listar(){
        return payments.findAll();
    }
    
}
