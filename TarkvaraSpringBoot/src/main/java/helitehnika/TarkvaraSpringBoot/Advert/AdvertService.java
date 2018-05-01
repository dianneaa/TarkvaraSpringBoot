package helitehnika.TarkvaraSpringBoot.Advert;
import org.springframework.stereotype.Service;
import helitehnika.TarkvaraSpringBoot.Advert.Advert;
import java.util.List;
import java.util.Optional;

@Service
public class AdvertService {

	private AdvertRepository advertRepository;

	public AdvertService(AdvertRepository advertRepository) {
		this.advertRepository = advertRepository;
	}

	Advert addAdvert(Advert advert) {		
		return advertRepository.save(advert);
	}
	
	 List<Advert> getAllAdverts() {
			return advertRepository.findAll();
		}	 
	
	Advert getAdvertById(long id){
		return advertRepository.findById(id);
    }

	List<Advert> getAdvertsBySubcategory(String subcategory) {
		
		return advertRepository.findAllBySubcategory(subcategory);
	}

}


