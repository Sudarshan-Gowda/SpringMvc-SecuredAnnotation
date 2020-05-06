package com.star.sud.bean;

public class TechnologyDetails {
	private int techId;
	private String techName;
	private String techDescription;
	private int rating;
	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public TechnologyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechnologyDetails(int techId, String techName, String techDescription, int rating, String user) {
		super();
		this.techId = techId;
		this.techName = techName;
		this.techDescription = techDescription;
		this.rating = rating;
		this.user = user;
	}

	@Override
	public String toString() {
		return "OrderItem [techId=" + techId + ", techName=" + techName + ",  rating=" + rating + ", user=" + user
				+ "]";
	}

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public String getTechDescription() {
		return techDescription;
	}

	public void setTechDescription(String techDescription) {
		this.techDescription = techDescription;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}