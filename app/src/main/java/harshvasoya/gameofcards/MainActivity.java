package harshvasoya.gameofcards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button play,play1;

    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button)findViewById(R.id.btn_play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 1;
                Intent intent = new Intent(MainActivity.this,Table.class);
                Bundle b1 = new Bundle();
                b1.putInt("no_players",x);
                intent.putExtras(b1);
                startActivity(intent);
            }
        });

        play1 = (Button) findViewById(R.id.btn_play2);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,Choice.class);
                startActivity(intent1);
            }
        });
    }

}
