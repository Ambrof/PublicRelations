package com.npa.publicrelations;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

public class ListClick extends Button {

    /**
     * Costruttore di default, inizializza il bottone in base ad un contesto e ad un insieme di attributi.
     * @param context Contesto.
     * @param attrs Attributi della vista.
     */
    public ListClick(Context context, AttributeSet attrs) {
            super(context, attrs);
            //Rendo forzatamente il bottone non selezionabile.
            this.setFocusable(false);
    }

    /**
     * Imposta lo stato di pressione del bottone.
     * @param pressed Stato di pressione del bottone.
     */
    @Override
public void setPressed(boolean pressed) {
        //Se il contenitore del bottone è premuto, allora non imposto anche il bottone a premuto
        if (pressed && ((View) getParent()).isPressed()) {
                return;
        }
        //Se il contenitore non è premuto, allora è stato toccato il bottone. Procedo normalmente.
        super.setPressed(pressed);
}
}