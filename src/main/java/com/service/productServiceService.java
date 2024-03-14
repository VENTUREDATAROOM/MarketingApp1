package com.service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.model.productService;
import com.repository.productServiceRepository;

import jakarta.persistence.EntityManager;

@Service
public class productServiceService {
	
	@Autowired
	private productServiceRepository productServiceServe;
	
	
	//it is for generate Random serviceCode filed  
	static String usingMath() { 
	    String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	    String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz"; 
	    String numbers = "0123456789"; 
	    // create a super set of all characters 
	    String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase + numbers; 
	    // initialize a string to hold result 
	    StringBuffer randomString = new StringBuffer(); 
	    // loop for 10 times 
	    for (int i = 0; i < 10; i++) { 
	      // generate a random number between 0 and length of all characters 
	      int randomIndex = (int)(Math.random() * allCharacters.length()); 
	      // retrieve character at index and add it to result 
	      randomString.append(allCharacters.charAt(randomIndex)); 
	    } 
	    return randomString.toString(); 
	  } 
	
	// logic of add productService in database ...
	public productService addProductService(String ProductName, String description, MultipartFile productIcon) throws IOException {
        
        // get and set serviceCode value ..
        String randomString = usingMath();
        
        productService productData = new productService();
        productData.setServiceAbout(description);
        productData.setServiceImage(productIcon.getBytes());
        productData.setServiceName(ProductName);
         
        //get and set date and time value...
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        
        productData.setServiceCode(randomString);
        productData.setServiceDate(currentDateTime);
        
		
		productService productServiceData = this.productServiceServe.save(productData);
		productServiceData.setServiceCode("******");
		return productServiceData;
	}
	
	
	// return  list of services which are present
	public List<productService> getAllProductService(){
		List<productService> data = this.productServiceServe.findAll();
		return data;
	}
	
	
	//
	public productService getProductServiceByCode(String code) {
		productService data = this.productServiceServe.findByServiceCode(code);
		return data;
	}

}
