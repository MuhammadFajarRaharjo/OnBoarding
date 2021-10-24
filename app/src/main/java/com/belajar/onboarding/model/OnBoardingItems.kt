package com.belajar.onboarding.model

import com.belajar.onboarding.R

class OnBoardingItems(
    val image: Int,
    val title: Int,
    val desc: Int
) {
    companion object{
        fun getData(): List<OnBoardingItems>{
            return listOf(
                OnBoardingItems(R.drawable.onboarding1, R.string.onBoardingTitle1, R.string.onBoardingText1),
                OnBoardingItems(R.drawable.onboarding2, R.string.onBoardingTitle2, R.string.onBoardingText2),
                OnBoardingItems(R.drawable.onboarding3, R.string.onBoardingTitle3, R.string.onBoardingText3)
            )
        }
    }
}
