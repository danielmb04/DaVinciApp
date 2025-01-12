package es.studium.davinciapp.ui.inventor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InventorViewModel extends ViewModel {

    private final MutableLiveData<String> title;
    private final MutableLiveData<String> description;


    public InventorViewModel() {
        title = new MutableLiveData<>();
        description = new MutableLiveData<>();

        title.setValue("Paracaídas");
        description.setValue("Si bien el paracaídas tal como lo conocemos hoy no es obra de Leonardo, su prototipo fue el puntapié para pensar el futuro del artefacto. El invento consistía en una base piramidal cuadrada con un lado y una altura de 7 metros. En el 2008, un paracaidista replicó el invento de Da Vinci con materiales de época y saltó desde 650 metros logrando un aterrizaje correcto. Sin embargo, destacó que volaba en dirección del viento y que era imposible dominarlo.");
    }

    public LiveData<String> getTitle() {
        return title;
    }
    public LiveData<String> getDescription() {
        return description;
    }

}