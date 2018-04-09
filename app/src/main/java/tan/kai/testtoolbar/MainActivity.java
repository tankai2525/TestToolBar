package tan.kai.testtoolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "toolbar左侧图标", Toast.LENGTH_SHORT).show();
            }
        });

        //set up menu layout
//        toolbar.inflateMenu(R.menu.main_menu);
//        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.menu1:
//                        show("menu1");
//                        break;
//                    case R.id.menu2:
//                        show("menu2");
//                        break;
//                    case R.id.menu3:
//                        show("menu3");
//                        break;
//                    case R.id.menu4:
//                        show("menu4");
//                        break;
//                }
//                return false;
//            }
//        });

        //如果要使用onCreateOptionsMenu，就得把toolbar赋给actionbar
        setSupportActionBar(toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                show("menu1");
                break;
            case R.id.menu2:
                show("menu2");
                break;
            case R.id.menu3:
                show("menu3");
                break;
            case R.id.menu4:
                show("menu4");
                break;

        }
        return true;
    }

    private void show(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }

}
