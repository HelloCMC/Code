package news;

import javax.persistence.*;

@Entity
@Table(name = "NewsContents")
public class News {
	
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "dt")
	private String dt;
	
	@Column(name = "compnay")
	private String comany;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "editedTime")
	private String editedTime;
	
	@Column(name = "origin")
	private String origin;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "newsType")
	
	@JoinColumn(name="type")
	@ManyToOne
	private NewsType newsType;

	
	
	public News() {
		super();
	}

	public News(String id, String dt, String comany, String title, String editedTime, String origin, String content,
			NewsType newsType) {
		super();
		this.id = id;
		this.dt = dt;
		this.comany = comany;
		this.title = title;
		this.editedTime = editedTime;
		this.origin = origin;
		this.content = content;
		this.newsType = newsType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getComany() {
		return comany;
	}

	public void setComany(String comany) {
		this.comany = comany;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEditedTime() {
		return editedTime;
	}

	public void setEditedTime(String editedTime) {
		this.editedTime = editedTime;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public NewsType getNewsType() {
		return newsType;
	}

	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}

}

