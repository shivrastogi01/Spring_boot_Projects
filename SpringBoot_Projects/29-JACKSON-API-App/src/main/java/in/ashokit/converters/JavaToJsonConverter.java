package in.ashokit.converters;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.bindings.Person;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {
		Person p = new Person(101, "Raju", 20);

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(p);
		System.out.println(json);
	}
}
