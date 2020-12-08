package kr.ac.ssu.kjminn.mirimvoterenoir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class GridActivity extends AppCompatActivity {

    GridView gridView;
    GridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        setTitle("gridVeiw");
        gridView = findViewById(R.id.gri1);
        adapter = new GridAdapter(this);
        gridView.setAdapter(adapter);


        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.putExtra("voteCount", adapter.voteCount);
                intent.putExtra("imgNames", adapter.imgNames);
                startActivity(intent);
            }
        });
    }
}