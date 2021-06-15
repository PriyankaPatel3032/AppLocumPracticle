package com.priyanka.patel.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\tJ\b\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/priyanka/patel/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/priyanka/kotlinstructurecorotines/Adapter/DataListAdapter;", "binding", "Lcom/priyanka/patel/databinding/ActivityMainBinding;", "dataList", "Ljava/util/ArrayList;", "Lcom/priyanka/patel/models/Data/DataResponseItem;", "Lkotlin/collections/ArrayList;", "dataListViewModel", "Lcom/priyanka/patel/mvvm/list/DataListViewModel;", "getDataListViewModel", "()Lcom/priyanka/patel/mvvm/list/DataListViewModel;", "dataListViewModel$delegate", "Lkotlin/Lazy;", "getList", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "passImageUrl", "data", "setUpObserver", "setUpUi", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.priyanka.patel.databinding.ActivityMainBinding binding;
    private java.util.ArrayList<com.priyanka.patel.models.Data.DataResponseItem> dataList;
    private final kotlin.Lazy dataListViewModel$delegate = null;
    private com.priyanka.kotlinstructurecorotines.Adapter.DataListAdapter adapter;
    private java.util.HashMap _$_findViewCache;
    
    private final com.priyanka.patel.mvvm.list.DataListViewModel getDataListViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setUpObserver() {
    }
    
    private final void getList() {
    }
    
    private final void setUpUi() {
    }
    
    public final void passImageUrl(@org.jetbrains.annotations.NotNull()
    com.priyanka.patel.models.Data.DataResponseItem data) {
    }
    
    public MainActivity() {
        super();
    }
}