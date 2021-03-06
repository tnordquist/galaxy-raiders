package edu.cnm.deepdive.galaxyraiders.controller.ui.survival;

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

/**
 * Connects the survival layout to the survival functionality.
 */
public class SurvivalFragment extends Fragment {

  private SurvivalViewModel survivalViewModel;

  /**
   * calls the survival fragment UI.
   * @param inflater Used to uncompress data.
   * @param container A view of a collection.
   * @param savedInstanceState Saves the instance.
   * @return Returns the root.
   */
  public View onCreateView(@NonNull LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
    survivalViewModel =
        ViewModelProviders.of(this).get(SurvivalViewModel.class);
    View root = inflater.inflate(R.layout.fragment_survival, container, false);
    final TextView textView = root.findViewById(R.id.text_gallery);
    survivalViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
      @Override
      public void onChanged(@Nullable String s) {
        textView.setText(s);
      }
    });
    return root;
  }
}