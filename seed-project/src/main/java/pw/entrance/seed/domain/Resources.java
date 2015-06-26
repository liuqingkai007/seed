package pw.entrance.seed.domain;


/**
 * Resources entity. @author MyEclipse Persistence Tools
 */

public class Resources implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7167947627070610424L;
	private Integer id;
	private String url;
	private Integer priority;
	private Integer type;
	private String name;
	private String memo;
	
	// Constructors

	/** default constructor */
	public Resources() {
	}
	
	
	public String getMemo() {
		return memo;
	}



	public void setMemo(String memo) {
		this.memo = memo;
	}



	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}