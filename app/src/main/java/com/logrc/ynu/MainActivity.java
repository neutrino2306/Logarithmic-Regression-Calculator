package com.logrc.ynu;

import static java.lang.Integer.parseInt;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.logrc.ynu.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private TextView point1,point2,point3,point4,point5,point6,point7,point8,point9,point10,point11,point12,point13,point14,point15,point16,point17,point18,point19,point20,point21,point22,point23,point24,point25,point26,point27,point28,point29,point30,point31,point32,point33,point34,point35,point36,point37,point38,point39,point40,point41,point42,point43,point44,point45,point46,point47,point48,point49,point50;
private Button btn_add, btn_change,btn_exe,btn_reset, btn_delete_recent,btn_delete_specific,btn_delete_all;
private EditText  input_x,input_y,edit_num,edit_x,edit_y,del_num;

    private List<String> data_x=new ArrayList<>();
    private List<String> data_y=new ArrayList<>();


    private static final Pattern DOUBLE_PATTERN = Pattern.compile(
            "[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)" +
                    "([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|" +
                    "(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))" +
                    "[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");

    public static boolean isNumeric(String s)
    {
        return DOUBLE_PATTERN.matcher(s).matches();
    }

    public static final String MyPREFERENCES = "MyPrefs" ;
    SharedPreferences sharedpreferences;
    private void declare(){
        btn_add=(Button)findViewById(R.id.btn_add);
        btn_change=(Button)findViewById(R.id.btn_change);
        btn_exe=(Button)findViewById(R.id.btn_exe);
        btn_reset=(Button)findViewById(R.id.btn_reset);

        btn_delete_recent=(Button)findViewById(R.id.btn_delete_recent);
        btn_delete_specific=(Button)findViewById(R.id.btn_delete_specific);
        btn_delete_all=(Button)findViewById(R.id.btn_delete_all);
        input_x=(EditText) findViewById(R.id.input_x);
        input_y=(EditText) findViewById(R.id.input_y);
        edit_num=(EditText) findViewById(R.id.edit_num);
        edit_x=(EditText) findViewById(R.id.edit_x);
        edit_y=(EditText) findViewById(R.id.edit_y);
        del_num=(EditText) findViewById(R.id.del_num);

        point1=(TextView) findViewById(R.id.point1);
        point2=(TextView) findViewById(R.id.point2);
        point3=(TextView) findViewById(R.id.point3);
        point4=(TextView) findViewById(R.id.point4);
        point5=(TextView) findViewById(R.id.point5);
        point6=(TextView) findViewById(R.id.point6);
        point7=(TextView) findViewById(R.id.point7);
        point8=(TextView) findViewById(R.id.point8);
        point9=(TextView) findViewById(R.id.point9);
        point10=(TextView) findViewById(R.id.point10);
        point11=(TextView) findViewById(R.id.point11);
        point12=(TextView) findViewById(R.id.point12);
        point13=(TextView) findViewById(R.id.point13);
        point14=(TextView) findViewById(R.id.point14);
        point15=(TextView) findViewById(R.id.point15);
        point16=(TextView) findViewById(R.id.point16);
        point17=(TextView) findViewById(R.id.point17);
        point18=(TextView) findViewById(R.id.point18);
        point19=(TextView) findViewById(R.id.point19);
        point20=(TextView) findViewById(R.id.point20);
        point21=(TextView) findViewById(R.id.point21);
        point22=(TextView) findViewById(R.id.point22);
        point23=(TextView) findViewById(R.id.point23);
        point24=(TextView) findViewById(R.id.point24);
        point25=(TextView) findViewById(R.id.point25);
        point26=(TextView) findViewById(R.id.point26);
        point27=(TextView) findViewById(R.id.point27);
        point28=(TextView) findViewById(R.id.point28);
        point29=(TextView) findViewById(R.id.point29);
        point30=(TextView) findViewById(R.id.point30);
        point31=(TextView) findViewById(R.id.point31);
        point32=(TextView) findViewById(R.id.point32);
        point33=(TextView) findViewById(R.id.point33);
        point34=(TextView) findViewById(R.id.point34);
        point35=(TextView) findViewById(R.id.point35);
        point36=(TextView) findViewById(R.id.point36);
        point37=(TextView) findViewById(R.id.point37);
        point38=(TextView) findViewById(R.id.point38);
        point39=(TextView) findViewById(R.id.point39);
        point40=(TextView) findViewById(R.id.point40);
        point41=(TextView) findViewById(R.id.point41);
        point42=(TextView) findViewById(R.id.point42);
        point43=(TextView) findViewById(R.id.point43);
        point44=(TextView) findViewById(R.id.point44);
        point45=(TextView) findViewById(R.id.point45);
        point46=(TextView) findViewById(R.id.point46);
        point47=(TextView) findViewById(R.id.point47);
        point48=(TextView) findViewById(R.id.point48);
        point49=(TextView) findViewById(R.id.point49);
        point50=(TextView) findViewById(R.id.point50);
    }
    private void setIni(){
        declare();
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.apply();
        TextView[] disp_point ={point1,point2,point3,point4,point5,point6,point7,point8,point9,point10,point11,point12,point13,point14,point15,point16,point17,point18,point19,point20,point21,point22,point23,point24,point25,point26,point27,point28,point29,point30,point31,point32,point33,point34,point35,point36,point37,point38,point39,point40,point41,point42,point43,point44,point45,point46,point47,point48,point49,point50};
        if(isNumeric(sharedpreferences.getString("dataSize","")))
            for(int i=0;i<parseInt(sharedpreferences.getString("dataSize",""));i++){
                data_x.add(sharedpreferences.getString(String.valueOf(i+1),""));
                data_y.add(sharedpreferences.getString(String.valueOf(i+51),""));
                disp_point[i].setText("("+(i + 1)+")" + data_x.get(i)+","+data_y.get(i));
            }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setIni();
        btn_add.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View view) {
                                           sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                                           SharedPreferences.Editor editor = sharedpreferences.edit();
                                           TextView[] disp_point ={point1,point2,point3,point4,point5,point6,point7,point8,point9,point10,point11,point12,point13,point14,point15,point16,point17,point18,point19,point20,point21,point22,point23,point24,point25,point26,point27,point28,point29,point30,point31,point32,point33,point34,point35,point36,point37,point38,point39,point40,point41,point42,point43,point44,point45,point46,point47,point48,point49,point50};

                                           if(data_x.size()<50){
                                               String data_x_temp= input_x.getText().toString();
                                               String data_y_temp= input_y.getText().toString();

                                               if(isNumeric(data_x_temp)&&isNumeric(data_y_temp)) {
                                                   data_x.add(data_x_temp);
                                                   data_y.add(data_y_temp);
                                                   input_x.setText("");
                                                   input_y.setText("");

                                                   for (int i=0;i<data_x.size();i++) {
                                                       disp_point[i].setText("(" + (i + 1) + ")" + data_x.get(i)+","+data_y.get(i));

                                                       editor.putString(String.valueOf(i + 1), data_x.get(i));
                                                       editor.putString(String.valueOf(i + 51), data_y.get(i));
                                                       editor.apply();


                                                   }
                                                   editor.putString("dataSize", String.valueOf(data_x.size()));
                                                   editor.apply();
                                               }
                                           }

                                           else {
                                               Toast.makeText(getApplicationContext(), "已达到最大数据组数！",
                                                       Toast.LENGTH_SHORT).show();
                                           }
                                       }


                                   }
        );


    }
}