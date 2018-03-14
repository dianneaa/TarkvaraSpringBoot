package helitehnika.TarkvaraSpringBoot;

import org.springframework.stereotype.Service;
import helitehnika.TarkvaraSpringBoot.Advert;

@Service
public class AdvertService {

	private AdvertRepository advertRepository;

	public AdvertService(AdvertRepository advertRepository) {
		this.advertRepository = advertRepository;
	}

	Advert addAdvert(Advert advert) {
		// here you can do some validations etc before saving the user
		//advert.setAdvert(new Advert());
		return advertRepository.save(advert);
	}
}
