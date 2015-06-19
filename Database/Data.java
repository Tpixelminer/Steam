public class Data 
{
	
	String firstName;
    String lastName;
    String phoneNumber;
    String address;
    int age;
    Data [] relations;
    public Data() {
    	relations = new Data[10];
    }
	public Data (String first_name, String last_name, int my_age){
		firstName=first_name;
		lastName=last_name;
		age=my_age;
    }

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String first_name){
		firstName = first_name;
	}
	public String getLastName(){
		return lastName;
	}

	public void setLastName(String last_name) {
		lastName = last_name;

	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phone_number){
		phoneNumber = phone_number;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String user_address) {
		address = user_address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int my_age) {
		age = my_age;
	}
	public Data [] getRelations() {
		return relations;
	}
	public void setRelations(Data[] my_relations) {
		relations = my_relations;


	}
}
