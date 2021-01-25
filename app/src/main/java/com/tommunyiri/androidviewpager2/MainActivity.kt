package com.tommunyiri.androidviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var onboardingItemsAdapter: OnboardingItemsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnboardingItems()
    }

    private fun setOnboardingItems(){
        onboardingItemsAdapter= OnboardingItemsAdapter(
            listOf(
                OnboardingItem(
                    onboardingImage = R.drawable.ic_task,
                    title = "Manage your task",
                    description = "Organize all your TODOs and projects. Color tag them to set priorities and categories."
                ),
                OnboardingItem(
                    onboardingImage = R.drawable.ic_time,
                    title = "Work on time",
                    description = "When you're overwhelmed by amount of work you have on your plate, stop and rethink."
                ),
                OnboardingItem(
                    onboardingImage = R.drawable.ic_reminder,
                    title = "Get reminder on time",
                    description = "When you encounter a small task that takes less than 5 minutes to complete."
                )
            )
        )
        val onboardingViewPager=findViewById<ViewPager2>(R.id.onboardingViewPager)
        onboardingViewPager.adapter=onboardingItemsAdapter
    }
}