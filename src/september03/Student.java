package september03;

public class Student {
    private String name;
    private String phone;
    private String city;

    Student(String name, String phone, String city) {
        super();
        this.city = city;
        this.phone = phone;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student data is [name " + name + " , phone " + phone + " , city " + city + " ]";
    }
}
