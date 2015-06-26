package pw.entrance.seed.domain;

import java.util.Set;


/**
 * Roles entity. @author MyEclipse Persistence Tools
 */

public class Roles implements java.io.Serializable {
	private static final long serialVersionUID = 5793809850401789408L;
	private Integer id;
	private Integer enable;
	private String name;
	private Set<Resources> resources;
	
	/** default constructor */
	public Roles() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEnable() {
		return this.enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Resources> getResources() {
		return resources;
	}

	public void setResources(Set<Resources> resources) {
		this.resources = resources;
	}
}