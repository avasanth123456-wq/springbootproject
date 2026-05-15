package Bank.dto;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@Builder
public class BankResponseDTO {

    private Long id;
    private String accountHolder;
    private String accountNumber;
    private String ifscCode;
    private String branch;
    private String address;
    private Double bankBalance;

    public BankResponseDTO(Long id,
                           String accountHolder,
                           String accountNumber,
                           String ifscCode,
                           String branch,
                           String address,
                           Double bankBalance) {

        this.id = id;
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
