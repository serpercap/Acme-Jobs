
package acme.features.administrator.challenge;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.challenge.Challenge;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractCreateService;

@Service
public class AdministratorChallengeCreateService implements AbstractCreateService<Administrator, Challenge> {

	//Internal State -----------------------------
	@Autowired
	AdministratorChallengeRepository repository;


	@Override
	public boolean authorise(final Request<Challenge> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<Challenge> request, final Challenge entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void unbind(final Request<Challenge> request, final Challenge entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "deadline", "description", "goalBronze", "rewardBronze", "goalSilver", "rewardSilver", "goalGold", "rewardGold");

	}

	@Override
	public Challenge instantiate(final Request<Challenge> request) {
		Challenge result = new Challenge();
		Date deadline;

		deadline = new Date(System.currentTimeMillis() - 1);
		result.setDeadline(deadline);
		result.setDescription("Example description");
		result.setTitle("Titulo 1");
		result.setTitle("Texto de ejemplo");
		return result;
	}

	@Override
	public void validate(final Request<Challenge> request, final Challenge entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Challenge> request, final Challenge entity) {
		assert request != null;
		assert entity != null;
		this.repository.save(entity);

	}

}
