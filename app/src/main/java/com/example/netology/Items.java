package com.example.netology;

public class Items {
    private String title;
    private String subtitle;
    private boolean checked;
    private int image;

    public Items(String title, String subtitle, boolean checked, int image) {
        this.title = title;
        this.subtitle = subtitle;
        this.checked = checked;
        this.image = image;
    }



    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public boolean isChecked() {
        return checked;
    }

    public int getImage() {
        return image;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
