package com.master.info_ua.videoannottool.annotation;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.master.info_ua.videoannottool.MainActivity;
import com.master.info_ua.videoannottool.R;

import static android.graphics.Color.WHITE;

/**
 * Classe gerant l'afffichage des annotations textuelles
 */
public class ViewText {
    LinearLayout llAnnot;
    FrameLayout frameLayout;

    /**
     * Constructeur de la classe
     * Initialise et affiche l'annotation
     * @param main
     * @param texte texte à afficher
     */
    public ViewText(final MainActivity main, String texte){
        frameLayout=main.findViewById(R.id.main_media_frame);
        llAnnot= new LinearLayout(main);
        TextView tvAnnot = new TextView(main);



        llAnnot.setOrientation(LinearLayout.HORIZONTAL);
        llAnnot.setGravity(Gravity.CENTER);
        if (texte!="") {
            tvAnnot.setText(texte);


        }
        tvAnnot.setTextColor(WHITE);
        tvAnnot.setTextSize(20);

        llAnnot.addView(tvAnnot);
        frameLayout.addView(llAnnot);
        Log.i("VIEW_TEXT-ANNOT","ANnotation affichée");



    }

    /**
     * efface l'annotation affichée
     * @param main
     */
    public void effaceAnnotText(MainActivity main){
        llAnnot.setVisibility(View.GONE);
        Log.i ("VIEW_TEXT-ANNOT","Annotation effacée");

    }

}

