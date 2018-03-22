package helitehnika.TarkvaraSpringBoot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AdvertController {

	private AdvertService advertService;
	
	public AdvertController(AdvertService advertService) {
		this.advertService = advertService;
	}	
	
	//addAdvert
	@RequestMapping(value="/advert/add", method=RequestMethod.POST,
			consumes = "application/json")
	public Advert addAdvert(@RequestBody Advert advert) {
		return advertService.addAdvert(advert);
	}
	
	 /*
	//getAdvertById
    @RequestMapping(value = "advert/{id}", method = RequestMethod.GET)
    public Advert getAdvertById(@PathVariable("id") long id){
        return advertService.getAdvertById(id);
    }
  
    //deleteAdvertById
    @DeleteMapping(value = "advert/{id}", method = RequestMethod.DELETE)
    public void deleteAdvertById(@PathVariable("id") long id){
        advertService.deleteById(id);
    }
    //updateAdvertById võtab sisse jsoni, et uuendada kuulutuse andmeid
    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
    public void updateAdvertById(@RequestBody Advert advert){
        advertService.updateAdvert(advert);
    }
    //getAllAdverts
    @RequestMapping(value="/adverts", method=RequestMethod.GET)
	public List<Advert> getAllAdverts() {
		return advertService.getAllAdverts();
	}
	*/
}

	
