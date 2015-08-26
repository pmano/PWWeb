package pw.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private CustomerRepository repository;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}

	}
}
*/

/*
package pw.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import pw.core.repository.SymbolRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private SymbolRepository symbolRepo;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    public int findSymbolCount(){
    	String sql = "SELECT COUNT(*) FROM SYMBOLS";
    	
    
    	return  this.jdbcTemplate.queryForObject(sql, Integer.class);
    }
    
    @Override
    public void run(String... args) throws Exception {

		// fetch count of Symbols 
		System.out.println("*************************Symbols counts via findSymbolCount() : ************************");
		System.out.println("COUNT IS : "+findSymbolCount());
    	
    }
    
}
*/