package com.pratcise.demo.Annotation1;

public class Movie {
	Actor actor;

	public void setActor(Actor actor) {
		this.actor = actor;
	}



	@Override
	public String toString() {
		return "Movie [actorName=" + actor.name + ",actorAge="+actor.age+",actorGender"+actor.gender+"]";
	}

}
