package cl.evilcorp.perritos.presenter;

import java.util.List;

import cl.evilcorp.perritos.model.InterfaceRepo;
import cl.evilcorp.perritos.model.Repo;

public class BreedPresenter implements InterfaceRepo {
    private InterfaceBreedView viewBreed;
    private Repo repo;

    public BreedPresenter(InterfaceBreedView viewBreed, Repo repo){
        this.viewBreed=viewBreed;
        this.repo=repo;
        repo.setBreedPresenter(this);
        repo.cargadorListaBreed();
    }
    @Override
    public void showBreed(List<String> breed){

        viewBreed.showBreed(breed);
    }
}
