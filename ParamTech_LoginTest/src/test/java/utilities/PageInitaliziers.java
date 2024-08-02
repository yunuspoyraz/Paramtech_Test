package utilities;

import pages.CreateAccountPage;
import pages.HomePage;
import pages.LoginPage;

public class PageInitaliziers {

    public static HomePage home;
    public static LoginPage login;
    public static CreateAccountPage createAccount;

    public static void initializePageObjects() {
        home = new HomePage();
        login = new LoginPage();
        createAccount = new CreateAccountPage();
    }

}
