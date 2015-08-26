package pw.test;

import java.net.*;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/testC")
public class TestController {
	
	private static final Logger log = LoggerFactory.getLogger(TestController.class);

	
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

}
