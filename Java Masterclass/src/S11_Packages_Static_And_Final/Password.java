package S11_Packages_Static_And_Final;

public class Password {
    private static final int key = 465816543;
    private final int encryptedPassword;

    public Password(int encryptedPassword) {
        this.encryptedPassword = encryptDecrypt(encryptedPassword);
    }

    public int encryptDecrypt(int password) {
        return password ^ key;
    }

    public void storePassword() {
        System.out.println("Saving password: " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you can't in");
            return false;
        }
    }
}
