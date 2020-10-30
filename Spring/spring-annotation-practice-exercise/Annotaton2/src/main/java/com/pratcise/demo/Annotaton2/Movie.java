package com.pratcise.demo.Annotaton2;

public class Movie {
	Actor actor;

	public Movie(Actor actor) {
		super();
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [actor=" + actor.toString();
	}
}
