package S11_Packages_Static_And_Final;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

   /* @Override
    public void storePassword() {
        System.out.println("Saving password as: " + this.decryptedPassword);
    }*/
}
