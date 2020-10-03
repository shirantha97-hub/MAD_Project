package com.example.drivago_mad;


import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class stdDetailsTest {

    @Rule
    public ActivityTestRule<stdDetails> mActivityTestRule = new ActivityTestRule<>(stdDetails.class);

    @Test
    public void stdDetailsTest() {
    }
}
