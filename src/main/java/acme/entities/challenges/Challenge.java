
package acme.entities.challenges;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Challenge extends DomainEntity {

	//Serialisation identifier-----------------------------

	private static final long	serialVersionUID	= 1L;

	//Attributes---------------------------------------

	@NotBlank
	private String				title;

	@Temporal(TemporalType.TIMESTAMP)
	@Future
	private Date				deadline;

	@NotBlank
	private String				description;

	@NotBlank
	private String				goalBronze;

	@NotBlank
	private String				rewardBronze;

	@NotBlank
	private String				goalSilver;

	@NotBlank
	private String				rewardSilver;

	@NotBlank
	private String				goalGold;

	@NotBlank
	private String				rewardGold;

	//Derived attributes-----------------------------------

	//Relationships----------------------------------------

}
