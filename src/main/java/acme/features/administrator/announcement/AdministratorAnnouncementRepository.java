
package acme.features.administrator.announcement;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.announcement.Announcement;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorAnnouncementRepository extends AbstractRepository {

	@Query("select a from Announcement a where a.id = ?1")
	Announcement findOneAnnouncementById(int id);

	@Query("select a from Announcement a")
	Collection<Announcement> findManyAnnouncements();

}
