import org.junit.Assert;
import org.junit.Test;

/**
 * Created by WINDOWS 8.1 on 27/09/2018.
 */
public class EstudianteTest {

    @Test
    public void verifyTheAgeMethod(){
        Estudiante estudiante = new Estudiante();
        estudiante.setFechaNac(1998);
        int expectResult=20;
        int actualResult=estudiante.getEdad();
        Assert.assertEquals("ERROR! Edad calculada incorrectamente", expectResult, actualResult);
    }

    @Test
    public void isApp(){
        Estudiante estudiante = new Estudiante();
        Nota nota1=new Nota();
        estudiante.setNota(nota1);
        estudiante.getNota().setNota1(80);
        estudiante.getNota().setNota2(80);
        estudiante.getNota().setNota3(80);
        boolean expectedResult=true;
        boolean actualResult= estudiante.isApp();
        Assert.assertEquals("Error",expectedResult,actualResult);
    }
}
