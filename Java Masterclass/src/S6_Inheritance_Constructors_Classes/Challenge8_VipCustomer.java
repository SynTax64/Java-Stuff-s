package S6_Inheritance_Constructors_Classes;

public class Challenge8_VipCustomer {
    public String name;
    public int limit;
    public String email;

    public Challenge8_VipCustomer() {
        this("test", 0, "test@gmail.com");
    }

    public Challenge8_VipCustomer(String name, int limit) {
        this(name, limit, "test@gmail.com");
    }

    public Challenge8_VipCustomer(String name, int limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
