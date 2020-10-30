package spring.annotations.java.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import spring.annotations.java.model.Speaker;

@Repository("speakerRepository")
public class SpeakerRepoIml implements SpeakerRepository {

	public List<Speaker> findAll() {
		// TODO Auto-generated method stub
		List<Speaker> speakers= new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		
		speaker.setFirstName("Venkat");
		speaker.setLastName("Tirmula");
		speakers.add(speaker);
	
		return speakers;
		
	}

}
