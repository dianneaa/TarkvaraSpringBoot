package helitehnika.TarkvaraSpringBoot.Advert;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

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
	

    //@RequestMapping(value="/adverts", method=RequestMethod.GET)
	//public List<Advert> getAllAdverts() {
		//return advertService.getAllAdverts();
	//}
    
    @RequestMapping(value="/adverts/{subcategory}", method=RequestMethod.GET)
   	public List<Advert> getAdvertsBySubcategory(@PathVariable("subcategory") String subcategory) {
   		return advertService.getAdvertsBySubcategory(subcategory);
   	}
    	 
	
    //@RequestMapping(value = "/adverts/{id}", method = RequestMethod.GET)
    //public Optional<Advert> getAdvertById(@PathVariable("id") long id){
      //  return advertService.getAdvertById(id);
    //}    	
}

	
