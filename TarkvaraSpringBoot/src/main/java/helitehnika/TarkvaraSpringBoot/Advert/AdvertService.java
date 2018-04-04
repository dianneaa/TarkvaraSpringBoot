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
		// here you can do some validations etc before saving the user
		//advert.setAdvert(new Advert());
		return advertRepository.save(advert);
	}
	
	 List<Advert> getAllAdverts() {
			return advertRepository.findAll();
		}
	 
	
	Optional<Advert> getAdvertById(long id){
		return advertRepository.findById(id);
    }
/*
    public void removeAdvertById(long id) {
        this.advertRepository.removeAdvertById(id);
    }

    public void updateAdvert(Advert advert){
        this.advertRepository.updateAdvert(advert);
    }

   
    */
}


