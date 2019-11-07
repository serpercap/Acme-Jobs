
package acme.entities.banner;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class NonCommercialBanner extends Banner {

	// Serialisation identifier

	private static final long	serialVersionUID	= 1L;
	//Attributes

	private String				jingle;
}
