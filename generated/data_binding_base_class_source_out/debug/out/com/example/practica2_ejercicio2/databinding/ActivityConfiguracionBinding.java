// Generated by view binder compiler. Do not edit!
package com.example.practica2_ejercicio2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.practica2_ejercicio2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityConfiguracionBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout2;

  @NonNull
  public final Button guardar;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Switch switch1;

  @NonNull
  public final Switch switch2;

  @NonNull
  public final TextView textView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView textView9;

  private ActivityConfiguracionBinding(@NonNull CoordinatorLayout rootView,
      @NonNull ConstraintLayout constraintLayout2, @NonNull Button guardar,
      @NonNull ImageView imageView, @NonNull Switch switch1, @NonNull Switch switch2,
      @NonNull TextView textView, @Nullable TextView textView9) {
    this.rootView = rootView;
    this.constraintLayout2 = constraintLayout2;
    this.guardar = guardar;
    this.imageView = imageView;
    this.switch1 = switch1;
    this.switch2 = switch2;
    this.textView = textView;
    this.textView9 = textView9;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityConfiguracionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityConfiguracionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_configuracion, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityConfiguracionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout2;
      ConstraintLayout constraintLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout2 == null) {
        break missingId;
      }

      id = R.id.guardar;
      Button guardar = ViewBindings.findChildViewById(rootView, id);
      if (guardar == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.switch1;
      Switch switch1 = ViewBindings.findChildViewById(rootView, id);
      if (switch1 == null) {
        break missingId;
      }

      id = R.id.switch2;
      Switch switch2 = ViewBindings.findChildViewById(rootView, id);
      if (switch2 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);

      return new ActivityConfiguracionBinding((CoordinatorLayout) rootView, constraintLayout2,
          guardar, imageView, switch1, switch2, textView, textView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}