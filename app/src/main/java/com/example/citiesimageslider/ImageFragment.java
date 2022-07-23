package com.example.citiesimageslider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class ImageFragment extends Fragment {
    private static final String TAG = "ImageFragment";

    ImageView images;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image, container, false);

        images = (ImageView) view.findViewById(R.id.images);
        Bundle bundle = getArguments();

        if(null != bundle){
            String url = bundle.getString("imageUrl", "");

            Glide.with(getActivity())
                    .asBitmap()
                    .load(url)
                    .into(images);
        }

        return view;
    }
}
