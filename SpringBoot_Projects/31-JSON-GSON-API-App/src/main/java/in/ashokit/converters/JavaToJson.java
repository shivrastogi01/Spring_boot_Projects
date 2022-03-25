package in.ashokit.converters;

import com.google.gson.Gson;

import in.ashokit.bindings.Person;

public class JavaToJson {

	public static void main(String[] args) {
		Person p = new Person(101, "Ashok", "ashok.b@ashokit.in");

		Gson gson = new Gson();
		
		String json = gson.toJson(p);
		
		System.out.println(json);

	}

}
