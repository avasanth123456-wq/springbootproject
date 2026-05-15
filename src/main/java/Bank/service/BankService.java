package Bank.service;

import Bank.dto.BankRequestDTO;
import Bank.dto.BankResponseDTO;
import Bank.entity.BankAccount;
import Bank.respository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;

@Service

public class BankService {
    @Autowired

    private BankRepository repository;
    private ExecutorService executorService;

    public BankService(BankRepository repository,
                       ExecutorService executorService){

        this.repository =repository;
        this.executorService=executorService;
    }

    public BankResponseDTO createAccount(BankRequestDTO dto){
        BankAccount account = new BankAccount(

                dto.getAccountHolder(),
                dto.getAccountNumber(),
                dto.getIfscCode(),
                dto.getBranch(),
                dto.getBankBalance(),
                dto.getAddress()
        );
        BankAccount saved = repository.save(account);

        return mapToResponse(saved);

    }

    public BankResponseDTO getAccount(String AccountNumber){
        BankAccount account = repository.findByAccountNumber(AccountNumber)
                .orElseThrow(()->new RuntimeException("Account Not Found"));

        return mapToResponse(account);
    }

    public String deposit(String AccountNumber,Double amount){
        executorService.submit(()->{
            synchronized (this){
                BankAccount account =
                        repository.findByAccountNumber(AccountNumber)
                                .orElseThrow(()->new RuntimeException("Account Not Found"));

                Double currentBalance= account.getBankBalance();

                account.setBankBalance(currentBalance+amount);

                repository.save(account);

                System.out.println();

            }
        });
        return "Deposit Processing";
    }
    public String withdraw(String AccountNumber, Double amount){
        executorService.submit(()->{
            synchronized (this){
                BankAccount account =
                        repository.findByAccountNumber(AccountNumber)
                                .orElseThrow(()-> new RuntimeException("Account not Found"));

                Double balance =
                        account.getBankBalance();

                if (balance>amount){
                    throw new RuntimeException( "Insufficient Balance");
                }
                account.setBankBalance(balance- amount);

                repository.save(account);

                System.out.println(Thread
                        .currentThread().getName()
                        +" Withdraw Success");
            }

        });
        return "Withdraw Processing";
    }

    private BankResponseDTO mapToResponse(BankAccount account) {

        return new BankResponseDTO(

                account.getId(),
                account.getAccountHolder(),
                account.getAccountNumber(),
                account.getIfscCode(),
                account.getBranch(),
                account.getAddress(),
                account.getBankBalance()
        );
    }
}
