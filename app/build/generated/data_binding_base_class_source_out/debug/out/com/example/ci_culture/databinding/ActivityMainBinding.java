// Generated by view binder compiler. Do not edit!
package com.example.ci_culture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ci_culture.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button bussineses;

  @NonNull
  public final TextView ci;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final TextView info;

  @NonNull
  public final Button photos;

  @NonNull
  public final Button recipees;

  @NonNull
  public final ScrollView scNews;

  @NonNull
  public final TextView textView2;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button bussineses,
      @NonNull TextView ci, @NonNull ImageView imageView4, @NonNull ImageView imageView5,
      @NonNull TextView info, @NonNull Button photos, @NonNull Button recipees,
      @NonNull ScrollView scNews, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.bussineses = bussineses;
    this.ci = ci;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.info = info;
    this.photos = photos;
    this.recipees = recipees;
    this.scNews = scNews;
    this.textView2 = textView2;
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
      id = R.id.bussineses;
      Button bussineses = ViewBindings.findChildViewById(rootView, id);
      if (bussineses == null) {
        break missingId;
      }

      id = R.id.ci;
      TextView ci = ViewBindings.findChildViewById(rootView, id);
      if (ci == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.info;
      TextView info = ViewBindings.findChildViewById(rootView, id);
      if (info == null) {
        break missingId;
      }

      id = R.id.photos;
      Button photos = ViewBindings.findChildViewById(rootView, id);
      if (photos == null) {
        break missingId;
      }

      id = R.id.recipees;
      Button recipees = ViewBindings.findChildViewById(rootView, id);
      if (recipees == null) {
        break missingId;
      }

      id = R.id.scNews;
      ScrollView scNews = ViewBindings.findChildViewById(rootView, id);
      if (scNews == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, bussineses, ci, imageView4,
          imageView5, info, photos, recipees, scNews, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}