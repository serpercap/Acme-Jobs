
package acme.features.administrator.dashboard;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorDashboardRepository extends AbstractRepository {

	@Query("select count(a) from Announcement a")
	Double findNumberAnnouncement();

	@Query("select count(c) from Records c")
	Double findNumberCompanyRecord();

	@Query("select count(i) from InvestorRecord i")
	Double findNumberInvestorRecord();

	@Query("select min(r.reward.amount) from Request r")
	Double findMinRewardRequest();

	@Query("select max(r.reward.amount) from Request r")
	Double findMaxRewardRequest();

	@Query("select avg(r.reward.amount) from Request r")
	Double findAvgRewardRequest();

	@Query("select min(r.reward.amount) from Offer r")
	Double findMinRewardOffer();

	@Query("select max(r.reward.amount) from Offer r")
	Double findMaxRewardOffer();

	@Query("select avg(r.reward.amount) from Offer r")
	Double findAvgRewardOffer();
	////////////////////////////////////////////////////////////
	@Query("select sqrt(sum(r.reward.amount*r.reward.amount)/count(r)-(avg(r.reward.amount)*avg(r.reward.amount))) from Offer r")
	Double findDesvRewardOffer();

	@Query("select sqrt(sum(r.reward.amount*r.reward.amount)/count(r)-(avg(r.reward.amount)*avg(r.reward.amount))) from Request r")
	Double findDesvRewardRequest();

	@Query("select i.sector,count(i) from InvestorRecord i group by i.sector")
	Object[][] findInvestorGroupBySector();

	@Query("select i.sector,count(i) from Records i group by i.sector")
	Object[][] findCompanyGroupBySector();
}
