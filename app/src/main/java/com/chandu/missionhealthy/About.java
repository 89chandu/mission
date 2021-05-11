package com.chandu.missionhealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Element adsElement = new Element();
        adsElement.setTitle("Created By Chandu Bopche");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
//                .enableDarkMode(false)
                .setImage(R.drawable.aboutp)
                .setDescription("एक्यूप्रेशर चिकित्सक - शुभम गुप्ता (M.D.Acu.)\n" +
                                        "\n" +
                                        "Shubham Gupta (M.D.Acu.)\n" +
                                        "ACUPRESSURE Therapist\n" +
                                        "Naturo Therapist\n" +
                                        "Aroma Therapist\n" +
                                        "SUJOK Therapist\n" +
                                        "Professional Vedic Nutritionist \n" +
                                        "\n" +
                                        "CONTACT Us To Releted Therapies Service At Your Home\n" +
                                        "\n" +
                                        "Fee - According To Disease & Problem \n" +
                                        "Basic Consultation Fee - 50 Rupee \n" +
                                        "Acupressure & Sujok Fee - 200 \n" +
                                        "Aromatherapy Fee - 100\n" +
                                        "Vedic Nutrition Fee - 200/Month")
                .addItem(new Element().setTitle("Version 1.0"))
                .addItem(adsElement)
                .addGroup("Connect with us")
                .addEmail("acupressurebyshubham@gmail.com")
                .addWebsite("https://mehdisakout.com/")
                .addFacebook("the.medy")
                .addTwitter("medyo80")
                .addYoutube("UCn-QqRGTxmsFdhOTI3qLLzQ/featured")
                .addPlayStore("com.ideashower.readitlater.pro")
                .addInstagram("medyo80")
                .addGitHub("medyo")
                .addItem(getCopyRightsElement())
                .create();

        setContentView(aboutPage);
    }


    Element getCopyRightsElement() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.copy_right), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle("copyright 2021");
        copyRightsElement.setIconDrawable(R.drawable.copyright);
        copyRightsElement.setAutoApplyIconTint(true);
        copyRightsElement.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.CENTER);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(About.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }
}
