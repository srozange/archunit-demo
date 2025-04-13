package io.github.archunit;

import io.github.archunit.model.ImmutableUser;
import io.github.archunit.model.User;

public class ArchunitDemo {

	public static void main(String[] args) {
		User myUser = ImmutableUser.builder().firstName("Michel").lastName("Polnareff").build();
		System.out.println(myUser.getFirstName() + " " + myUser.getLastName());
	}

}
