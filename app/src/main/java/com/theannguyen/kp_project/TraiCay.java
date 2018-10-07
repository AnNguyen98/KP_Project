package com.theannguyen.kp_project;

import android.widget.TextView;

public class TraiCay {
    int imageTraiCay;
    String   textMoTa,textName;

    public TraiCay(int imageTraiCay, String textMoTa, String textName) {
        this.imageTraiCay = imageTraiCay;
        this.textMoTa = textMoTa;
        this.textName = textName;
    }

    public int getImageTraiCay() {
        return imageTraiCay;
    }

    public void setImageTraiCay(int imageTraiCay) {
        this.imageTraiCay = imageTraiCay;
    }

    public String getTextMoTa() {
        return textMoTa;
    }

    public void setTextMoTa(String textMoTa) {
        this.textMoTa = textMoTa;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }
}
