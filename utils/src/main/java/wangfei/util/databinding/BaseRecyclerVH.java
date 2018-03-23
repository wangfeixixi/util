package wangfei.util.databinding;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import wangfei.util.fragmentation.BaseFragment;

public class BaseRecyclerVH extends RecyclerView.ViewHolder {

    private ViewDataBinding binding;
    protected Context mCtx;

    public BaseRecyclerVH(ViewDataBinding binding, Context ctx) {
        super(binding.getRoot());
        this.binding = binding;
        mCtx = ctx;
    }

    public List mList;
    public int position;

    public void initDatas(List list, int position) {
        mList = list;
        this.position = position;
    }

    public ViewDataBinding getBinding() {
        return binding;
    }
}
