package net.bilges.android.overview;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


/**
 * Simple Activity which contains some button click listeners.
 * In the future this will be the entry point to a couple of Apps.
 */
public class OverviewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_overview, menu);
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

    public void spotifyStreamerClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Spotify Streamer App",
                Toast.LENGTH_SHORT).show();
    }

    public void scoresClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Scores App",
                Toast.LENGTH_SHORT).show();
    }

    public void libraryClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Library App",
                Toast.LENGTH_SHORT).show();
    }

    public void buildItBiggerClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Build It Bigger App",
                Toast.LENGTH_SHORT).show();
    }

    public void xyzReaderClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the XYZ Reader App",
                Toast.LENGTH_SHORT).show();
    }

    public void capstoneClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Capstone App",
                Toast.LENGTH_SHORT).show();
    }
}
