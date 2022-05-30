package hosptal.app.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MedOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime placedDateTime; 
	
	
	@ManyToOne
	@JoinColumn(name="encounter_id")
	private Encounter encounter;
	
	
	@OneToMany(mappedBy = "medOrder")
	private List<Item> items;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDateTime getPlacedDateTime() {
		return placedDateTime;
	}


	public void setPlacedDateTime(LocalDateTime placedDateTime) {
		this.placedDateTime = placedDateTime;
	}


	public Encounter getEncounter() {
		return encounter;
	}


	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}


	public List<Item> getItems() {
		return items;
	}


	public void setItems(List<Item> items) {
		this.items = items;
	}

	
	
}
