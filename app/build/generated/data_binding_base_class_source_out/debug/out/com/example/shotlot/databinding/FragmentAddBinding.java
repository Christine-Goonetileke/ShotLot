// Generated by view binder compiler. Do not edit!
package com.example.shotlot.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.shotlot.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView GallaryText;

  @NonNull
  public final TextView addnewpostText;

  @NonNull
  public final TextView textAdd;

  private FragmentAddBinding(@NonNull RelativeLayout rootView, @NonNull TextView GallaryText,
      @NonNull TextView addnewpostText, @NonNull TextView textAdd) {
    this.rootView = rootView;
    this.GallaryText = GallaryText;
    this.addnewpostText = addnewpostText;
    this.textAdd = textAdd;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.GallaryText;
      TextView GallaryText = rootView.findViewById(id);
      if (GallaryText == null) {
        break missingId;
      }

      id = R.id.addnewpostText;
      TextView addnewpostText = rootView.findViewById(id);
      if (addnewpostText == null) {
        break missingId;
      }

      id = R.id.text_add;
      TextView textAdd = rootView.findViewById(id);
      if (textAdd == null) {
        break missingId;
      }

      return new FragmentAddBinding((RelativeLayout) rootView, GallaryText, addnewpostText,
          textAdd);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
