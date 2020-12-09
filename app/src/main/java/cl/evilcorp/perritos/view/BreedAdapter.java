package cl.evilcorp.perritos.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BreedAdapter extends RecyclerView.Adapter<BreedAdapter.BreedAdapterVH>{


    @NonNull
    @Override
    public BreedAdapter.BreedAdapterVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BreedAdapter.BreedAdapterVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BreedAdapterVH extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tvBreed;
        public BreedAdapterVH(@NonNull View ItemView) {
          super(itemView);
          tvBreed=itemView.findViewById(())
        }

    }
}
}
