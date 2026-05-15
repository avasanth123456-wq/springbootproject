package Bank.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bank_accounts")
@Setter
@Getter
@Builder
@AllArgsConstructor
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountHolder;


    @Column(unique = true)
    private String accountNumber;


    private String ifscCode;

    private String branch;


    private String address;


    private Double bankBalance;

    public BankAccount(String accountHolder, String accountNumber, String ifscCode, String branch, Double bankBalance, String address) {
    }

    public BankAccount(String accountHolder,
                       String accountNumber,
                       String ifscCode,
                       String branch,
                       String address,
                       Double bankBalance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.branch = branch;
        this.address = address;
        this.bankBalance = bankBalance;
    }

    public Long getId() {
        return id;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public String getBranch() {
        return branch;
    }

    public String getAddress() {
        return address;
    }

    public Double getBankBalance() {
        return bankBalance;
    }

}
