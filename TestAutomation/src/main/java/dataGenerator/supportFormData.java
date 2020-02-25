package dataGenerator;

import com.github.javafaker.Faker;

public class supportFormData {
	Faker fake = new Faker();
	
	 public String firstName() {
     return fake.name().firstName();
		 }

	 public String lastName() {
		 return fake.name().lastName(); 
		 }

	 public String email() {
		 String email = fake.name().username()+"@gmail.com";
		 return email;
		 }
	 
	 public String phonenumber() {
		 return fake.phoneNumber().cellPhone();
		 }
	 
	 public String websiteURL() {
		 return fake.company().url();
		 }
	 
	 public String businessName() {
		 return fake.company().name();
		 }
	 
	 public int select_reasonForEnquiry() {
     return fake.number().numberBetween(0, 2);
    		}
	 
	 public String message() {
		 return fake.bothify("Random text");
		 }
}
