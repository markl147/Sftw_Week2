public class Person {
    private String name;
    private String address;
    private long phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person(){
        this.name=null;
        this.address = null;
        this.phoneNumber = 0;
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public Person(String name, long number){
        this.name = name;
        this.phoneNumber = number;
    }


    public Person(String name,long number, String address ){
        this.name=name;
        this.address = address;
        this.phoneNumber = number;
    }

    public void printDetails(){
        System.out.println("name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("**********************************");
    }
}
