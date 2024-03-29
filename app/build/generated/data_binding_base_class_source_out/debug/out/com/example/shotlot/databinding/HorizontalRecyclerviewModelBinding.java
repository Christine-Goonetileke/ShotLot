// Generated by view binder compiler. Do not edit!
package com.example.shotlot.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.widget.TextView;
import com.example.shotlot.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HorizontalRecyclerviewModelBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView HorizontalCardView;

  @NonNull
  public final CircleImageView itemStoryimage;

  @NonNull
  public final TextView itemStoryname;

  private HorizontalRecyclerviewModelBinding(@NonNull CardView rootView,
      @NonNull CardView HorizontalCardView, @NonNull CircleImageView itemStoryimage,
      @NonNull TextView itemStoryname) {
    this.rootView = rootView;
    this.HorizontalCardView = HorizontalCardView;
    this.itemStoryimage = itemStoryimage;
    this.itemStoryname = itemStoryname;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static HorizontalRecyclerviewModelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HorizontalRecyclerviewModelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.horizontal_recyclerview_model, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HorizontalRecyclerviewModelBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView HorizontalCardView = (CardView) rootView;

      id = R.id.item_storyimage;
      CircleImageView itemStoryimage = rootView.findViewById(id);
      if (itemStoryimage == null) {
        break missingId;
      }

      id = R.id.item_storyname;
      TextView itemStoryname = rootView.findViewById(id);
      if (itemStoryname == null) {
        break missingId;
      }

      return new HorizontalRecyclerviewModelBinding((CardView) rootView, HorizontalCardView,
          itemStoryimage, itemStoryname);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
