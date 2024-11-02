public class Main {
    public static void main(String[] args) {
        String regex = "^(?!\\.)([a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*)@(?!-)[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(?<!-)$";

        String[] validEmails = {"user@example.com", "root@localhost", "user123@domain.co.uk", "simple@example.com"};
        String[] invalidEmails = {".root@localhost", "bug@@@com.ru", "@val.ru", "Just Text2", "user@.com.my", "username@sub_domain.com"};

        for (String email : validEmails) {
            System.out.println(email + " is valid: " + email.matches(regex));
        }

        for (String email : invalidEmails) {
            System.out.println(email + " is valid: " + email.matches(regex));
        }
    }
}
