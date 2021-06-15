package com.priyanka.kotlinstructurecorotines.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/priyanka/kotlinstructurecorotines/Adapter/DataListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/priyanka/kotlinstructurecorotines/Adapter/DataListAdapter$DataViewHolder;", "lists", "Ljava/util/ArrayList;", "Lcom/priyanka/patel/models/Data/DataResponseItem;", "Lkotlin/collections/ArrayList;", "activity", "Lcom/priyanka/patel/activities/MainActivity;", "(Ljava/util/ArrayList;Lcom/priyanka/patel/activities/MainActivity;)V", "addUsers", "", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DataViewHolder", "app_debug"})
public final class DataListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.priyanka.kotlinstructurecorotines.Adapter.DataListAdapter.DataViewHolder> {
    private final java.util.ArrayList<com.priyanka.patel.models.Data.DataResponseItem> lists = null;
    private com.priyanka.patel.activities.MainActivity activity;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.priyanka.kotlinstructurecorotines.Adapter.DataListAdapter.DataViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.priyanka.kotlinstructurecorotines.Adapter.DataListAdapter.DataViewHolder holder, int position) {
    }
    
    public final void addUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.priyanka.patel.models.Data.DataResponseItem> list) {
    }
    
    public DataListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.priyanka.patel.models.Data.DataResponseItem> lists, @org.jetbrains.annotations.NotNull()
    com.priyanka.patel.activities.MainActivity activity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/priyanka/kotlinstructurecorotines/Adapter/DataListAdapter$DataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "data", "Lcom/priyanka/patel/models/Data/DataResponseItem;", "activity", "Lcom/priyanka/patel/activities/MainActivity;", "app_debug"})
    public static final class DataViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.priyanka.patel.models.Data.DataResponseItem data, @org.jetbrains.annotations.NotNull()
        com.priyanka.patel.activities.MainActivity activity) {
        }
        
        public DataViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}