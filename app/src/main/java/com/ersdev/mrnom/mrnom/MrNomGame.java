package com.ersdev.mrnom.mrnom;


        import android.app.Activity;

        import com.ersdev.mrnom.framework.Screen;
        import com.ersdev.mrnom.framework.impl.AndroidGame;
        import com.ersdev.mrnom.mrnom.LoadingScreen;

public class MrNomGame extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this);
    }
}