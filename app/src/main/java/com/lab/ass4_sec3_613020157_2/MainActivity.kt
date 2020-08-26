package com.lab.ass4_sec3_613020157_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDatePickerDialog(v: View){
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")
    }

    fun resetText(view: View) {
        edit_username.text.clear()
        edit_password.text.clear()
        edit_email.text.clear()
        text_birthday.text = "mm / dd / yy"
        text_inf.text = "Show Information"
        radio_group.clearCheck()
    }

    fun showInf(view: View) {
        text_inf.text = "Name: ${edit_username.text}\nPassword: ${edit_password.text}\nGender: ${
        if (radioFemale.isChecked) radioFemale.text else if (radioMale.isChecked) radioMale.text else ""
        }\nE-mail: ${edit_email.text}\nBirthday: ${text_birthday.text}"
    }
}