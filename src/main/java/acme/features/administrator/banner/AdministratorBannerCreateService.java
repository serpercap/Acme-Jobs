
package acme.features.administrator.banner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.banner.Banner;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractCreateService;

@Service
public class AdministratorBannerCreateService implements AbstractCreateService<Administrator, Banner> {

	//Internal State -----------------------------
	@Autowired
	AdministratorBannerRepository repository;


	@Override
	public boolean authorise(final Request<Banner> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<Banner> request, final Banner entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void unbind(final Request<Banner> request, final Banner entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "url", "picture", "slogan");

	}

	@Override
	public Banner instantiate(final Request<Banner> request) {
		Banner result = new Banner();

		result.setPicture("https://www.url-de-ejemplo.com");
		result.setSlogan("Texto de ejemplo");
		result.setUrl("https://www.url-de-ejemplo.com");
		return result;
	}

	@Override
	public void validate(final Request<Banner> request, final Banner entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Banner> request, final Banner entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}