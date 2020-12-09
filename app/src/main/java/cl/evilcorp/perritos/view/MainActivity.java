package cl.evilcorp.perritos.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

import cl.evilcorp.perritos.R;
import cl.evilcorp.perritos.model.Repo;
import cl.evilcorp.perritos.presenter.BreedPresenter;
import cl.evilcorp.perritos.presenter.InterfaceBreedView;

public class MainActivity extends AppCompatActivity implements InterfaceBreedView , OnItemClickListener {

    private BreedAdapter adapter;
    BreedPresenter presenter;
    private RecyclerView recicler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter=new BreedAdapter(new ArrayList<>(),this);
        presenter =new BreedPresenter(this,new Repo());
        recicler=findViewById(R.id.dog_recicler);
        recicler.setLayoutManager(new GridLayoutManager(this,2));;
        recicler.setAdapter(adapter);


    }
    @Override
    public void onClick(int position){
     getSupportFragmentManager().beginTransaction().replace(R.id.fl_recicler,ImageFragment.newInstance("",adapter.getListOfBreeds().get(position))).commit();
    }
    @Override
    public void showBreed(List<String>breed)
}