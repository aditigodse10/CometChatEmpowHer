// Generated by view binder compiler. Do not edit!
package com.example.cometchatandroidsample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cometchatandroidsample.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final AppCompatButton goToLogin1;

  @NonNull
  public final AppCompatButton goToSignup1;

  @NonNull
  public final ImageView imageView2;

  private ActivityMainBinding(@NonNull CardView rootView, @NonNull AppCompatButton goToLogin1,
      @NonNull AppCompatButton goToSignup1, @NonNull ImageView imageView2) {
    this.rootView = rootView;
    this.goToLogin1 = goToLogin1;
    this.goToSignup1 = goToSignup1;
    this.imageView2 = imageView2;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.go_to_login1;
      AppCompatButton goToLogin1 = ViewBindings.findChildViewById(rootView, id);
      if (goToLogin1 == null) {
        break missingId;
      }

      id = R.id.go_to_signup1;
      AppCompatButton goToSignup1 = ViewBindings.findChildViewById(rootView, id);
      if (goToSignup1 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      return new ActivityMainBinding((CardView) rootView, goToLogin1, goToSignup1, imageView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
