package news;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="NewsType")
public class NewsType implements Serializable{
	@Id
	@Column(name="type")
	private int type;
	
	@Column(name="category")
	private String category;
	
	public NewsType() {
		// TODO Auto-generated constructor stub
	}

	public NewsType(int type, String category) {
		super();
		this.type = type;
		this.category = category;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
