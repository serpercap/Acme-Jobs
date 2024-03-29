
package acme.features.anonymous.starsCR;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.records.Records;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousStarsCRRepository extends AbstractRepository {

	@Query("select a from Records a where a.id = ?1")
	Records findOneById(int id);

	@Query("select a from Records a")
	Collection<Records> findManyAll();

	@Query("select a from Records a where a.stars = 5")
	Collection<Records> find5Stars();
}
