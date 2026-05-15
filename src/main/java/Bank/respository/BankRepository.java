package Bank.respository;

import Bank.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankRepository extends JpaRepository<BankAccount,Long> {

    Optional<BankAccount>findByAccountNumber(String AccountNumber);
}
