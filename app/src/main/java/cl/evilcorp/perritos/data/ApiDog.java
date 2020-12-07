package cl.evilcorp.perritos.data;

import cl.evilcorp.perritos.model.Breed;
import cl.evilcorp.perritos.model.Favorites;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiDog{
    @GET("breed/list/all/")
    Call<Breed> getAllBreeds();
    @GET("breed/{breed}/images/")
    Call<Favorites> getBreedDetail(@Path("breed") String breed);
}
