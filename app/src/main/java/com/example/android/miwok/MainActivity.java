/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
//        Find numbers view id and store in numbers.
        TextView numbers = (TextView) findViewById(R.id.numbers);
//        Set onclickListerner onto numbers object.
        numbers.setOnClickListener(new View.OnClickListener() {
//            Method that is carried out when onclickListener is activated on the numbers Textview.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, NumbersActivity.class);
                startActivity(intent);
            }
        });

        //        Find numbers view id and store in family.
        TextView family = (TextView) findViewById(R.id.family);
//        Set onclickListerner onto numbers object.
        family.setOnClickListener(new View.OnClickListener() {
            //            Method that is carried out when onclickListener is activated on the numbers Textview.
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (MainActivity.this, FamilyActivity.class);
                startActivity(intent2);
            }
        });

        //        Find numbers view id and store in numbers.
        TextView colors = (TextView) findViewById(R.id.colors);
//        Set onclickListerner onto numbers object.
        colors.setOnClickListener(new View.OnClickListener() {
            //            Method that is carried out when onclickListener is activated on the numbers Textview.
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent (MainActivity.this, ColorsActivity.class);
                startActivity(intent3);
            }
        });

        //        Find numbers view id and store in numbers.
        TextView phrases = (TextView) findViewById(R.id.phrases);
//        Set onclickListerner onto numbers object.
        phrases.setOnClickListener(new View.OnClickListener() {
            //            Method that is carried out when onclickListener is activated on the numbers Textview.
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent (MainActivity.this, PhrasesActivity.class);
                startActivity(intent4);
            }
        });
    }

}
