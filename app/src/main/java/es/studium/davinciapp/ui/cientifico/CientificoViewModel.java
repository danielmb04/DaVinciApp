package es.studium.davinciapp.ui.cientifico;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CientificoViewModel extends ViewModel {

    private final MutableLiveData<String> title;
    private final MutableLiveData<String> description;
   // private final MutableLiveData<String> additionalText;

    public CientificoViewModel() {
        title = new MutableLiveData<>();
        description = new MutableLiveData<>();
       // additionalText = new MutableLiveData<>();

        // Configura los textos iniciales
        title.setValue("Descubrimiento científico");
        description.setValue("Leonardo da Vinci revolucionó el estudio de la anatomía humana a través de sus detallados dibujos y observaciones. Durante el Renacimiento, realizó más de 30 disecciones de cuerpos humanos, estudiando con precisión músculos, huesos, órganos internos y el sistema vascular. Sus cuadernos están llenos de ilustraciones anatómicas tan avanzadas que fueron utilizadas como referencia siglos después.\n" +
                "\n" +
                "Uno de sus descubrimientos más notables fue la primera representación detallada del corazón humano y su funcionamiento. Identificó correctamente cómo los ventrículos bombeaban la sangre y exploró el flujo de la misma, sentando las bases para futuros estudios cardiovasculares. Además, Leonardo fue uno de los primeros en documentar la conexión entre los tendones y los movimientos del cuerpo, demostrando su enfoque holístico de la anatomía.\n" +
                "\n" +
                "A pesar de que sus descubrimientos no fueron publicados en su tiempo, sus trabajos marcaron un antes y un después en la medicina y en la representación artística del cuerpo humano.");
       // additionalText.setValue("Contribuyó a la ciencia con estudios de anatomía y máquinas voladoras.");
    }

    // Getters para acceder a los textos
    public LiveData<String> getTitle() {
        return title;
    }

    public LiveData<String> getDescription() {
        return description;
    }

   // public LiveData<String> getAdditionalText() {
   //     return additionalText;
    //}
}
