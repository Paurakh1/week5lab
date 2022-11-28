package np.com.paurakhsaud.loginuilab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sign(View view) {
        Toast.makeText(this, "Sign In Button is Clicked", Toast.LENGTH_SHORT).show();
    }

    public void face(View view) {
        Toast.makeText(this, "Sign in By Facebook", Toast.LENGTH_SHORT).show();
    }

    public void goo(View view) {
        Toast.makeText(this, "Sign in By Google", Toast.LENGTH_SHORT).show();
    }

    public void forget(View view) {
        Toast.makeText(this, "Did You Forget your Password", Toast.LENGTH_SHORT).show();
    }
}