package in.ashokit.beans;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {

		Class<?> clz = Class.forName("in.ashokit.beans.User"); // to load the class

		Object obj = clz.newInstance(); // creating object for the class which is loaded

		Field field = clz.getDeclaredField("age"); // get the variable based on name

		field.setAccessible(true); // setting accessibility for variable

		field.set(obj, 29); // set the value for the variable

		User user = (User) obj; // typecasting to class obj

		System.out.println(user.getAge()); // calling getter method

	}

}
