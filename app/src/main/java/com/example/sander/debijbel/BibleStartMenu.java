package com.example.sander.debijbel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


public class BibleStartMenu extends Activity {
    public final static String ACTION_VIEW= com.example.sander.debijbel.;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.bible_start_menu_nl);



    }


        public void ToChoiceList(View view) {
        Intent intent = new Intent(this, DisplayChoiceList.class);
        Button button=(Button)findViewById(R.id.kies_verhaal);
            String ChoiceListView = ListView.;
            intent.putExtra(ACTION_VIEW, ChoiceListView);
            startActivity(Intent);




    }


public void ToOptionsList(View view){

}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bible_start_menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
