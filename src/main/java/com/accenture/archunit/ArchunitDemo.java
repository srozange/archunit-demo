package com.accenture.archunit;

import com.accenture.archunit.model.ImmutableUser;
import com.accenture.archunit.model.User;

public class ArchunitDemo {

	public static void main(String[] args) {
		User myUser = ImmutableUser.builder().firstName("Michel").lastName("Polnareff").build();
		System.out.println(myUser.getFirstName() + " " + myUser.getLastName());
	}

}
