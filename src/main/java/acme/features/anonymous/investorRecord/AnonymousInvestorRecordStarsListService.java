
package acme.features.anonymous.investorRecord;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.investorRecord.InvestorRecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousInvestorRecordStarsListService implements AbstractListService<Anonymous, InvestorRecord> {

	//Internal State -----------------------------
	@Autowired
	AnonymousInvestorRecordRepository repository;


	// AbstractListService<Anonymous, InvestorRecord>
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
	public Collection<InvestorRecord> findMany(final Request<InvestorRecord> request) {
		assert request != null;

		Collection<InvestorRecord> result;
		result = this.repository.find5StarsAll();
		return result;
	}
}
