package ua.opu.contactlist;

import android.net.Uri;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Random;

@Entity(tableName = "contacts")
public class Contact {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String email;
    private String phone;
    private String uri;

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

    @Ignore
    public Contact(String name, String email, String phone, String uri) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.uri = uri;
    }

    @Ignore
    public Contact() {
    }

    public Contact(int id, String name, String email, String phone, String uri) {
        this.id = id;
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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
