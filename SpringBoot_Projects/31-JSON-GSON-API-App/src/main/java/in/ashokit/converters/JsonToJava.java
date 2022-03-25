package in.ashokit.converters;

import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;

import in.ashokit.bindings.Person;

public class JsonToJava {

	public static void main(String[] args) throws Exception {

		Gson gson = new Gson();

		Person fromJson = gson.fromJson(new FileReader(new File("person.json")), Person.class);

		System.out.println(fromJson);
	}

}
