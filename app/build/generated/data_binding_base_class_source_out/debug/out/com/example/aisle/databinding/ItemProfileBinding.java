// Generated by data binding compiler. Do not edit!
package com.example.aisle.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.aisle.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemProfileBinding extends ViewDataBinding {
  @NonNull
  public final CardView cvImage;

  @NonNull
  public final AppCompatImageView ivProfile;

  @NonNull
  public final AppCompatTextView tvName;

  protected ItemProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cvImage, AppCompatImageView ivProfile, AppCompatTextView tvName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cvImage = cvImage;
    this.ivProfile = ivProfile;
    this.tvName = tvName;
  }

  @NonNull
  public static ItemProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemProfileBinding>inflateInternal(inflater, R.layout.item_profile, root, attachToRoot, component);
  }

  @NonNull
  public static ItemProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemProfileBinding>inflateInternal(inflater, R.layout.item_profile, null, false, component);
  }

  public static ItemProfileBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemProfileBinding)bind(component, view, R.layout.item_profile);
  }
}
