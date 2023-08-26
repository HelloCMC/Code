package myjackson.annotaion;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Student {

	@JsonProperty("name")
	private String n;
	
	@JsonIgnore		//	Serialize 시에 무시, Deserialize 시에 초기값
	private int age;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)	//	Null이면 무시
	@JsonProperty("addresses")	//	멤버변수와 같으면 생략가능
	private List<String> addresses;
}