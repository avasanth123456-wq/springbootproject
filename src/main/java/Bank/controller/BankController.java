package Bank.controller;

import Bank.dto.BankRequestDTO;
import Bank.dto.BankResponseDTO;
import Bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService service;

    public BankController(BankService service){
        this.service=service;
    }
    @PostMapping
    public BankResponseDTO createAccount(
            @RequestBody BankRequestDTO dto) {

        return service.createAccount(dto);
    }
    @GetMapping("/{accountNumber}")
    public BankResponseDTO getAccount(@PathVariable
                                          String AccountNumber){
        return service.getAccount(AccountNumber);

    }
    @PostMapping("/deposit/{accountNumber}")
    public String deposit(@PathVariable String AccountNumber,
                          @RequestParam Double amount){
        return service.deposit(AccountNumber,amount);

    }

    @PostMapping("/withdraw/{accountNumber}")

    public String withdraw(@PathVariable String AccountNumber,
                           @RequestParam Double amount){
        return service.withdraw(AccountNumber,amount);
    }

}
