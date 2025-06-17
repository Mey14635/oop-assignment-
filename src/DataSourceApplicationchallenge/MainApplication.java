package DataSourceApplicationchallenge;

public class MainApplication
{
    public static void main(String[] args) {

        Admin curAdmin = new Admin(1234, "Stephan", "xa1@LW42%3");
        User curUser = new User(4455, "John");

        curAdmin.performOperation(new Update()); // DataSourceApplicationchallenge.Admin updates the data
        curUser.performOperation(new View());    // DataSourceApplicationchallenge.User views the data
    }
}
