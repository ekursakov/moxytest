package com.example.moxytest;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {
    @Override
    protected void onFirstViewAttach() {
        getViewState().doSomething();
    }
}
