package com.isrdc.restful_api2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class Test1 {
	// de-seriliazation: creating java object from a json string written in file...
	public static void fromJson() {
		Gson gson = new Gson();

		try {
			FileReader fileReader = new FileReader("aaa.json");
			User user = gson.fromJson(fileReader, User.class);

			System.out.println(user);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// seriliazation: writing object into a file...
	public static void toJson() {
		User user = new User();

		user.setName("Rahul");
		user.setAge(21);

		Gson gson = new Gson();

		try {
			FileWriter fileWriter = new FileWriter("aaa.json");

			gson.toJson(user, fileWriter);

			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
