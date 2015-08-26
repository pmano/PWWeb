package pw.core.controller;

import java.net.*;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import pw.core.entity.Symbol;
import pw.core.repository.SymbolRepository;

@RestController
@RequestMapping("/testC")
public class TestController {
	
	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private SymbolRepository symbolRepo;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	@RequestMapping(value="/quote",method= RequestMethod.GET)
	public String getHeaderQuotes(){
		
		String q= new RestTemplate().getForObject("http://finance.yahoo.com/webservice/v1/symbols/allcurrencies/quote?format=json",String.class);
		//log.debug("********YAHOO CALL DATA ******** :",q.toString());
		return q;
	}
	
	
	@RequestMapping(method= RequestMethod.GET)
	public Map<String,Object> testCtrl(){
		Map<String,Object> model = new HashMap<String,Object>();
		String fname = "me";
		String lname ="inside spring";
		model.put("fname", fname);
		model.put("lname", lname);
		model.put("fullName", fname +" " + lname);
		return model;
	}
	
	@RequestMapping(value="/symbol",method= RequestMethod.GET)
	public List<Symbol> getSymbols(){
		// fetch count of Symbols 
		System.out.println("*************************Symbols counts via getSymbols()/findAll(): ************************");
		System.out.println("JPA count IS : "+symbolRepo.count());
		List<Symbol> sList = symbolRepo.findAll();
		System.out.println("NEW JPA count IS : "+ sList.size());
		return sList;
		
	}
	
	@RequestMapping(value="/symbolCount",method= RequestMethod.GET)
	public int getSymbolCount(){
				// fetch count of SymbolCount 
				System.out.println("*************************Symbols counts via get/findSymbolCount() : ************************");
				System.out.println("COUNT IS : "+findSymbolCount());
		return findSymbolCount();
	}
	
	   public int findSymbolCount(){
	    	String sql = "SELECT COUNT(*) FROM SYMBOLS";
	    	return  this.jdbcTemplate.queryForObject(sql, Integer.class);
	    }

}
