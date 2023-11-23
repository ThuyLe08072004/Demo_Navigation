package com.example.demo_navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag111 extends Fragment {

    Button btn01;

    //TextView tv01;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // dùng để gắn layout, xóa return mặc định đi
//        return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.activity_fragment1, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // ánh xạ và tương tác với view trên fragment
        btn01 = view.findViewById(R.id.btn01);
//tv01.findViewById(R.id.tv01);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Đã bấm nút", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
//    public  void NhanDuLieuTuActivity(){
//        tv01.setText("ND từ activity"+tv01);
//    }
//}
