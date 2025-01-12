package es.studium.davinciapp.ui.inicio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InicioViewModel extends ViewModel {

    private final MutableLiveData<String> title;
    private final MutableLiveData<String> description;


    public InicioViewModel() {
        title = new MutableLiveData<>();
        description = new MutableLiveData<>();


        // Configura los textos iniciales
        title.setValue("Leonardo Da Vinci");
        description.setValue("Leonardo da Vinci (1452-1519) fue un genio del Renacimiento, conocido por su talento como pintor, inventor, científico, anatomista e ingeniero. Creador de obras maestras como La Mona Lisa y La Última Cena, también destacó por sus innovadores estudios en anatomía, máquinas voladoras y arquitectura, dejando un legado que combina arte y ciencia de manera única.");

    }

    // Getters para acceder a los textos
    public LiveData<String> getTitle() {
        return title;
    }

    public LiveData<String> getDescription() {
        return description;
    }
}
