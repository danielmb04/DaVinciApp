package es.studium.davinciapp.ui.inicio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import es.studium.davinciapp.databinding.FragmentInicioBinding;


public class InicioFragment extends Fragment {

    private FragmentInicioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InicioViewModel inicioViewModel =
                new ViewModelProvider(this).get(InicioViewModel.class);

        binding = FragmentInicioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Vincular los textos con el ViewModel
        inicioViewModel.getTitle().observe(getViewLifecycleOwner(), binding.textInicioTitle::setText);
        inicioViewModel.getDescription().observe(getViewLifecycleOwner(), binding.textInicioDescription::setText);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}