package com.github.dnrklein.criminalintent;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.github.dnrklein.criminalintent.criminalintent.R;

public class CrimeActivity extends FragmentActivity
{
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_crime);
  }
}
