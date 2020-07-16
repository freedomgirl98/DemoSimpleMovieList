package sg.edu.rp.c346.id19036308.demosimplemovielist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    ArrayList<String> movieList;
    ArrayAdapter<String> aaMovie;
    //ArrayList<String> str = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewMovie);
        movieList = new ArrayList();
        movieList.add("Avenger Infinity War Release Date: 2018.04");
        movieList.add("Justice League Release Date: 2017.11");
        movieList.add("Train to Busan Release Date: 2016.08");

        aaMovie = new ArrayAdapter(this,android.R.layout.simple_list_item_1,movieList);
        lvExamTips.setAdapter(aaMovie);
        //ArrayAdapter<String>adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,movieList);

    }
}
