// Generated by view binder compiler. Do not edit!
package com.example.practica2_ejercicio2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.practica2_ejercicio2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText contraseA;

  @NonNull
  public final Button entrar;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ConstraintLayout main;

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
  public final TextView textView2;

  @NonNull
  public final EditText usuario;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull EditText contraseA,
      @NonNull Button entrar, @NonNull ImageView imageView, @NonNull ConstraintLayout main,
      @Nullable TextView textView2, @NonNull EditText usuario) {
    this.rootView = rootView;
    this.contraseA = contraseA;
    this.entrar = entrar;
    this.imageView = imageView;
    this.main = main;
    this.textView2 = textView2;
    this.usuario = usuario;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
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
      id = R.id.contraseña;
      EditText contraseA = ViewBindings.findChildViewById(rootView, id);
      if (contraseA == null) {
        break missingId;
      }

      id = R.id.entrar;
      Button entrar = ViewBindings.findChildViewById(rootView, id);
      if (entrar == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);

      id = R.id.usuario;
      EditText usuario = ViewBindings.findChildViewById(rootView, id);
      if (usuario == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, contraseA, entrar, imageView,
          main, textView2, usuario);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
