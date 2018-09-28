/**
 * Created by WINDOWS 8.1 on 27/09/2018.
 */
import java.util.Arrays;
public class Docente extends Persona{
    private Estudiante[] estudiantes;

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }




    public int[] sortNota() {

        int desordenado[] = new int[estudiantes.length];

        for (int i = 0; i < estudiantes.length; i++) {
            desordenado[i] = estudiantes[i].getNota().getTotal();
        }

        for (int j = 0; j < desordenado.length; j++) {
            for (int i = 0; i < desordenado.length - j - 1; i++) {
                if (desordenado[i] < desordenado[i + 1]) {
                    int tmp = desordenado[i + 1];
                    desordenado[i + 1] = desordenado[i];
                    desordenado[i] = tmp;
                }
            }
        }
        return desordenado;
    }

    public String[] sortName(){
        String desordenado[]=new String[estudiantes.length];

        for(int i=0;i<estudiantes.length;i++) {
            desordenado[i] = estudiantes[i].getNombre();
        }
        Arrays.sort(desordenado);

        return desordenado;
    }

}
