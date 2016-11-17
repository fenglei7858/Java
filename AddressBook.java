/**
*@author Lei Feng
*/
import java.util.Scanner;
public class AddressBook {
    //declaration
    private String businessPhone;
    private String cellphone;
    private String facebookId;
    private String firstName;
    private String homeAddress;
    private String homePhone;
    private String lastName;
    private String middleName;
    private String personalWebsite;
    private String skypeId;
    
    /**
     * to get two inputs(name1,name2) and compare if they are same or different
     * @param args 
     */
    public static void main(String[] args) {
        //create two scanners
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        //get two inputs and display message
        System.out.println("Please enter the name1 : ");
        String name1 = input1.next();
        System.out.println("Please enter the name2 : ");
        String name2 = input2.next();
        //using compareNames class with two parameters
        compareNames(name1,name2);
    }
    /**
     * 
     * @param businessPhone
     * @param cellphone
     * @param facebookId
     * @param fn
     * @param homeAddress
     * @param homePhone
     * @param ln
     * @param mn
     * @param personalWebsite
     * @param skypeId 
     */
    public AddressBook(String businessPhone, String cellphone, String facebookId, String fn, String homeAddress, 
            String homePhone, String ln, String mn, String personalWebsite, String skypeId)
    {
     this.businessPhone = businessPhone;
     this.cellphone = cellphone;
     this.facebookId = facebookId;
     this.firstName = fn;
     this.homeAddress = homeAddress;
     this.homePhone = homePhone;
     this.lastName = ln;
     this.middleName = mn;
     this.personalWebsite = personalWebsite;
     this.skypeId = skypeId;
    }
    /**
     * 
     * @param fn 
     */
    public AddressBook(String fn){
        this.firstName = fn;
    }
    /**
     * 
     * @param fn
     * @param mn 
     */
    public AddressBook(String fn, String mn){
        this.firstName = fn;
        this.middleName = mn;
    }
    /**
     * 
     * @param fn
     * @param mn
     * @param ln 
     */
    public AddressBook(String fn, String mn, String ln){
        this.firstName = fn;
        this.middleName = mn;
        this.lastName = ln;
    }
    /**
     * to //create a comparison method compareNames(name1, name2)
     * @param name1
     * @param name2
     * @return result
     */
    public static String compareNames(String name1, String name2){
        
        String result = "";
        //to compare name1 and name2
        int compare = name1.compareToIgnoreCase(name2);
        //if name1 and name2 are same then display message
        if (compare != 0){
            result = "The name1 and name2 are different";
        }
        //if name1 and name2 are different then display message
            else{
            result = "The name1 and name2 are the same";
        }
        System.out.println(result);
        return result;
    }
    /**
     * 
     * @return businessPhone
     */
    public String getBusinessPhone() {
	return businessPhone;
	}
    /**
     * 
     * @return cellPhone
     */
    public String getCellphone() {
	return cellphone;
	}
    /**
     * 
     * @return facebookId
     */
    public String getFacebookID() {
	return facebookId;
	}
    /**
     * 
     * @return firstName
     */
    public String getFirstName() {
	return firstName;
	}
    /**
     * 
     * @return homeAddress
     */
    public String getHomeAddress() {
	return homeAddress;
	}
    /**
     * 
     * @return homePhone
     */
    public String getHomePhone() {
	return homePhone;
	}
    /**
     * 
     * @return lastName
     */
    public String getLastName() {
	return lastName;
	}
    /**
     * 
     * @return middleName
     */
    public String getMiddleName() {
	return middleName;
	}
    /**
     * 
     * @return personalWebsite
     */
    public String getPersonalWebsite() {
	return personalWebsite;
	}
    /**
     * 
     * @return skypeId
     */
    public String getSkypeId() {
	return skypeId;
	}
    /**
     * 
     * @param businessPhone 
     */
    public void setBusinessPhone(String businessPhone){
        this.businessPhone = businessPhone;
    }
    /**
     * 
     * @param cellphone 
     */
    public void setCellphone(String cellphone){
        this.cellphone = cellphone;
    }
    /**
     * 
     * @param facebookId 
     */
    public void setFacebookId(String facebookId){
        this.facebookId = facebookId;
    }
    /**
     * 
     * @param firstName 
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    /**
     * 
     * @param homeAddress 
     */
    public void setHomeAddress(String homeAddress){
        this.homeAddress = homeAddress;
    }
    /**
     * 
     * @param homePhone 
     */
    public void setHomePhone(String homePhone){
        this.homePhone = homePhone;
    }
    /**
     * 
     * @param lastName 
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    /**
     * 
     * @param middleName 
     */
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    /**
     * 
     * @param personalWebsite 
     */
    public void setPersonalWebsite(String personalWebsite){
        this.personalWebsite = personalWebsite;
    }
    /**
     * 
     * @param skypeId 
     */
    public void setSkypeId(String skypeId){
        this.skypeId = skypeId;
    }
    
    
}
