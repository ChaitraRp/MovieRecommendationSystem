package mrsapi.packagee;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {
	
	public Customer findByUsername(String username); 
}
