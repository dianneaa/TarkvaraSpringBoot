package helitehnika.TarkvaraSpringBoot.Advert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue	
	
	long id;
	String username;
	String password;
	String email;
	String phone;
	String firstname;
	String lastname;

}