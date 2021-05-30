package com.example.flags;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class LevelActivity extends AppCompatActivity {

    private ImageView flgImgOne;
    private ImageView flgImgTwo;
    private ImageView flgImgThree;
    private Button advancedBtn;
    private EditText cNameOne;
    private EditText cNameTwo;
    private EditText cNameThree;
    private static String ansOne;
    private static String ansTwo;
    private static String ansThree;


    List<Inputs> arr = new ArrayList<>();
    private Random random_Flag;
    private static int flagOne;
    private static int flagTwo;
    private static int flagThree;
    private static int flag01;
    private static int flag02;
    private static int flag03;

    private  Button button_next;

    private int score;
    private TextView scoreCal;

    private int attempt;

    TextView t1;
    TextView t2;
    TextView t3;


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
    String[] countryName = {
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
            "Korea, Democratic People's Republic of",
            "Korea, Republic of",
            "Kuwait",
            "Cayman Islands",
            "Kazakhstan",
            "Lao People's Democratic Republic",
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
        setContentView(R.layout.activity_level);

       //set score to 0
         score=0;

        flgImgOne = findViewById(R.id.imageViewflag01);
        flgImgTwo = findViewById(R.id.imageViewflag02);
        flgImgThree = findViewById(R.id.imageViewflag03);
        cNameOne = findViewById(R.id.plainflag01);
        cNameTwo = findViewById(R.id.plainflag02);
        cNameThree = findViewById(R.id.plainflag3);
        advancedBtn = findViewById(R.id.bSubmit);
        t1=findViewById(R.id.textView311);
        t2=findViewById(R.id.textView444);
        t3=findViewById(R.id.textView5);
        button_next=findViewById(R.id.buttonN);
        scoreCal=findViewById(R.id.tvScore);

        scoreCal.setText("Score :"+score);

        cNameOne.addTextChangedListener(tt);
        cNameTwo.addTextChangedListener(tt);
        cNameThree.addTextChangedListener(tt);

        addObjArray();
        randomFlag();


        button_next.setVisibility(INVISIBLE);

            advancedBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    // public void onClick(View view) {

                    ansOne = countryName[flagOne];
                    ansTwo = countryName[flagTwo];
                    ansThree = countryName[flagThree];



                    if ((ansOne.equalsIgnoreCase(cNameOne.getText().toString()))) {

                        cNameOne.setTextColor(Color.parseColor("#22dd1f"));
                        t1.setVisibility(INVISIBLE);
                        score++;
                        scoreCal.setText("Score :"+score);


                    } else {
                        cNameOne.setTextColor(Color.parseColor("#e20909"));


}

                    if ((ansTwo.equalsIgnoreCase(cNameTwo.getText().toString()))) {
                        cNameTwo.setTextColor(Color.parseColor("#22dd1f"));
                        t2.setVisibility(INVISIBLE);
                        score++;
                        scoreCal.setText("Score :"+score);


                    } else {
                        cNameTwo.setTextColor(Color.parseColor("#e20909"));


                    }



                    if ((ansThree.equalsIgnoreCase(cNameThree.getText().toString()))) {
                        cNameThree.setTextColor(Color.parseColor("#22dd1f"));
                        t3.setVisibility(INVISIBLE);
                        score++;
                        scoreCal.setText("Score :"+score);

                    } else {
                        cNameThree.setTextColor(Color.parseColor("#e20909"));

                    }

                    //check attempts

                        attempt++;
                        if(attempt ==3){
                            advancedBtn.setVisibility(INVISIBLE);
                            button_next.setVisibility(VISIBLE);


                            //Display correct answers

                           t1.setText(ansOne);
                           t2.setText(ansTwo);
                           t3.setText(ansThree);

                            t1.setVisibility(VISIBLE);
                            t2.setVisibility(VISIBLE);
                            t3.setVisibility(VISIBLE);




                        }


                    }


            });
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                attempt =0;


                cNameOne.setTextColor(Color.parseColor("#1e1d1d"));
                cNameTwo.setTextColor(Color.parseColor("#1e1d1d"));
                cNameThree.setTextColor(Color.parseColor("#1e1d1d"));


                t1.setVisibility(INVISIBLE);
                t2.setVisibility(INVISIBLE);
                t3.setVisibility(INVISIBLE);


                button_next.setVisibility(INVISIBLE);
                advancedBtn.setVisibility(VISIBLE);


                cNameOne.setText("");
                cNameTwo.setText("");
                cNameThree.setText("");


                randomFlag();


            }
        });

}

    public void addObjArray() {
        for (int i = 0; i < new LevelActivity().Flags.length; i++) {
            arr.add(new Inputs(new LevelActivity().countryName[i], new LevelActivity().Flags[i]));
        }
    }

    public void randomFlag() {
        random_Flag = new Random();

        flagOne = random_Flag.nextInt(Flags.length);
        flag01 = Flags[flagOne];
        flgImgOne.setImageResource(flag01);

        flagTwo = random_Flag.nextInt(Flags.length);
        flag02 = Flags[flagTwo];
        flgImgTwo.setImageResource(flag02);

        flagThree = random_Flag.nextInt(Flags.length);
        flag03 = Flags[flagThree];
        flgImgThree.setImageResource(flag03);


    }

    TextWatcher tt=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            cNameOne.setTextColor(Color.parseColor("#000000"));
            cNameTwo.setTextColor(Color.parseColor("#000000"));
            cNameThree.setTextColor(Color.parseColor("#000000"));

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

}