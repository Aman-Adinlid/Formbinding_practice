package lexicon.se.practice.repository;

import lexicon.se.practice.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {
}
