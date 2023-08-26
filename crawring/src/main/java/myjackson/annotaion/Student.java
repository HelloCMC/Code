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
	
	@JsonIgnore		//	Serialize �ÿ� ����, Deserialize �ÿ� �ʱⰪ
	private int age;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)	//	Null�̸� ����
	@JsonProperty("addresses")	//	��������� ������ ��������
	private List<String> addresses;
}