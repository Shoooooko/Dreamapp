package com.example.shoko.dreamapp_girls;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Favorite_lists extends AppCompatActivity {
    CareerPass gatesPass1 = new CareerPass(18, "ハーバード大学に入学");
    CareerPass gatesPass2 = new CareerPass(20, "BASICインタプリタの完成");
    CareerPass gatesPass3 = new CareerPass(22, "大学中退後、起業");
    CareerPass gatesPass4 = new CareerPass(25, "OSのライセンス権利を獲得");
    CareerPass gatesPass5 = new CareerPass(40, "Microsoft Windows95の完成");
    CareerPass[] gatesPasses = {gatesPass1, gatesPass2, gatesPass3, gatesPass4, gatesPass5};
    Person gates = new Person(
            "ビル・ゲイツ",
            "gates.png",
            "マイクロソフトを創業、総資産810億",
            "成功は、最低の教師だ",
            63,
            "マイクロソフトの創業者兼顧問" ,
            "IT業界の覇権を握りたかったから",
            gatesPasses,
            2);

    CareerPass shimodaPass1 = new CareerPass(24, "東京大学大学院に進学");
    CareerPass shimodaPass2 = new CareerPass(28, "インド・デリー大学に留学");
    CareerPass shimodaPass3 = new CareerPass(37, "論文「大乗『涅槃経』の研究」が評価を受ける");
    CareerPass shimodaPass4 = new CareerPass(38, "東京大学文学部助教授に就任");
    CareerPass shimodaPass5 = new CareerPass(50, "東京大学文学部教授に就任");
    CareerPass[] shimodaPasses = {shimodaPass1, shimodaPass2, shimodaPass3, shimodaPass4, shimodaPass5};
    Person shimoda = new Person(
            "下田 正弘",
            "shimoda.png",
            "東京大学文学部教授、インド哲学仏教学の専門家",
            "テキストを一緒にじっくりと読む" ,
            61,
            "東京大学文学部教授（インド哲学仏教学）" ,
            "東洋と西洋の思想の違いを研究したかったから" ,
            shimodaPasses,
            2);

    CareerPass hakuiPass1 = new CareerPass(20, "東京大学文科三類に入学");
    CareerPass hakuiPass2 = new CareerPass(20, "進学振り分けで文学部社会心理学専修課程に進学");
    CareerPass hakuiPass3 = new CareerPass(22, "集英社に就職");
    CareerPass hakuiPass4 = new CareerPass(23, "小説誌「小説すばる」編集部に配属");
    CareerPass hakuiPass5 = new CareerPass(30, "文芸誌「すばる」編集部に配属");
    CareerPass[] hakuiPasses = {hakuiPass1, hakuiPass2, hakuiPass3, hakuiPass4, hakuiPass5};
    Person hakui = new Person(
            "羽喰 涼子",
            "hakui.png",
            "集英社「すばる」編集長",
            "「今」「ここ」「自分」の枠から抜け出す文学",
            43,
            "集英社「すばる」編集長" ,
            "フィクションをやりたいから",
            hakuiPasses,
            2);

    CareerPass sakataPass1 = new CareerPass(20, "東京大学文学部西洋史専修課程に進学");
    CareerPass sakataPass2 = new CareerPass(22, "国立国会図書館に入館");
    CareerPass sakataPass3 = new CareerPass(55, "国際こども図書館に就任");
    CareerPass sakataPass4 = new CareerPass(58, "調査及び立法考査局長に就任");
    CareerPass sakataPass5 = new CareerPass(59, "国立国会図書館副館長に就任");
    CareerPass[] sakataPasses = {sakataPass1, sakataPass2, sakataPass3, sakataPass4, sakataPass5};
    Person sakata = new Person(
            "坂田和光",
            "sakata.png",
            "女性初の国立国会図書館副館長",
            "「事実を示す」クールな資料提供",
            60,
            "国立国会図書館副館長" ,
            "日本の知を支えたいから",
            sakataPasses,
            1);

    CareerPass murasakiPass1 = new CareerPass(8, "父から英才教育を受ける");
    CareerPass murasakiPass2 = new CareerPass(20, "中宮彰子に出仕");
    CareerPass murasakiPass3 = new CareerPass(33, "藤原道長から『源氏物語』の執筆を依頼される");
    CareerPass murasakiPass4 = new CareerPass(38, "『紫式部日記』の完成");
    CareerPass murasakiPass5 = new CareerPass(46, "『源氏物語』の完成");
    CareerPass[] murasakiPasses = {murasakiPass1, murasakiPass2, murasakiPass3, murasakiPass4, murasakiPass5};
    Person murasaki = new Person(
            "紫式部",
            "murasaki.png",
            "『源氏物語』を執筆",
            "教養は財産",
            40,
            "中宮彰子付きの女房" ,
            "和歌、漢文、歴史の教養があったから",
            murasakiPasses,
            2);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_lists);

        // toolbarを設定
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("夢みるアプリ");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        Person[] personArray = {gates,shimoda,hakui,sakata,murasaki};
        List<Person> personList = Arrays.asList(personArray);
        // レイアウトからリストビューを取得
        ListView listView = (ListView)findViewById(R.id.list_view);

        // 出力結果をリストビューに表示
        FavoriteAdapter adapter = new FavoriteAdapter(this, R.layout.list_item_favorite, personList);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        boolean result = true;

        switch (id) {
            case android.R.id.home:
                finish();
                break;
            default:
                result = super.onOptionsItemSelected(item);
        }

        return result;
    }
}
