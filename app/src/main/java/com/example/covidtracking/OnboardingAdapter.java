package com.example.covidtracking;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OnboardingAdapter {
    class OnboardingViewHolder extends RecyclerView.ViewHolder{

        private TextView titleTv;
        private TextView contentTv;
        private ImageView imageOnboarding;

        public OnboardingViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
