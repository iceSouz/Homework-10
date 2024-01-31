package access;

public class User {
    private String login;
    Account account;

    public User(String login, String password) {
        this.login = login;
        account = new Account(password);
    }

    class Account {
        private String password;

        public Account(String password) {
            this.password = password;
        }

        public void displayAccount() {
            System.out.printf("Account Login successful! Login: %s, Password: %s \n", login, password);
        }
    }
}
