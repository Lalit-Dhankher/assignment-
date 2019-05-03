package c.morgentec.form;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends Activity implements View.OnClickListener {

    EditText etMobileNo, etEmail, etPassword;
    Button btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_form);

        etEmail = findViewById(R.id.etEmail);
        etMobileNo = findViewById(R.id.etMobileNo);
        etPassword = findViewById(R.id.etPassword);
        btSubmit = findViewById(R.id.btLogin);


        //listners


        btSubmit.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if (etMobileNo.getText().toString().isEmpty() || etPassword.getText().toString().isEmpty() || etEmail.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please Enter the Value of all Field", Toast.LENGTH_SHORT).show();
            return;
        } else {
            final AlertDialog.Builder builder =
                    new AlertDialog.Builder(this, R.style.AppCompatAlertDialogStyle);
            builder.setTitle("Message");
            builder.setMessage("Thank you...");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    etMobileNo.setText("");
                    etEmail.setText("");
                    etPassword.setText("");
                }
            });
//            builder.setNegativeButton("Cancel", null);
            builder.show();


        }
    }
}
