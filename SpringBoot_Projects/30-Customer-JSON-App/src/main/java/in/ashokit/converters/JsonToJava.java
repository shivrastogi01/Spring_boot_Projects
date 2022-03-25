package in.ashokit.converters;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.bindings.Customer;

public class JsonToJava {

	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper();

		Customer customer = mapper.readValue(new File("customer.json"), Customer.class);

		System.out.println(customer);
	}
}
