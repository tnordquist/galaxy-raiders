package edu.cnm.deepdive.galaxyraiders.controller.ui.customization;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import edu.cnm.deepdive.galaxyraiders.R;

public class CustomizationFragment extends Fragment {

  public View onCreateView(@NonNull LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
    CustomizationViewModel customizationViewModel = ViewModelProviders.of(this)
        .get(CustomizationViewModel.class);
    View root = inflater.inflate(R.layout.fragment_customization, container, false);
    final TextView textView = root.findViewById(R.id.text_customization);
    customizationViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
      @Override
      public void onChanged(@Nullable String s) {
        textView.setText(s);
      }
    });
    return root;
  }
}