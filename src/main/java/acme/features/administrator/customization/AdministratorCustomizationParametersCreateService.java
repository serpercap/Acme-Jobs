
package acme.features.administrator.customization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.customizationParameters.CustomizationParameters;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractCreateService;

@Service
public class AdministratorCustomizationParametersCreateService implements AbstractCreateService<Administrator, CustomizationParameters> {

	//Internal State -----------------------------
	@Autowired
	AdministratorCustomizationParametersRepository repository;


	@Override
	public boolean authorise(final Request<CustomizationParameters> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<CustomizationParameters> request, final CustomizationParameters entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void unbind(final Request<CustomizationParameters> request, final CustomizationParameters entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "spamWordEN", "spamWordES", "spamThreshold");
	}

	@Override
	public CustomizationParameters instantiate(final Request<CustomizationParameters> request) {
		assert request != null;
		CustomizationParameters result = new CustomizationParameters();
		result.setSpamThreshold(1.0);
		result.setSpamWordEN("Example");
		result.setSpamWordES("Ejemplo");
		return result;
	}

	@Override
	public void validate(final Request<CustomizationParameters> request, final CustomizationParameters entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<CustomizationParameters> request, final CustomizationParameters entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}
