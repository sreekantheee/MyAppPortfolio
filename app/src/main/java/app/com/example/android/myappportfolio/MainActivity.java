package app.com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private Toast currentToast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        final int resId = getToastIdFromButtonId(view.getId());
        final CharSequence text = getApplicationContext().getText(resId);
        if (currentToast != null) {
            currentToast.cancel();
        }
        currentToast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        currentToast.show();
    }

    private int getToastIdFromButtonId(final int btnId) {
        switch (btnId) {
            case R.id.btn_movies:
                return R.string.toast_movies;
            case R.id.btn_stock:
                return R.string.toast_hawk;
            case R.id.btn_bigger:
                return R.string.toast_bigger;
            case R.id.btn_material:
                return R.string.toast_material;
            case R.id.btn_ubiquitous:
                return R.string.toast_ubiquitous;
            default:
                return R.string.toast_capstone;
        }
    }
}