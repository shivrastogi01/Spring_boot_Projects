package in.ashokit.converters;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.bindings.Address;
import in.ashokit.bindings.Customer;
import in.ashokit.bindings.InsurancePolicy;

public class JavaToJson {

	public static void main(String[] args) throws Exception{
		InsurancePolicy policy = 
				new InsurancePolicy("Jeevan Anand", "20-May-2010", "20-May-2030", 50000.00);
		
		Address addr = new Address("Hyd", "TG", "India");
		
		Customer customer =
				new Customer(101, "Mahesh", "mahesh.k@ashokit.in", 30, policy, addr);
		
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.writeValue(new File("customer.json"), customer);
		
		System.out.println("****** Object Converted To Json Successfully *********");
	}

}
