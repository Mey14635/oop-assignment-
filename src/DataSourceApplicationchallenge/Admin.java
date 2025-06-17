package DataSourceApplicationchallenge;

public class Admin extends Account
{
    private String authPassword;

    public Admin(int _id, String _name, String _password)
    {
        id = _id;
        name = _name;
        authPassword = _password;
    }
}
