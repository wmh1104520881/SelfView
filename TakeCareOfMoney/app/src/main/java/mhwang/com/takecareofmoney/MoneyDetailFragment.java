package mhwang.com.takecareofmoney;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 项目名称：
 * 类描述：
 * 作者：王明海
 * 创建时间：2016/4/7
 */
public class MoneyDetailFragment {

    private View mView;
    public MoneyDetailFragment(Context context){
        mView = LayoutInflater.from(context).inflate(R.layout.fragment_money_detail, null);
    }

    public View getView(){
        return mView;
    }
}
