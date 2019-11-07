
package acme.features.administrator.customization;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.customizationParameters.CustomizationParameters;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractListService;

@Service
public class AdministratorCustomizationParametersListService implements AbstractListService<Administrator, CustomizationParameters> {

	//Internal State -----------------------------
	@Autowired
	AdministratorCustomizationParametersRepository repository;


	// AbstractListService<Administrator, CustomizationParameters>
	@Override
	public boolean authorise(final Request<CustomizationParameters> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<CustomizationParameters> request, final CustomizationParameters entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "spamWordEN", "spamWordES");

	}

	@Override
	public Collection<CustomizationParameters> findMany(final Request<CustomizationParameters> request) {
		assert request != null;

		Collection<CustomizationParameters> result;
		result = this.repository.findManyAll();
		return result;
	}

}
