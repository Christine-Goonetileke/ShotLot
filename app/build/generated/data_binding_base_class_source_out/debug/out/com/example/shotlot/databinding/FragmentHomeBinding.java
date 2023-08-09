// Generated by view binder compiler. Do not edit!
package com.example.shotlot.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.shotlot.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView MyHorizrecyclerview;

  @NonNull
  public final RecyclerView MyNewrecyclerview;

  @NonNull
  public final ImageButton addstoryicon;

  @NonNull
  public final CircleImageView addstoryimage;

  @NonNull
  public final TextView itemStoryname;

  @NonNull
  public final ImageButton messageswindow;

  @NonNull
  public final ImageButton profileActivities;

  @NonNull
  public final ImageView shotlotlogoname;

  @NonNull
  public final TextView textHome;

  @NonNull
  public final RelativeLayout toplogonamebar;

  private FragmentHomeBinding(@NonNull RelativeLayout rootView,
      @NonNull RecyclerView MyHorizrecyclerview, @NonNull RecyclerView MyNewrecyclerview,
      @NonNull ImageButton addstoryicon, @NonNull CircleImageView addstoryimage,
      @NonNull TextView itemStoryname, @NonNull ImageButton messageswindow,
      @NonNull ImageButton profileActivities, @NonNull ImageView shotlotlogoname,
      @NonNull TextView textHome, @NonNull RelativeLayout toplogonamebar) {
    this.rootView = rootView;
    this.MyHorizrecyclerview = MyHorizrecyclerview;
    this.MyNewrecyclerview = MyNewrecyclerview;
    this.addstoryicon = addstoryicon;
    this.addstoryimage = addstoryimage;
    this.itemStoryname = itemStoryname;
    this.messageswindow = messageswindow;
    this.profileActivities = profileActivities;
    this.shotlotlogoname = shotlotlogoname;
    this.textHome = textHome;
    this.toplogonamebar = toplogonamebar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.MyHorizrecyclerview;
      RecyclerView MyHorizrecyclerview = rootView.findViewById(id);
      if (MyHorizrecyclerview == null) {
        break missingId;
      }

      id = R.id.MyNewrecyclerview;
      RecyclerView MyNewrecyclerview = rootView.findViewById(id);
      if (MyNewrecyclerview == null) {
        break missingId;
      }

      id = R.id.addstoryicon;
      ImageButton addstoryicon = rootView.findViewById(id);
      if (addstoryicon == null) {
        break missingId;
      }

      id = R.id.addstoryimage;
      CircleImageView addstoryimage = rootView.findViewById(id);
      if (addstoryimage == null) {
        break missingId;
      }

      id = R.id.item_storyname;
      TextView itemStoryname = rootView.findViewById(id);
      if (itemStoryname == null) {
        break missingId;
      }

      id = R.id.messageswindow;
      ImageButton messageswindow = rootView.findViewById(id);
      if (messageswindow == null) {
        break missingId;
      }

      id = R.id.profileActivities;
      ImageButton profileActivities = rootView.findViewById(id);
      if (profileActivities == null) {
        break missingId;
      }

      id = R.id.shotlotlogoname;
      ImageView shotlotlogoname = rootView.findViewById(id);
      if (shotlotlogoname == null) {
        break missingId;
      }

      id = R.id.text_home;
      TextView textHome = rootView.findViewById(id);
      if (textHome == null) {
        break missingId;
      }

      id = R.id.toplogonamebar;
      RelativeLayout toplogonamebar = rootView.findViewById(id);
      if (toplogonamebar == null) {
        break missingId;
      }

      return new FragmentHomeBinding((RelativeLayout) rootView, MyHorizrecyclerview,
          MyNewrecyclerview, addstoryicon, addstoryimage, itemStoryname, messageswindow,
          profileActivities, shotlotlogoname, textHome, toplogonamebar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
