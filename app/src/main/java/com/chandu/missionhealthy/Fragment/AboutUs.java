package com.chandu.missionhealthy.Fragment;
//
////import android.os.Bundle;
////import android.view.LayoutInflater;
////import android.view.View;
////import android.view.ViewGroup;
////
////import androidx.appcompat.app.AppCompatActivity;
////
////import android.annotation.SuppressLint;
////import android.os.Bundle;
//////import android.provider.CalendarContract;
////import android.view.Gravity;
////import android.view.View;
////import android.widget.Toast;
////
////import java.util.Calendar;
////
////import mehdi.sakout.aboutpage.AboutPage;
////import mehdi.sakout.aboutpage.Element;
////
////import androidx.fragment.app.Fragment;
////
////
//////public class AboutUs extends Fragment {
//////
//////    // TODO: Rename parameter arguments, choose names that match
//////    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//////    private static final String ARG_PARAM1 = "param1";
//////    private static final String ARG_PARAM2 = "param2";
//////
//////    // TODO: Rename and change types of parameters
//////    private String mParam1;
//////    private String mParam2;
//////
//////    public AboutUs() {
//////        // Required empty public constructor
//////    }
//////
//////    /**
//////     * Use this factory method to create a new instance of
//////     * this fragment using the provided parameters.
//////     *
//////     * @param param1 Parameter 1.
//////     * @param param2 Parameter 2.
//////     * @return A new instance of fragment FoxNewsFragment.
//////     */
//////    // TODO: Rename and change types and number of parameters
//////    public static AboutUs newInstance(String param1, String param2) {
//////        AboutUs fragment = new AboutUs();
//////        Bundle args = new Bundle();
//////        args.putString(ARG_PARAM1, param1);
//////        args.putString(ARG_PARAM2, param2);
//////        fragment.setArguments(args);
//////        return fragment;
//////    }
//////
//////    @Override
//////    public void onCreate(Bundle savedInstanceState) {
//////        super.onCreate(savedInstanceState);
//////        if (getArguments() != null) {
//////            mParam1 = getArguments().getString(ARG_PARAM1);
//////            mParam2 = getArguments().getString(ARG_PARAM2);
//////        }
//////    }
////
//////    @Override
//////    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//////                             Bundle savedInstanceState)
//////
//////
////        // Inflate the layout for this fragment
////
//////        Element adsElement = new Element();
//////        View aboutPage = new AboutPage(this)
//////                .isRTL(false)
//////                .setDescription(" Add descrition about your app")
//////                .addItem(new Element().setTitle("Version 1.0"))
//////                .addGroup("CONNECT WITH US!")
//////                .addEmail("Your mail id ")
//////                .addWebsite("Your website/")
//////                .addYoutube("UCbekhhidkzkGryM7mi5Ys_w")   //Enter your youtube link here (replace with my channel link)
//////                .addPlayStore("com.example.yourprojectname")   //Replace all this with your package name
//////                .addInstagram("jarves.usaram")    //Your instagram id
//////                .addItem(createCopyright())
//////                .create();
//////                return (aboutPage);
//////    }
//////    private Element createCopyright()
//////    {
//////        Element copyright = new Element();
//////        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d by Your Name", Calendar.getInstance().get(Calendar.YEAR));
//////        copyright.setTitle(copyrightString);
//////        // copyright.setIcon(R.mipmap.ic_launcher);
//////        copyright.setGravity(Gravity.CENTER);
//////        copyright.setOnClickListener(new View.OnClickListener() {
//////            @Override
//////            public void onClick(View v) {
//////                Toast.makeText(AboutUs.this,copyrightString,Toast.LENGTH_SHORT).show();
//////            }
//////        });
//////        return copyright;
//////    }
//////}
////
////
////
//import android.os.Bundle;
//import android.view.Gravity;
//import android.view.View;
//import android.widget.Toast;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//
//import com.chandu.missionhealthy.R;
//
//import java.util.Calendar;
//import mehdi.sakout.aboutpage.AboutPage;
//import mehdi.sakout.aboutpage.Element;
//
//public class AboutUs extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        Element adsElement = new Element();
//        adsElement.setTitle("Advertise with us");
//
//        View aboutPage = new AboutPage(this)
//                .isRTL(false)
////                .enableDarkMode(false)
//                .setImage(R.drawable.logo)
//                .addItem(new Element().setTitle("Version 6.2"))
//                .addItem(adsElement)
//                .addGroup("Connect with us")
//                .addEmail("elmehdi.sakout@gmail.com")
//                .addWebsite("https://mehdisakout.com/")
//                .addFacebook("the.medy")
//                .addTwitter("medyo80")
//                .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
//                .addPlayStore("com.ideashower.readitlater.pro")
//                .addInstagram("medyo80")
//                .addGitHub("medyo")
//                .addItem(getCopyRightsElement())
//                .create();
//
//        setContentView(aboutPage);
//    }
//
//
//    Element getCopyRightsElement() {
//        Element copyRightsElement = new Element();
//        final String copyrights = String.format(getString(R.string.copy_right),Calendar.getInstance().get(Calendar.YEAR));
//        copyRightsElement.setTitle(copyrights);
//        copyRightsElement.setIconDrawable(R.drawable.logo);
//        copyRightsElement.setAutoApplyIconTint(true);
//        copyRightsElement.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color);
//        copyRightsElement.setIconNightTint(android.R.color.white);
//        copyRightsElement.setGravity(Gravity.CENTER);
//        copyRightsElement.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(AboutUs.this, copyrights, Toast.LENGTH_SHORT).show();
//            }
//        });
//        return copyRightsElement;
//    }
//}
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;
//import androidx..app.Fra;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
//import androidx.fragment.app.FragmentActivity;

import com.chandu.missionhealthy.R;

import java.util.Calendar;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutUs extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Element adsElement = new Element();
        adsElement.setTitle("Advertise with us");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
//                .enableDarkMode(false)
                .setImage(R.drawable.logo)
                .addItem(new Element().setTitle("Version 6.2"))
                .addItem(adsElement)
                .addGroup("Connect with us")
                .addEmail("elmehdi.sakout@gmail.com")
                .addWebsite("https://mehdisakout.com/")
                .addFacebook("the.medy")
                .addTwitter("medyo80")
                .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
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
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.logo);
        copyRightsElement.setAutoApplyIconTint(true);
        copyRightsElement.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.CENTER);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutUs.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }
}



