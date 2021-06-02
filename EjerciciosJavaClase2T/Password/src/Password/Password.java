package Password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    Pattern patron;
    Matcher matchea;

    public Password(String regex)
    {
        patron = Pattern.compile(regex);

    }
    public void setValue(String pwd){
        try
        {
            matchea = patron.matcher(pwd);
            if(matchea.find())
            {
                System.out.println("La contraseña se guardo con exito");
            }else{
                System.out.println("La contraseña no cumple los requisitos REGEX");
            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

