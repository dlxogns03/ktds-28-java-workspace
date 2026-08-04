package com.ktdsuniversity.edu.oop.datetime;

import java.time.LocalDate;

public class Friend {
	private String name;
	private LocalDate birthday;
	
	public Friend(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	
	
	
	public String getName() {
		return this.name;
	}


	public LocalDate getBirthday() {
		return this.birthday;
	}


	@Override
	public String toString() {
		return "Friend [name=" + name + ", birthday=" + birthday + "]";
	}
	
	

}
