package com.priyanka.patel.databinding;
import com.priyanka.patel.R;
import com.priyanka.patel.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding implements com.priyanka.patel.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of LoginViewModel.EmailAddress.getValue()
            //         is LoginViewModel.EmailAddress.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etEmail);
            // localize variables for thread safety
            // LoginViewModel
            com.priyanka.patel.mvvm.LoginViewModel loginViewModel = mLoginViewModel;
            // LoginViewModel.EmailAddress != null
            boolean loginViewModelEmailAddressJavaLangObjectNull = false;
            // LoginViewModel.EmailAddress.getValue()
            java.lang.String loginViewModelEmailAddressGetValue = null;
            // LoginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // LoginViewModel.EmailAddress
            androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelEmailAddress = null;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelEmailAddress = loginViewModel.EmailAddress;

                loginViewModelEmailAddressJavaLangObjectNull = (loginViewModelEmailAddress) != (null);
                if (loginViewModelEmailAddressJavaLangObjectNull) {




                    loginViewModelEmailAddress.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of LoginViewModel.Password.getValue()
            //         is LoginViewModel.Password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPassword);
            // localize variables for thread safety
            // LoginViewModel
            com.priyanka.patel.mvvm.LoginViewModel loginViewModel = mLoginViewModel;
            // LoginViewModel.Password
            androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelPassword = null;
            // LoginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // LoginViewModel.Password.getValue()
            java.lang.String loginViewModelPasswordGetValue = null;
            // LoginViewModel.Password != null
            boolean loginViewModelPasswordJavaLangObjectNull = false;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelPassword = loginViewModel.Password;

                loginViewModelPasswordJavaLangObjectNull = (loginViewModelPassword) != (null);
                if (loginViewModelPasswordJavaLangObjectNull) {




                    loginViewModelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            );
        this.btnLogin.setTag(null);
        this.etEmail.setTag(null);
        this.etPassword.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.priyanka.patel.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.LoginViewModel == variableId) {
            setLoginViewModel((com.priyanka.patel.mvvm.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable com.priyanka.patel.mvvm.LoginViewModel LoginViewModel) {
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.LoginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginViewModelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLoginViewModelEmailAddress((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginViewModelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> LoginViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelEmailAddress(androidx.lifecycle.MutableLiveData<java.lang.String> LoginViewModelEmailAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.priyanka.patel.mvvm.LoginViewModel loginViewModel = mLoginViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelPassword = null;
        java.lang.String loginViewModelEmailAddressGetValue = null;
        java.lang.String loginViewModelPasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelEmailAddress = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (loginViewModel != null) {
                        // read LoginViewModel.Password
                        loginViewModelPassword = loginViewModel.Password;
                    }
                    updateLiveDataRegistration(0, loginViewModelPassword);


                    if (loginViewModelPassword != null) {
                        // read LoginViewModel.Password.getValue()
                        loginViewModelPasswordGetValue = loginViewModelPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (loginViewModel != null) {
                        // read LoginViewModel.EmailAddress
                        loginViewModelEmailAddress = loginViewModel.EmailAddress;
                    }
                    updateLiveDataRegistration(1, loginViewModelEmailAddress);


                    if (loginViewModelEmailAddress != null) {
                        // read LoginViewModel.EmailAddress.getValue()
                        loginViewModelEmailAddressGetValue = loginViewModelEmailAddress.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnLogin.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPasswordandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etEmail, loginViewModelEmailAddressGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPassword, loginViewModelPasswordGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // LoginViewModel
        com.priyanka.patel.mvvm.LoginViewModel loginViewModel = mLoginViewModel;
        // LoginViewModel != null
        boolean loginViewModelJavaLangObjectNull = false;



        loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
        if (loginViewModelJavaLangObjectNull) {



            loginViewModel.onClick(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): LoginViewModel.Password
        flag 1 (0x2L): LoginViewModel.EmailAddress
        flag 2 (0x3L): LoginViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}