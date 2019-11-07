
package acme.entities.customizationParameters;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CustomizationParameters extends DomainEntity {

	/**
	 *
	 */
	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				spamWordEN;
	@NotBlank
	private String				spamWordES;

	@Max(1)
	@Min(0)
	@NotNull
	private Double				spamThreshold;
}
