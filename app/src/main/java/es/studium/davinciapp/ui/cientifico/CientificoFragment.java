package es.studium.davinciapp.ui.cientifico;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import es.studium.davinciapp.databinding.FragmentCientificoBinding;

public class CientificoFragment extends Fragment {

    private FragmentCientificoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CientificoViewModel cientificoViewModel =
                new ViewModelProvider(this).get(CientificoViewModel.class);

        binding = FragmentCientificoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Vincular los textos con el ViewModel
        cientificoViewModel.getTitle().observe(getViewLifecycleOwner(), binding.textCientificoTitle::setText);
        cientificoViewModel.getDescription().observe(getViewLifecycleOwner(), binding.textCientificoDescription::setText);
       // cientificoViewModel.getAdditionalText().observe(getViewLifecycleOwner(), binding.textCientificoAdditional::setText);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
