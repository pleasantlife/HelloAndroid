package com.kimjinhwan.android.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * 클릭리스너 구현하는 방법 세가지
 * 1. 위젯을 사용하는 객체가 상속받아서 구현한다.
 * 2. 객체내에서 변수로 생성한다.
 * 3. setOnClickListener 함수에 익명 객체로 전달 (익명 개체 : 식별자가 없는 객체)
 */

public class MainActivity extends AppCompatActivity implements {

    TextView tv;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);   //view 클래스를 상속받아 온 상태
        btn = (Button) findViewById(R.id.btnClick);

        //1. 위젯을 사용하는 객체가 상속받아서 구현한다.
        btn.setOnClickListener(this);




            //2. 객체내에서 변수로 생성한다.
 /*       View.onClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText("안녕 안드로이드!!!");
            }


*/
            /*        //3. setOnClickListener 함수에 익명 개체로 전달
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("안녕 안드로이드");
            }
        });
*/

/*

        public void main(String args[]){
        MainActivity clazz = new MainActivity();   주소 150;   //clazz가 '주소 150'을 담고 있음.
        clazz.setObject(clazz);                                //현재 주소 150

        clazz = new MainActivity();                 주소 160; // 주소 160이라는 새로운 주소가 지정.
    }
        public void setObject(MainActivity aaa){            // 주소 150 전달
            new SubActivity(){
              public void onClick(MainActivity activity){
                MainActivity bbb = aaa;                     // 주소 150이 계속 쓰이게 됨.
              }
            };
     */
        }
    //지역변수로 하면 변경사항이 생기면 추후에 반영할 수 없다.




    @Override
    public void onClick(View v) {
        tv.setText("안녕 안드로이드!!!");
    }
}









    class SubActivity {

    }
}
