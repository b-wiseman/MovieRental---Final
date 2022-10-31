package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEntreeMenuBindingImpl extends FragmentEntreeMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView6, 22);
        sViewsWithIds.put(R.id.imageView5, 23);
        sViewsWithIds.put(R.id.imageView4, 24);
        sViewsWithIds.put(R.id.imageView3, 25);
        sViewsWithIds.put(R.id.imageView, 26);
        sViewsWithIds.put(R.id.imageView2, 27);
        sViewsWithIds.put(R.id.entree_options, 28);
        sViewsWithIds.put(R.id.divider, 29);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEntreeMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private FragmentEntreeMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[20]
            , (android.widget.CheckBox) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.CheckBox) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[29]
            , (android.widget.RadioGroup) bindings[28]
            , (android.widget.CheckBox) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.Button) bindings[21]
            , (android.widget.CheckBox) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.CheckBox) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[19]
            , (android.widget.CheckBox) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            );
        this.cancelButton.setTag(null);
        this.cauliflower.setTag(null);
        this.cauliflowerDescription.setTag(null);
        this.cauliflowerPrice.setTag(null);
        this.chili.setTag(null);
        this.chiliDescription.setTag(null);
        this.chiliPrice.setTag(null);
        this.ghostbusters.setTag(null);
        this.ghostbustersDescription.setTag(null);
        this.ghostbustersPrice.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.pasta.setTag(null);
        this.pastaDescription.setTag(null);
        this.pastaPrice.setTag(null);
        this.skillet.setTag(null);
        this.skilletDescription.setTag(null);
        this.skilletPrice.setTag(null);
        this.subtotal.setTag(null);
        this.toystory.setTag(null);
        this.toystoryDescription.setTag(null);
        this.toystoryPrice.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback12 = new com.example.lunchtray.generated.callback.OnClickListener(this, 6);
        mCallback9 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback13 = new com.example.lunchtray.generated.callback.OnClickListener(this, 7);
        mCallback8 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback14 = new com.example.lunchtray.generated.callback.OnClickListener(this, 8);
        mCallback10 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback7 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
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
        if (BR.EntreeMenuFragment == variableId) {
            setEntreeMenuFragment((com.example.lunchtray.ui.order.EntreeMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEntreeMenuFragment(@Nullable com.example.lunchtray.ui.order.EntreeMenuFragment EntreeMenuFragment) {
        this.mEntreeMenuFragment = EntreeMenuFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.EntreeMenuFragment);
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
        com.example.lunchtray.model.MenuItem viewModelMenuItemsMorbius = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        java.lang.String viewModelMenuItemsUncutgemsGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsMorbiusGetFormattedPrice = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsGhostbusters = null;
        java.lang.String viewModelMenuItemsMorbiusDescription = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsUncutgems = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        java.lang.String viewModelMenuItemsMorbiusName = null;
        java.lang.String viewModelMenuItemsUncutgemsName = null;
        java.lang.String viewModelMenuItemsBullettrainDescription = null;
        java.lang.String viewModelMenuItemsBullettrainName = null;
        java.lang.String viewModelMenuItemsTopgunDescription = null;
        java.lang.String viewModelMenuItemsToystoryDescription = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsTopgun = null;
        java.lang.String viewModelMenuItemsTopgunName = null;
        java.lang.String viewModelMenuItemsBullettrainGetFormattedPrice = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsToystory = null;
        com.example.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        java.lang.String viewModelMenuItemsTopgunGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsGhostbustersDescription = null;
        java.lang.String viewModelMenuItemsToystoryName = null;
        java.lang.String viewModelSubtotalGetValue = null;
        java.lang.String viewModelMenuItemsGhostbustersGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsGhostbustersName = null;
        java.lang.String viewModelMenuItemsUncutgemsDescription = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
        java.lang.String viewModelMenuItemsToystoryGetFormattedPrice = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsBullettrain = null;

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
                        // read viewModel.menuItems["morbius"]
                        viewModelMenuItemsMorbius = viewModelMenuItems.get("morbius");
                        // read viewModel.menuItems["ghostbusters"]
                        viewModelMenuItemsGhostbusters = viewModelMenuItems.get("ghostbusters");
                        // read viewModel.menuItems["uncutgems"]
                        viewModelMenuItemsUncutgems = viewModelMenuItems.get("uncutgems");
                        // read viewModel.menuItems["topgun"]
                        viewModelMenuItemsTopgun = viewModelMenuItems.get("topgun");
                        // read viewModel.menuItems["toystory"]
                        viewModelMenuItemsToystory = viewModelMenuItems.get("toystory");
                        // read viewModel.menuItems["bullettrain"]
                        viewModelMenuItemsBullettrain = viewModelMenuItems.get("bullettrain");
                    }


                    if (viewModelMenuItemsMorbius != null) {
                        // read viewModel.menuItems["morbius"].getFormattedPrice()
                        viewModelMenuItemsMorbiusGetFormattedPrice = viewModelMenuItemsMorbius.getFormattedPrice();
                        // read viewModel.menuItems["morbius"].description
                        viewModelMenuItemsMorbiusDescription = viewModelMenuItemsMorbius.getDescription();
                        // read viewModel.menuItems["morbius"].name
                        viewModelMenuItemsMorbiusName = viewModelMenuItemsMorbius.getName();
                    }
                    if (viewModelMenuItemsGhostbusters != null) {
                        // read viewModel.menuItems["ghostbusters"].description
                        viewModelMenuItemsGhostbustersDescription = viewModelMenuItemsGhostbusters.getDescription();
                        // read viewModel.menuItems["ghostbusters"].getFormattedPrice()
                        viewModelMenuItemsGhostbustersGetFormattedPrice = viewModelMenuItemsGhostbusters.getFormattedPrice();
                        // read viewModel.menuItems["ghostbusters"].name
                        viewModelMenuItemsGhostbustersName = viewModelMenuItemsGhostbusters.getName();
                    }
                    if (viewModelMenuItemsUncutgems != null) {
                        // read viewModel.menuItems["uncutgems"].getFormattedPrice()
                        viewModelMenuItemsUncutgemsGetFormattedPrice = viewModelMenuItemsUncutgems.getFormattedPrice();
                        // read viewModel.menuItems["uncutgems"].name
                        viewModelMenuItemsUncutgemsName = viewModelMenuItemsUncutgems.getName();
                        // read viewModel.menuItems["uncutgems"].description
                        viewModelMenuItemsUncutgemsDescription = viewModelMenuItemsUncutgems.getDescription();
                    }
                    if (viewModelMenuItemsTopgun != null) {
                        // read viewModel.menuItems["topgun"].description
                        viewModelMenuItemsTopgunDescription = viewModelMenuItemsTopgun.getDescription();
                        // read viewModel.menuItems["topgun"].name
                        viewModelMenuItemsTopgunName = viewModelMenuItemsTopgun.getName();
                        // read viewModel.menuItems["topgun"].getFormattedPrice()
                        viewModelMenuItemsTopgunGetFormattedPrice = viewModelMenuItemsTopgun.getFormattedPrice();
                    }
                    if (viewModelMenuItemsToystory != null) {
                        // read viewModel.menuItems["toystory"].description
                        viewModelMenuItemsToystoryDescription = viewModelMenuItemsToystory.getDescription();
                        // read viewModel.menuItems["toystory"].name
                        viewModelMenuItemsToystoryName = viewModelMenuItemsToystory.getName();
                        // read viewModel.menuItems["toystory"].getFormattedPrice()
                        viewModelMenuItemsToystoryGetFormattedPrice = viewModelMenuItemsToystory.getFormattedPrice();
                    }
                    if (viewModelMenuItemsBullettrain != null) {
                        // read viewModel.menuItems["bullettrain"].description
                        viewModelMenuItemsBullettrainDescription = viewModelMenuItemsBullettrain.getDescription();
                        // read viewModel.menuItems["bullettrain"].name
                        viewModelMenuItemsBullettrainName = viewModelMenuItemsBullettrain.getName();
                        // read viewModel.menuItems["bullettrain"].getFormattedPrice()
                        viewModelMenuItemsBullettrainGetFormattedPrice = viewModelMenuItemsBullettrain.getFormattedPrice();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback13);
            this.cauliflower.setOnClickListener(mCallback7);
            this.chili.setOnClickListener(mCallback8);
            this.ghostbusters.setOnClickListener(mCallback12);
            this.nextButton.setOnClickListener(mCallback14);
            this.pasta.setOnClickListener(mCallback9);
            this.skillet.setOnClickListener(mCallback10);
            this.toystory.setOnClickListener(mCallback11);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflower, viewModelMenuItemsTopgunName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflowerDescription, viewModelMenuItemsTopgunDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflowerPrice, viewModelMenuItemsTopgunGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chili, viewModelMenuItemsBullettrainName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chiliDescription, viewModelMenuItemsBullettrainDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chiliPrice, viewModelMenuItemsBullettrainGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ghostbusters, viewModelMenuItemsGhostbustersName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ghostbustersDescription, viewModelMenuItemsGhostbustersDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ghostbustersPrice, viewModelMenuItemsGhostbustersGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pasta, viewModelMenuItemsUncutgemsName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pastaDescription, viewModelMenuItemsUncutgemsDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pastaPrice, viewModelMenuItemsUncutgemsGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skillet, viewModelMenuItemsMorbiusName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skilletDescription, viewModelMenuItemsMorbiusDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skilletPrice, viewModelMenuItemsMorbiusGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.toystory, viewModelMenuItemsToystoryName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.toystoryDescription, viewModelMenuItemsToystoryDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.toystoryPrice, viewModelMenuItemsToystoryGetFormattedPrice);
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
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("toystory");
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("ghostbusters");
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("uncutgems");
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // EntreeMenuFragment
                com.example.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
                // EntreeMenuFragment != null
                boolean entreeMenuFragmentJavaLangObjectNull = false;



                entreeMenuFragmentJavaLangObjectNull = (entreeMenuFragment) != (null);
                if (entreeMenuFragmentJavaLangObjectNull) {


                    entreeMenuFragment.cancelOrder();
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



                    viewModel.setEntree("bullettrain");
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // EntreeMenuFragment
                com.example.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
                // EntreeMenuFragment != null
                boolean entreeMenuFragmentJavaLangObjectNull = false;



                entreeMenuFragmentJavaLangObjectNull = (entreeMenuFragment) != (null);
                if (entreeMenuFragmentJavaLangObjectNull) {


                    entreeMenuFragment.goToNextScreen();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree("morbius");
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



                    viewModel.setEntree("topgun");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): EntreeMenuFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}