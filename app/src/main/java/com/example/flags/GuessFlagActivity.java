package com.example.flags;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GuessFlagActivity extends AppCompatActivity  {

    private ImageButton imgBtn01;
    private ImageButton imgBtn02;
    private ImageButton imgBtn03;
    private TextView c_Name;
    private Button btnSub;
    List<Inputs> arr02 = new ArrayList<>();

    private Random randomFlag;

    private static int flag01;
    private static int flag02;
    private static int flag03;
    private static int var01;
    private static int var02;
    private static int var03;
    private static int var04;
    private static int var05;
    private static int var06;


    Integer[] Flags = {
            R.drawable.ad,
            R.drawable.ae,
            R.drawable.af,
            R.drawable.ag,
            R.drawable.ai,
            R.drawable.al,
            R.drawable.am,
            R.drawable.an,
            R.drawable.ao,
            R.drawable.aq,
            R.drawable.ar,
            R.drawable.as,
            R.drawable.at,
            R.drawable.au,
            R.drawable.aw,
            R.drawable.ax,
            R.drawable.az,
            R.drawable.ba,
            R.drawable.bb,
            R.drawable.bd,
            R.drawable.be,
            R.drawable.bf,
            R.drawable.bg,
            R.drawable.bh,
            R.drawable.bi,
            R.drawable.bj,
            R.drawable.bl,
            R.drawable.bm,
            R.drawable.bn,
            R.drawable.bo,
            R.drawable.bq,
            R.drawable.br,
            R.drawable.bs,
            R.drawable.bt,
            R.drawable.bv,
            R.drawable.bw,
            R.drawable.by,
            R.drawable.bz,
            R.drawable.ca,
            R.drawable.cc,
            R.drawable.cd,
            R.drawable.cf,
            R.drawable.cg,
            R.drawable.ch,
            R.drawable.ci,
            R.drawable.ck,
            R.drawable.cl,
            R.drawable.cm,
            R.drawable.cn,
            R.drawable.co,
            R.drawable.cr,
            R.drawable.cu,
            R.drawable.cv,
            R.drawable.cw,
            R.drawable.cx,
            R.drawable.cy,
            R.drawable.cz,
            R.drawable.de,
            R.drawable.dj,
            R.drawable.dk,
            R.drawable.dm,
            R.drawable.dpp,
            R.drawable.dz,
            R.drawable.ec,
            R.drawable.ee,
            R.drawable.eg,
            R.drawable.eh,
            R.drawable.er,
            R.drawable.es,
            R.drawable.et,
            R.drawable.eu,
            R.drawable.fi,
            R.drawable.fj,
            R.drawable.fk,
            R.drawable.fm,
            R.drawable.fo,
            R.drawable.fr,
            R.drawable.ga,
            R.drawable.gbeng,
            R.drawable.gbnir,
            R.drawable.gbsct,
            R.drawable.gbwls,
            R.drawable.gb,
            R.drawable.gd,
            R.drawable.ge,
            R.drawable.gf,
            R.drawable.gg,
            R.drawable.gh,
            R.drawable.gi,
            R.drawable.gl,
            R.drawable.gm,
            R.drawable.gn,
            R.drawable.gp,
            R.drawable.gq,
            R.drawable.gr,
            R.drawable.gs,
            R.drawable.gt,
            R.drawable.gu,
            R.drawable.gw,
            R.drawable.gy,
            R.drawable.hk,
            R.drawable.hm,
            R.drawable.hn,
            R.drawable.hr,
            R.drawable.ht,
            R.drawable.hu,
            R.drawable.id,
            R.drawable.ie,
            R.drawable.il,
            R.drawable.im,
            R.drawable.in,
            R.drawable.io,
            R.drawable.iq,
            R.drawable.ir,
            R.drawable.is,
            R.drawable.it,
            R.drawable.je,
            R.drawable.jm,
            R.drawable.jo,
            R.drawable.jp,
            R.drawable.ke,
            R.drawable.kg,
            R.drawable.kh,
            R.drawable.ki,
            R.drawable.km,
            R.drawable.kn,
            R.drawable.kp,
            R.drawable.kr,
            R.drawable.kw,
            R.drawable.ky,
            R.drawable.kz,
            R.drawable.la,
            R.drawable.lb,
            R.drawable.lc,
            R.drawable.li,
            R.drawable.lk,
            R.drawable.lr,
            R.drawable.ls,
            R.drawable.lt,
            R.drawable.lu,
            R.drawable.lv,
            R.drawable.ly,
            R.drawable.ma,
            R.drawable.mc,
            R.drawable.md,
            R.drawable.me,
            R.drawable.mf,
            R.drawable.mg,
            R.drawable.mh,
            R.drawable.mk,
            R.drawable.ml,
            R.drawable.mm,
            R.drawable.mn,
            R.drawable.mo,
            R.drawable.mp,
            R.drawable.mq,
            R.drawable.mr,
            R.drawable.ms,
            R.drawable.mt,
            R.drawable.mu,
            R.drawable.mv,
            R.drawable.mw,
            R.drawable.mx,
            R.drawable.my,
            R.drawable.mz,
            R.drawable.na,
            R.drawable.nc,
            R.drawable.ne,
            R.drawable.nf,
            R.drawable.ng,
            R.drawable.ni,
            R.drawable.nl,
            R.drawable.no,
            R.drawable.np,
            R.drawable.nr,
            R.drawable.nu,
            R.drawable.nz,
            R.drawable.om,
            R.drawable.pa,
            R.drawable.pe,
            R.drawable.pf,
            R.drawable.pg,
            R.drawable.ph,
            R.drawable.pk,
            R.drawable.pl,
            R.drawable.pm,
            R.drawable.pn,
            R.drawable.pr,
            R.drawable.ps,
            R.drawable.pt,
            R.drawable.pw,
            R.drawable.py,
            R.drawable.qa,
            R.drawable.re,
            R.drawable.ro,
            R.drawable.rs,
            R.drawable.ru,
            R.drawable.rw,
            R.drawable.sa,
            R.drawable.sb,
            R.drawable.sc,
            R.drawable.sd,
            R.drawable.se,
            R.drawable.sg,
            R.drawable.sh,
            R.drawable.si,
            R.drawable.sj,
            R.drawable.sk,
            R.drawable.sl,
            R.drawable.sm,
            R.drawable.sn,
            R.drawable.so,
            R.drawable.sr,
            R.drawable.ss,
            R.drawable.st,
            R.drawable.sv,
            R.drawable.sx,
            R.drawable.sy,
            R.drawable.sz,
            R.drawable.tc,
            R.drawable.td,
            R.drawable.tf,
            R.drawable.tg,
            R.drawable.th,
            R.drawable.tj,
            R.drawable.tk,
            R.drawable.tl,
            R.drawable.tm,
            R.drawable.tn,
            R.drawable.to,
            R.drawable.tr,
            R.drawable.tt,
            R.drawable.tv,
            R.drawable.tw,
            R.drawable.tz,
            R.drawable.ua,
            R.drawable.ug,
            R.drawable.um,
            R.drawable.us,
            R.drawable.uy,
            R.drawable.uz,
            R.drawable.va,
            R.drawable.vc,
            R.drawable.ve,
            R.drawable.vg,
            R.drawable.vi,
            R.drawable.vn,
            R.drawable.vu,
            R.drawable.wf,
            R.drawable.ws,
            R.drawable.xk,
            R.drawable.ye,
            R.drawable.yt,
            R.drawable.za,
            R.drawable.zm,
            R.drawable.zw,
            };

    String[] countryName = new String[]{
            "Andorra",
            "United Arab Emirates",
            "Afghanistan",
            "Antigua and Barbuda",
            "Anguilla",
            "Albania",
            "Armenia",
            "Netherlands Antilles",
            "Angola",
            "Antarctica",
            "Argentina",
            "American Samoa",
            "Austria",
            "Australia",
            "Aruba",
            "land Islands",
            "Azerbaijan",
            "Bosnia and Herzegovina",
            "Barbados",
            "Bangladesh",
            "Belgium",
            "Burkina Faso",
            "Bulgaria",
            "Bahrain",
            "Burundi",
            "Benin",
            "Saint Barthélemy",
            "Bermuda",
            "Brunei Darussalam",
            "Bolivia, Plurinational State of",
            "Caribbean Netherlands",
            "Brazil",
            "Bahamas",
            "Bhutan",
            "Bouvet Island",
            "Botswana",
            "Belarus",
            "Belize",
            "Canada",
            "Cocos (Keeling) Islands",
            "Congo, the Democratic Republic of the",
            "Central African Republic",
            "Congo",
            "Switzerland",
            "C\u00f4te d'Ivoire",
            "Cook Islands",
            "Chile",
            "Cameroon",
            "China",
            "Colombia",
            "Costa Rica",
            "Cuba",
            "Cape Verde",
            "Cura\u00e7ao",
            "Christmas Island",
            "Cyprus",
            "Czech Republic",
            "Germany",
            "Djibouti",
            "Denmark",
            "Dominica",
            "Dominican Republic",
            "Algeria",
            "Ecuador",
            "Estonia",
            "Egypt",
            "Western Sahara",
            "Eritrea",
            "Spain",
            "Ethiopia",
            "Europe",
            "Finland",
            "Fiji",
            "Falkland Islands (Malvinas)",
            "Micronesia, Federated States of",
            "Faroe Islands",
            "France",
            "Gabon",
            "England",
            "Northern Ireland",
            "Scotland",
            "Wales",
            "United Kingdom",
            "Grenada",
            "Georgia",
            "French Guiana",
            "Guernsey",
            "Ghana",
            "Gibraltar",
            "Greenland",
            "Gambia",
            "Guinea",
            "Guadeloupe",
            "Equatorial Guinea",
            "Greece",
            "South Georgia and the South Sandwich Islands",
            "Guatemala",
            "Guam",
            "Guinea-Bissau",
            "Guyana",
            "Hong Kong",
            "Heard Island and McDonald Islands",
            "Honduras",
            "Croatia",
            "Haiti",
            "Hungary",
            "Indonesia",
            "Ireland",
            "Israel",
            "Isle of Man",
            "India",
            "British Indian Ocean Territory",
            "Iraq",
            "Iran, Islamic Republic of",
            "Iceland",
            "Italy",
            "Jersey",
            "Jamaica",
            "Jordan",
            "Japan",
            "Kenya",
            "Kyrgyzstan",
            "Cambodia",
            "Kiribati",
            "Comoros",
            "Saint Kitts and Nevis",
            "Korea, Democratic People'var04 Republic of",
            "Korea, Republic of",
            "Kuwait",
            "Cayman Islands",
            "Kazakhstan",
            "Lao People'var04 Democratic Republic",
            "Lebanon",
            "Saint Lucia",
            "Liechtenstein",
            "Sri Lanka",
            "Liberia",
            "Lesotho",
            "Lithuania",
            "Luxembourg",
            "Latvia",
            "Libya",
            "Morocco",
            "Monaco",
            "Moldova, Republic of",
            "Montenegro",
            "Saint Martin",
            "Madagascar",
            "Marshall Islands",
            "Macedonia, the former Yugoslav Republic of",
            "Mali",
            "Myanmar",
            "Mongolia",
            "Macao",
            "Northern Mariana Islands",
            "Martinique",
            "Mauritania",
            "Montserrat",
            "Malta",
            "Mauritius",
            "Maldives",
            "Malawi",
            "Mexico",
            "Malaysia",
            "Mozambique",
            "Namibia",
            "New Caledonia",
            "Niger",
            "Norfolk Island",
            "Nigeria",
            "Nicaragua",
            "Netherlands",
            "Norway",
            "Nepal",
            "Nauru",
            "Niue",
            "New Zealand",
            "Oman",
            "Panama",
            "Peru",
            "French Polynesia",
            "Papua New Guinea",
            "Philippines",
            "Pakistan",
            "Poland",
            "Saint Pierre and Miquelon",
            "Pitcairn",
            "Puerto Rico",
            "Palestine",
            "Portugal",
            "Palau",
            "Paraguay",
            "Qatar",
            "Réunion",
            "Romania",
            "Serbia",
            "Russian Federation",
            "Rwanda",
            "Saudi Arabia",
            "Solomon Islands",
            "Seychelles",
            "Sudan",
            "Sweden",
            "Singapore",
            "Saint Helena, Ascension and Tristan da Cunha",
            "Slovenia",
            "Svalbard and Jan Mayen Islands",
            "Slovakia",
            "Sierra Leone",
            "San Marino",
            "Senegal",
            "Somalia",
            "Suriname",
            "South Sudan",
            "Sao Tome and Principe",
            "El Salvador",
            "Sint Maarten (Dutch part)",
            "Syrian Arab Republic",
            "Swaziland",
            "Turks and Caicos Islands",
            "Chad",
            "French Southern Territories",
            "Togo",
            "Thailand",
            "Tajikistan",
            "Tokelau",
            "Timor-Leste",
            "Turkmenistan",
            "Tunisia",
            "Tonga",
            "Turkey",
            "Trinidad and Tobago",
            "Tuvalu",
            "Taiwan",
            "Tanzania, United Republic of",
            "Ukraine",
            "Uganda",
            "US Minor Outlying Islands",
            "United States",
            "Uruguay",
            "Uzbekistan",
            "Holy See (Vatican City State)",
            "Saint Vincent and the Grenadines",
            "Venezuela, Bolivarian Republic of",
            "Virgin Islands, British",
            "Virgin Islands, U.S.",
            "Viet Nam",
            "Vanuatu",
            "Wallis and Futuna Islands",
            "Kosovo",
            "Samoa",
            "Yemen",
            "Mayotte",
            "South Africa",
            "Zambia",
            "Zimbabwe"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_flag);

        imgBtn01 = findViewById(R.id.imageBtn01);
        imgBtn02 = findViewById(R.id.imagebtn2);
        imgBtn03 = findViewById(R.id.imageBtn3);
        c_Name = findViewById(R.id.cName);
        btnSub= findViewById(R.id.buttonNext);

        addObjArray();
        flagRandom();

        //onclick method for submit button
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagRandom();
            }
        });


    }


    public void imageButton01(View view) {
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        TextView txtview = new TextView(GuessFlagActivity.this);
        txtview.setTextColor(Color.BLACK);
        txtview.setTextSize(36);

        if(imgBtn01.getTag().toString().equals("Correct")){
            txtview.setBackgroundColor(Color.GREEN);
            txtview.setText("Correct");
            toast.setView(txtview);
            toast.show();
        }else{
            txtview.setBackgroundColor(Color.RED);
            txtview.setText("Wrong"+imgBtn01.getTag());
            toast.setView(txtview);
            toast.show();
        }



    }



    public void imageButton02(View view) {

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        TextView txtview = new TextView(GuessFlagActivity.this);
        txtview.setTextColor(Color.BLACK);
        txtview.setTextSize(36);


        if((imgBtn02.getTag().toString().equals("Correct"))){
            txtview.setBackgroundColor(Color.GREEN);
            txtview.setText("Correct");
            toast.setView(txtview);
            toast.show();
        }else{
            txtview.setBackgroundColor(Color.RED);
            txtview.setText("Wrong"+imgBtn02.getTag());
            toast.setView(txtview);
            toast.show();
        }
    }

    public void imageButton03(View view) {
        Toast txt = new Toast(getApplicationContext());
        txt.setGravity(Gravity.CENTER, 0, 0);
        TextView txtview = new TextView(GuessFlagActivity.this);
        txtview.setTextColor(Color.BLACK);
        txtview.setTextSize(35);


        if((imgBtn03.getTag().toString().equals("Correct"))){
            txtview.setBackgroundColor(Color.GREEN);
            txtview.setText("Correct");
            txt.setView(txtview);
            txt.show();
        }else{
            txtview.setBackgroundColor(Color.RED);
            txtview.setText("Wrong"+imgBtn03.getTag());
            txt.setView(txtview);
            txt.show();
        }
    }


//display flags randomly
    public void flagRandom() {
        randomFlag = new Random();

        flag01 = randomFlag.nextInt(countryName.length);
        var04 = Flags[flag01];

        flag02 = randomFlag.nextInt(countryName.length);
        var05 = Flags[flag02];

        flag03 = randomFlag.nextInt(countryName.length);
        var06 = Flags[flag03];

        c_Name.setText(countryName[flag01]);

        //avoid the duplication of the flags

        List<Integer> flagShuffel = new ArrayList<>();
        flagShuffel.add(var04);
        flagShuffel.add(var05);
        flagShuffel.add(var06);

        Collections.shuffle(flagShuffel);
        var01 = flagShuffel.get(0);
        var02 = flagShuffel.get(1);
        var03 = flagShuffel.get(2);

        imgBtn01.setImageResource(var01);
        imgBtn01.setTag("");

        imgBtn02.setImageResource(var02);
        imgBtn02.setTag("");

        imgBtn03.setImageResource(var03);
        imgBtn03.setTag("");

        //check correct answer
        if( var04==var01 ) imgBtn01.setTag("Correct");
        if( var04==var02 ) imgBtn02.setTag("Correct");
        if( var04==var03 ) imgBtn03.setTag("Correct");


    }

    //    Adding the country name and image to one array

    public void addObjArray() {
        for (int i = 0; i < new GuessFlagActivity().Flags.length; i++) {
            arr02.add(new Inputs(new GuessFlagActivity().countryName[i], new GuessFlagActivity().Flags[i]));
        }

    }
}