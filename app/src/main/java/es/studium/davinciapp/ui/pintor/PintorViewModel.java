package es.studium.davinciapp.ui.pintor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PintorViewModel extends ViewModel {

    private final MutableLiveData<String> title;
    private final MutableLiveData<String> description;

    public PintorViewModel() {
        title = new MutableLiveData<>();
        description = new MutableLiveData<>();


        title.setValue("La última cena");
        description.setValue("La Última Cena de Leonardo da Vinci es una de las obras maestras más icónicas del Renacimiento. Pintada entre 1495 y 1498 en el refectorio del convento de Santa Maria delle Grazie en Milán, representa el momento en que Jesús anuncia que uno de sus apóstoles lo traicionará. La composición destaca por su uso de la perspectiva, la expresión emocional de los apóstoles y la atmósfera dramática, capturando la tensión del instante. Aunque se ha deteriorado con el tiempo, sigue siendo un símbolo universal de arte y espiritualidad.");
    }

    public LiveData<String> getText() {
        return title;
    }
    public LiveData<String> getDescription() {
        return description;
    }

}