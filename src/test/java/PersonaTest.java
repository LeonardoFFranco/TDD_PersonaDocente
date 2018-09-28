import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {

    @Test
    public void verifyTheAgeMethod(){
        Persona persona = new Persona();
        persona.setFechaNac(1998);
        int expectResult=20;
        int actualResult=persona.getEdad();
        Assert.assertEquals("ERROR! Edad calculada incorrectamente",expectResult,actualResult);
    }
}