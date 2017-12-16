package com.example.pinarmnkl.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText sayi1,sayi2;
    TextView sonuc;
    Button topla,cikar,carp,bol,temizle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sayi1 =(EditText)findViewById(R.id.et_birinciSayi);
        sayi2=(EditText)findViewById(R.id.et_ikinciSayi);
        sonuc=(TextView) findViewById(R.id.tv_sonuc);
        topla=(Button)findViewById(R.id.btn_topla);
        cikar=(Button)findViewById(R.id.btn_cikar);
        carp=(Button)findViewById(R.id.btn_carp);
        bol=(Button)findViewById(R.id.btn_bol);
        temizle=(Button)findViewById(R.id.btn_temizle);

//Burada da nesnelerimizi tanımlıyoruz ben et_birinciSayi,btn_topla gibi id verdim.

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//toplama işlemi butonumuza setOnclickListener oluşturup aşağıdaki kodları yazıyoruz.
//ondalıklı sonuç da alacabileceğimiz için double kullandık.

                double sayibir=Double.parseDouble(sayi1.getText().toString()); //Sayı 1  değeri getText ile alıp Double çevriliyor ve sayibir e yollanıyor.
                double sayiiki=Double.parseDouble(sayi2.getText().toString());//Sayı 2 değeri getText ile alıp Double çevriliyor ve sayiiki e yollanıyor.

                sonuc.setText(String.valueOf(sayibir+sayiiki)); //sayibir ile sayiiki toplamış olup sonuca yansıttık.
            }
        });

//Toplama işleminde gerçekleştirdiğimiz işlemi aynı şekilde diğer işlemlerimiz için de yapıyoruz değişen sadece sonuc.setText(String.valueOf(sayibir+sayiiki)); kodumuz daki (sayibir+sayiiki)); bu kısımdır. “+” değilde “-” de olabilir.”/” veya “*” gibi.

        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double sayibir=Double.parseDouble(sayi1.getText().toString());
                double sayiiki=Double.parseDouble(sayi2.getText().toString());

                sonuc.setText(String.valueOf(sayibir-sayiiki));
            }
        });

        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double sayibir=Double.parseDouble(sayi1.getText().toString());
                double sayiiki=Double.parseDouble(sayi2.getText().toString());

                sonuc.setText(String.valueOf(sayibir*sayiiki));
            }
        });

        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double sayibir=Double.parseDouble(sayi1.getText().toString());
                double sayiiki=Double.parseDouble(sayi2.getText().toString());

                sonuc.setText(String.valueOf(sayibir/sayiiki));
            }
        });

//temizle butonuna da aşağıdaki kodlarımızı yazıp sayi1,sayi2 ve sonuc kısımlarını temizleyip yeniden hesaplama yapabiliyoruz.

        temizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sayi1.setText("");
                sayi2.setText("");
                sonuc.setText("");
            }
        });

    }

}
