
package acme.features.administrator.announcement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.announcement.Announcement;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractShowService;

@Service
public class AdministratorAnnouncementShowService implements AbstractShowService<Administrator, Announcement> {

	//Internal State -----------------------------
	@Autowired
	AdministratorAnnouncementRepository repository;


	// AbstractShowService<Administrator, Announcement>
	@Override
	public boolean authorise(final Request<Announcement> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Announcement> request, final Announcement entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "moment", "title", "moreInfo", "text");

	}

	@Override
	public Announcement findOne(final Request<Announcement> request) {
		assert request != null;

		Announcement result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}
