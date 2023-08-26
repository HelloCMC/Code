package json;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonMain {
	public static void main(String[] argv) {
		Academy academy = Academy.getDummy();

		System.out.println("1. Object -> Json");
		String academy2Json = new Gson().toJson(academy);
		System.out.println(academy2Json);

		System.out.println("2. Object => Json");
		String academy2JsonIsNull = new GsonBuilder().serializeNulls().create().toJson(academy);
		System.out.println(academy2JsonIsNull);
		
		System.out.println("3. Json => Object");
		Academy json2Academy = new Gson().fromJson(academy2Json, Academy.class);
		printAcademy(json2Academy);

		System.out.println("4. Json => Object");
		Academy json2AcademyIsNull = new Gson().fromJson(academy2JsonIsNull, Academy.class);
		printAcademy(json2AcademyIsNull);
	}

	private static void printAcademy(Academy company) {
		List<Student> studentList = company.getStudents();
		System.out.println("ÇÐ¿ø¸í: " + company.getName());
		for (Student s : studentList) {
			System.out.println(s);
		}
	}
}