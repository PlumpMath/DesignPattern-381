package com.wuxy13.pattern.proxy.person.bean;

public class PersonBeanImpl implements PersonBean {
	private String name;
	private String gender;
	private int rating;
	private int ratingCount;
	
	public PersonBeanImpl(String name,String gender,int rating,int ratingCount) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.gender=gender;
		this.rating=rating;
		this.ratingCount=ratingCount;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	@Override
	public int getRating() {
		// TODO Auto-generated method stub
		if(ratingCount==0){return 0;}
		return rating/ratingCount;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		this.gender=gender;
	}

	@Override
	public void setRating(int rating) {
		// TODO Auto-generated method stub
		rating+=rating;
		ratingCount++;
	}

}
