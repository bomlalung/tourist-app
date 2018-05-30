package edu.eiu.tourist_app;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.Arrays;
import java.util.List;

import edu.eiu.tourist_app.dataModel.WikipediaPage;

public class PlacesViewModel extends ViewModel {

    private List<String> touristSites= Arrays.asList("mot hai","hai ba","ba bon","bon nam","nam sau","sau bay","bay tam","mot hai",
            "hai ba","ba bon","bon nam","nam sau","sau bay","bay tam","mot hai","hai ba","ba bon","bon nam","nam sau","sau bay","bay tam");

     private LiveData<List<WikipediaPage>> touristSitesData;
     private PlacesRepository placesRepository;

     public PlacesViewModel() {

         placesRepository = new PlacesRepository();
         touristSitesData = placesRepository.getTouristSites();

     }

    public LiveData<List<WikipediaPage>> getTouristSites() {

        return touristSitesData;

    }

}
