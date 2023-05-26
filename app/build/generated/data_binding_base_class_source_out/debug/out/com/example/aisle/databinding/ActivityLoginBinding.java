// Generated by data binding compiler. Do not edit!
package com.example.aisle.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.aisle.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnContinue;

  @NonNull
  public final AppCompatEditText etPhoneNumber;

  @NonNull
  public final AppCompatEditText etSTDCode;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final AppCompatTextView tvEnterNumber;

  @NonNull
  public final AppCompatTextView tvGetOtp;

  protected ActivityLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnContinue, AppCompatEditText etPhoneNumber, AppCompatEditText etSTDCode,
      ProgressBar progress, AppCompatTextView tvEnterNumber, AppCompatTextView tvGetOtp) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnContinue = btnContinue;
    this.etPhoneNumber = etPhoneNumber;
    this.etSTDCode = etSTDCode;
    this.progress = progress;
    this.tvEnterNumber = tvEnterNumber;
    this.tvGetOtp = tvGetOtp;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, null, false, component);
  }

  public static ActivityLoginBinding bind(@NonNull View view) {
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
  public static ActivityLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLoginBinding)bind(component, view, R.layout.activity_login);
  }
}