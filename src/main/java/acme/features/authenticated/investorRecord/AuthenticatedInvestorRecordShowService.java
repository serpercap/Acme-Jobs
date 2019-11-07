
package acme.features.authenticated.investorRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.investorRecord.InvestorRecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedInvestorRecordShowService implements AbstractShowService<Authenticated, InvestorRecord> {

	//Internal State -----------------------------
	@Autowired
	AuthenticatedInvestorRecordRepository repository;


	// AbstractShowService<Authenticated,investorRecord>
	@Override
	public boolean authorise(final Request<InvestorRecord> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<InvestorRecord> request, final InvestorRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "sector", "investingStatement", "stars");

	}
	@Override
	public InvestorRecord findOne(final Request<InvestorRecord> request) {
		assert request != null;

		InvestorRecord result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

	//	@Override
	//	public Collection<InvestorRecord> findManyAll(final Request<InvestorRecord> request) {
	//		assert request != null;
	//
	//		Collection<InvestorRecord> result;
	//		result = this.repository.findManyAll();
	//		return result;
	//	}
	//
	//
}
