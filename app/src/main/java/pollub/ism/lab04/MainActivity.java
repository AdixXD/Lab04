package pollub.ism.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public int k=0;
    public int[] indeksy={2131230807, 2131230808, 2131230809,2131230810,2131230811,2131230812,2131230813,2131230814,2131230815};
    public void wcisnieciePrzycisku(View view)
    {   int tab=view.getId();
        TextView kk = (TextView)findViewById(view.getId());
        Button przycisk= (Button) findViewById(view.getId());
        przycisk.setEnabled(false);
        if(k%2==0)
        kk.setText("X");
        else kk.setText("O");
        k++;
        WygralKto();

    }

    public void iksyczyzera(String lmao)
    {
        if(lmao=="X") {
            Toast.makeText(this, "Wygraly X", Toast.LENGTH_LONG).show();
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }
        if(lmao=="O")
        {
            Toast.makeText(this, "Wygraly O", Toast.LENGTH_LONG).show();
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }
    }
    public void WygralKto()
    {
        List<String> tablica = new ArrayList<String>();
        for(int i=0;i<9;i++)
        {
            TextView tempy=(TextView)findViewById(indeksy[i]);
            String temp1=tempy.getText().toString();
            tablica.add(temp1);
        }
        if(tablica.get(0)==tablica.get(1) && tablica.get(1)==tablica.get(2))
        {
            iksyczyzera(tablica.get(0));
        }

        if(tablica.get(3)==tablica.get(4) && tablica.get(4)==tablica.get(5))
        {
            iksyczyzera(tablica.get(3));
        }

        if(tablica.get(6)==tablica.get(7) && tablica.get(7)==tablica.get(8))
        {
            iksyczyzera(tablica.get(6));
        }

        if(tablica.get(0)==tablica.get(3) && tablica.get(3)==tablica.get(6))
        {
            iksyczyzera(tablica.get(0));
        }

        if(tablica.get(1)==tablica.get(4) && tablica.get(4)==tablica.get(7))
        {
            iksyczyzera(tablica.get(1));
        }

        if(tablica.get(2)==tablica.get(5) && tablica.get(5)==tablica.get(8))
        {
            iksyczyzera(tablica.get(2));
        }

        if(tablica.get(0)==tablica.get(4) && tablica.get(4)==tablica.get(8) && tablica.get(0)!="")
        {
            iksyczyzera(tablica.get(0));
        }

        if(tablica.get(2)==tablica.get(4) && tablica.get(4)==tablica.get(6) && tablica.get(2)!="")
        {
            iksyczyzera(tablica.get(2));
        }
    }
}