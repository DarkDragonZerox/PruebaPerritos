package cl.evilcorp.perritos.model;

import java.util.ArrayList;
import java.util.List;

import cl.evilcorp.perritos.data.RetrofitClient;
import cl.evilcorp.perritos.presenter.BreedPresenter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repo {

    private BreedPresenter breedPresenter;
    public void setBreedPresenter(BreedPresenter breedPresenter) {
        this.breedPresenter = breedPresenter;
    }
public void cargadorListaBreed(){
    RetrofitClient.getRetrofitInstance().getAllBreeds().enqueue(new Callback<Breed>() {
        @Override
        public void onResponse(Call<Breed> call, Response<Breed> response) {
            List<String> breed =new ArrayList<>();
            breed.addAll(response.body().getMessage().keySet());
            breedPresenter.showBreed(breed);
        }

        @Override
        public void onFailure(Call<Breed> call, Throwable t) {

        }
    });
}
}
