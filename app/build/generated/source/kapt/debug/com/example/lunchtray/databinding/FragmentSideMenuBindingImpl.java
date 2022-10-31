package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSideMenuBindingImpl extends FragmentSideMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.side_options, 10);
        sViewsWithIds.put(R.id.divider, 11);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSideMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentSideMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[8]
            , (android.view.View) bindings[11]
            , (android.widget.Button) bindings[9]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RadioGroup) bindings[10]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            );
        this.cancelButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.salad.setTag(null);
        this.saladDescription.setTag(null);
        this.saladPrice.setTag(null);
        this.soup.setTag(null);
        this.soupDescription.setTag(null);
        this.soupPrice.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback4 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback3 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
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
        if (BR.SideMenuFragment == variableId) {
            setSideMenuFragment((com.example.lunchtray.ui.order.SideMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSideMenuFragment(@Nullable com.example.lunchtray.ui.order.SideMenuFragment SideMenuFragment) {
        this.mSideMenuFragment = SideMenuFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.SideMenuFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItems3day = null;
        java.lang.String viewModelMenuItems3dayDescription = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItems7day = null;
        java.lang.String viewModelMenuItems7dayDescription = null;
        java.lang.String viewModelMenuItems3dayName = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        java.lang.String viewModelMenuItems3dayGetFormattedPrice = null;
        java.lang.String viewModelSubtotalGetValue = null;
        com.example.lunchtray.ui.order.SideMenuFragment sideMenuFragment = mSideMenuFragment;
        java.lang.String viewModelMenuItems7dayGetFormattedPrice = null;
        java.lang.String viewModelMenuItems7dayName = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.subtotal
                    viewModelSubtotal = viewModel.getSubtotal();
                }
                updateLiveDataRegistration(0, viewModelSubtotal);


                if (viewModelSubtotal != null) {
                    // read viewModel.subtotal.getValue()
                    viewModelSubtotalGetValue = viewModelSubtotal.getValue();
                }


                // read @android:string/subtotal
                subtotalAndroidStringSubtotalViewModelSubtotal = subtotal.getResources().getString(R.string.subtotal, viewModelSubtotalGetValue);
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.menuItems
                        viewModelMenuItems = viewModel.getMenuItems();
                    }


                    if (viewModelMenuItems != null) {
                        // read viewModel.menuItems["3day"]
                        viewModelMenuItems3day = viewModelMenuItems.get("3day");
                        // read viewModel.menuItems["7day"]
                        viewModelMenuItems7day = viewModelMenuItems.get("7day");
                    }


                    if (viewModelMenuItems3day != null) {
                        // read viewModel.menuItems["3day"].description
                        viewModelMenuItems3dayDescription = viewModelMenuItems3day.getDescription();
                        // read viewModel.menuItems["3day"].name
                        viewModelMenuItems3dayName = viewModelMenuItems3day.getName();
                        // read viewModel.menuItems["3day"].getFormattedPrice()
                        viewModelMenuItems3dayGetFormattedPrice = viewModelMenuItems3day.getFormattedPrice();
                    }
                    if (viewModelMenuItems7day != null) {
                        // read viewModel.menuItems["7day"].description
                        viewModelMenuItems7dayDescription = viewModelMenuItems7day.getDescription();
                        // read viewModel.menuItems["7day"].getFormattedPrice()
                        viewModelMenuItems7dayGetFormattedPrice = viewModelMenuItems7day.getFormattedPrice();
                        // read viewModel.menuItems["7day"].name
                        viewModelMenuItems7dayName = viewModelMenuItems7day.getName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback5);
            this.nextButton.setOnClickListener(mCallback6);
            this.salad.setOnClickListener(mCallback3);
            this.soup.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.salad, viewModelMenuItems3dayName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.saladDescription, viewModelMenuItems3dayDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.saladPrice, viewModelMenuItems3dayGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.soup, viewModelMenuItems7dayName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.soupDescription, viewModelMenuItems7dayDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.soupPrice, viewModelMenuItems7dayGetFormattedPrice);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.subtotal.setText(subtotalAndroidStringSubtotalViewModelSubtotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // SideMenuFragment != null
                boolean sideMenuFragmentJavaLangObjectNull = false;
                // SideMenuFragment
                com.example.lunchtray.ui.order.SideMenuFragment sideMenuFragment = mSideMenuFragment;



                sideMenuFragmentJavaLangObjectNull = (sideMenuFragment) != (null);
                if (sideMenuFragmentJavaLangObjectNull) {


                    sideMenuFragment.goToNextScreen();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide("7day");
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // SideMenuFragment != null
                boolean sideMenuFragmentJavaLangObjectNull = false;
                // SideMenuFragment
                com.example.lunchtray.ui.order.SideMenuFragment sideMenuFragment = mSideMenuFragment;



                sideMenuFragmentJavaLangObjectNull = (sideMenuFragment) != (null);
                if (sideMenuFragmentJavaLangObjectNull) {


                    sideMenuFragment.cancelOrder();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide("3day");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): SideMenuFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}