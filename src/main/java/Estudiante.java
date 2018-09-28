/**
 * Created by WINDOWS 8.1 on 27/09/2018.
 */
public class Estudiante extends Persona {
    private Nota nota;
    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }



    public boolean isApp() {
        return this.nota.getTotal() / 3 > 70;
    }
}
