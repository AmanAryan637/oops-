package encapsulation;

/// declaring account class
class Account {
    private String name;
    private String email;
    private String password;

    /// Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
}

public class encapsulation {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setName("BCET");
        account1.setEmail("college.com");
        account1.setPassword("abcd");

        System.out.println("Name: " + account1.getName());
        System.out.println("Email: " + account1.getEmail());
        System.out.println("Password: " + account1.getPassword());
    }
}
