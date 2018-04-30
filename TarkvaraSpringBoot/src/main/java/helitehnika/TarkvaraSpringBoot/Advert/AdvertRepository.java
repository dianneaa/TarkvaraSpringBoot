package helitehnika.TarkvaraSpringBoot.Advert;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertRepository extends CrudRepository<Advert, Long> {
	@Override
	public List<Advert> findAll();

	public List<Advert> findAllBySubcategory(@Param("subcategory") String subcategory);
	

}
