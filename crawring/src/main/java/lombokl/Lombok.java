package lombokl;

import java.util.Date;

import lombok.Data;




@Data
public class Lombok {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private Date dataOfBirth;
}