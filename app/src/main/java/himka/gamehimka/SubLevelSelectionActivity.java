package himka.gamehimka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SubLevelSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Memasang layout activity_level_selection.XML ke Activity ini
        setContentView(R.layout.activity_sub_level_selection);

        //Mendapatkan referensi view dari activity_sub_level_selection.XML
        ImageView level = (ImageView) findViewById(R.id.level);
        ImageView buttonBack = (ImageView) findViewById(R.id.button_back);
        ImageView buttonHome = (ImageView) findViewById(R.id.button_home);

        //Mendapatkan variable yang dipassing dari LevelActivity
        String subLevel = getIntent().getStringExtra("sublevel");
        switch (subLevel) {
            case "beginner":
                //Set gambar dengan ic_menu_level_beginner
                level.setImageResource(R.drawable.ic_menu_level_beginner);
                break;
            case "teenager":
                //Set gambar dengan ic_menu_level_teenager
                level.setImageResource(R.drawable.ic_menu_level_teenager);
                break;
            case "moderate":
                //Set gambar dengan ic_menu_level_moderate
                level.setImageResource(R.drawable.ic_menu_level_moderate);
                break;
            case "master":
                //Set gambar dengan ic_menu_level_master
                level.setImageResource(R.drawable.ic_menu_level_master);
                break;
        }

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToLevelSelectionActivity = new Intent(SubLevelSelectionActivity.this, LevelSelectionActivity.class);
                startActivity(goToLevelSelectionActivity);
                finish();
            }
        });

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToHomeActivity = new Intent(SubLevelSelectionActivity.this, HomeActivity.class);
                startActivity(goToHomeActivity);
                finish();
            }
        });
    }
}
