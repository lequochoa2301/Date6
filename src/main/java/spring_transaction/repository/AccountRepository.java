package spring_transaction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring_transaction.entity.AccountEntity;

@Repository
public interface AccountRepository extends CrudRepository<AccountEntity,Integer> {
}
