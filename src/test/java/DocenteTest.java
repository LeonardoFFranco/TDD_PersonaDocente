import org.junit.Assert;
import org.junit.Test;

/**
 * Created by WINDOWS 8.1 on 27/09/2018.
 */
public class DocenteTest {
    @Test
    public void verifyTheAgeMethod(){
        Docente docente = new Docente();
        docente.setFechaNac(1998);
        int expectResult=20;
        int actualResult=docente.getEdad();
        Assert.assertEquals("ERROR! Edad calculada incorrectamente", expectResult, actualResult);
    }

    @Test
    public void verifySortName(){
        Docente docente = new Docente();
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        estudiante1.setNombre("z");
        estudiante2.setNombre("a");
        Estudiante[] estudiantes= {estudiante1,estudiante2};
        docente.setEstudiantes(estudiantes);
        String [] expectedResult ={"a","z"};
        String [] actualResult= docente.sortName();
        Assert.assertEquals("ERROR!", expectedResult, actualResult);
    }

    @Test
    public void verifySortNote(){
        Docente docente = new Docente();
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Nota nota1=new Nota();
        estudiante1.setNota(nota1);
        nota1.setNota1(80);
        nota1.setNota2(80);
        nota1.setNota3(80);
        Nota nota2 =new Nota();
        estudiante2.setNota(nota2);
        nota2.setNota1(50);
        nota2.setNota2(50);
        nota2.setNota3(50);
        Estudiante[] estudiantes= {estudiante1,estudiante2};
        docente.setEstudiantes(estudiantes);
        int [] expectedResult ={240,150};
        int [] actualResult= docente.sortNota();
        Assert.assertEquals("ERROR!", expectedResult, actualResult);
    }
}
