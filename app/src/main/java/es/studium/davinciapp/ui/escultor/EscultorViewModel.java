package es.studium.davinciapp.ui.escultor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EscultorViewModel extends ViewModel {

    private final MutableLiveData<String> title;
    private final MutableLiveData<String> description;

    public EscultorViewModel() {
        title = new MutableLiveData<>();
        description = new MutableLiveData<>();
        title.setValue("El Gran Caballo");

        description.setValue("La escultura diseñada por Leonardo da Vinci se llama \"El Gran Caballo\" (Il Cavallo Grande). Fue concebida como una monumental estatua ecuestre de bronce encargada por Ludovico Sforza, duque de Milán, en 1482.\n" +
                "\n" +
                "Leonardo planeó que la escultura tuviera 7,5 metros de altura, lo que la habría convertido en la más grande de su tiempo. Realizó estudios anatómicos exhaustivos de caballos para capturar su dinamismo y elegancia. Sin embargo, aunque Leonardo creó un modelo de arcilla, nunca llegó a fundirse en bronce porque el metal destinado a la obra fue utilizado para fabricar armas durante la guerra.\n" +
                "\n" +
                "A pesar de ello, los diseños de Leonardo inspiraron reconstrucciones modernas de la estatua, destacando su visión artística y técnica revolucionaria.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

    }


    public LiveData<String> getText() {
        return title;
    }
    public LiveData<String> getDescription() {
        return description;
    }
}