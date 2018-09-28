import org.junit.Assert;
import org.junit.Test;

public class NotaTest {

    @Test
    public void verifyTheCalcFinalNote(){
        Nota nota = new Nota();
        nota.setNota1(10);
        nota.setNota2(10);
        nota.setNota3(10);

        int expectResult=30;
        int actualResult=nota.getTotal();

        Assert.assertEquals("ERROR ! La nota no es correctamente calcualda",
                expectResult,actualResult);

    }

    @Test
    public void verifyTheCalcFinalNoteWithZero(){
        Nota nota = new Nota();

        int expectResult=0;
        int actualResult=nota.getTotal();

        Assert.assertEquals("ERROR ! La nota no es correctamente calcualda",
                expectResult,actualResult);
    }

    @Test
    public void verifyTheCalcFinalNoteWrongInput(){
        Nota nota = new Nota();
        nota.setNota1(200);
        nota.setNota2(10);
        nota.setNota3(10);

        int expectResult=20;
        int actualResult=nota.getTotal();

        Assert.assertEquals("ERROR ! La nota no es correctamente calcualda",
                expectResult,actualResult);
    }

}

