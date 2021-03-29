package ua.opu.contactlist;

import android.net.Uri;

import java.util.Random;

public class Contact {

    private String name;
    private String email;
    private String phone;
    private Uri uri;

    public static Contact generateContact() {
        Random random = new Random();
        String name;
        String email = Math.abs(random.nextLong()) + "@gmail.com";
        String phone = "+38063" + Math.abs(random.nextLong()) % 10000000;
        switch (random.nextInt(10)) {
            case 0:
                name = "Вася";
                break;
            case 1:
                name = "Петя";
                break;
            case 3:
                name = "Маша";
                break;
            case 4:
                name = "Женя";
                break;
            case 5:
                name = "Люда";
                break;
            case 6:
                name = "Миша";
                break;
            case 7:
                name = "Света";
                break;
            case 8:
                name = "Ваня";
                break;
            case 9:
                name = "Настя";
                break;
            default:
                name = "Наташа";
        }
        return new Contact(name, email, phone, null);
    }

    public Contact(String name, String email, String phone, Uri uri) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }
}
