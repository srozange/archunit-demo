package com.accenture.archunit.model;

import org.immutables.value.Value;

@Value.Immutable
public abstract class User {

	public abstract String getFirstName();

	public abstract String getLastName();

}
