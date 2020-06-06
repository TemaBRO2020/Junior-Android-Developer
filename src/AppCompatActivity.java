public class AppCompatActivity {
}
public class AppCompatActivity {}

public class SecondActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        tv = findViewById(R.id.textView);
        tv.setText(this.getClass().getSimpleName());
        findViewById(R.id.buttonTest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("My name is ");
                tv.append(State.name);
                tv.append(" i'm ");
                tv.append(Integer.toString(State.age));
                tv.append(" years old");
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        State.name = "Mikhail";
    }
    @Override
    protected void onStop() {
        super.onStop();
        State.name = "Igor";
    }
    @Override
    protected void onPause() {
        super.onPause();
        State.age = 21;
    }
    @Override
    protected void onResume() {
        super.onResume();
        State.age = 22;
    }
}
public class FirstActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        tv = findViewById(R.id.textView);
        tv.setText(this.getClass().getSimpleName());
        findViewById(R.id.buttonTest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        State.name = "Dmitriy";
    }
    @Override
    protected void onStop() {
        super.onStop();
        State.name = "Daria";
    }
    @Override
    protected void onPause() {
        super.onPause();
        State.age = 19;
    }
    @Override
    protected void onResume() {
        super.onResume();
        State.age = 20;
    }
}
public class State {
    public static String name = "Andrey";
    public static int age = 18;
}

