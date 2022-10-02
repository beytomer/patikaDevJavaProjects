import java.util.ArrayList;
import java.util.Date;

public class User {
    private  String name;
    private  String lastName;
    private  String email;
    private  String password;
    private  String job;
    private  int age;
    private String membership;
    private Address address;
    private  Insurance insurance;
    private ArrayList<Insurance>insuranceList=new ArrayList<>();
    private  ArrayList<Address>addressList=new ArrayList<>();
    private  Date lastLoginDate;

    public User(String firstName,String lastName,String email,String password,String job,int age,Address address,String membership){
        this.name=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.job=job;
        this.age=age;
        this.address=address;
        this.addressList.add(address);
        this.lastLoginDate =new Date(System.currentTimeMillis());
        this.membership=membership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(Insurance insurance) {
        this.insuranceList.add(insurance);
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(Address addressList) {
        this.addressList.add(addressList);
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
