package helitehnika.TarkvaraSpringBoot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvertController {

	private AdvertService advertService;
	
	public AdvertController(AdvertService advertService) {
		this.advertService = advertService;
	}
	
	@RequestMapping(value="/advert/add", method=RequestMethod.POST,
			consumes = "application/json")
	public Advert addAdvert(@RequestBody Advert advert) {
		return advertService.addAdvert(advert);
	}
}
