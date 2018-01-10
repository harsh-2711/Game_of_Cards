package harshvasoya.gameofcards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choice extends AppCompatActivity {

    Button b1,b2,b3;

    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        b1 = (Button) findViewById(R.id.player_2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = 2;
                Intent p2 = new Intent(Choice.this,Table.class);
                Bundle b2 = new Bundle();
                b2.putInt("no_players", x);
                p2.putExtras(b2);
                startActivity(p2);
            }
        });

        b2 = (Button) findViewById(R.id.player_3);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = 3;
                Intent p3 = new Intent(Choice.this,Table.class);
                Bundle b3 = new Bundle();
                b3.putInt("no_players", x);
                p3.putExtras(b3);
                startActivity(p3);
            }
        });

        b3 = (Button) findViewById(R.id.player_4);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = 4;
                Intent p4 = new Intent(Choice.this,Table.class);
                Bundle b4 = new Bundle();
                b4.putInt("no_players", x);
                p4.putExtras(b4);
                startActivity(p4);
            }
        });
    }
}
