package Password;

public class main {
    public static void main(String[] args) {
        PasswordSimple passwordS = new PasswordSimple("\\d");

        PasswordIntermedia passwordM = new PasswordIntermedia("\\d\\s");

        PasswordFuerte passwordF = new PasswordFuerte("^(.+)@(.+)$");

        passwordS.setValue("xyz");
        passwordS.setValue("987");

        passwordM.setValue("");
        passwordM.setValue("palabra");
        passwordM.setValue("123 456");

        passwordF.setValue("correo");
        passwordF.setValue("dervin.figueredo@mercadolibre.com");
    }
}
