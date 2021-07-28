// Generated by view binder compiler. Do not edit!
package com.example.vocabapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.vocabapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFirthBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button signInButton;

  @NonNull
  public final Button signUpButton;

  private FragmentFirthBinding(@NonNull FrameLayout rootView, @NonNull Button signInButton,
      @NonNull Button signUpButton) {
    this.rootView = rootView;
    this.signInButton = signInButton;
    this.signUpButton = signUpButton;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_firth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.sign_in_button;
      Button signInButton = rootView.findViewById(id);
      if (signInButton == null) {
        break missingId;
      }

      id = R.id.sign_up_button;
      Button signUpButton = rootView.findViewById(id);
      if (signUpButton == null) {
        break missingId;
      }

      return new FragmentFirthBinding((FrameLayout) rootView, signInButton, signUpButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
