package com.example.myapplication.presenter
import android.view.View
import com.example.myapplication.model.Person
import java.util.*

class CalculateAgePresenter(private val view:View): ICalculateAgePresenter {


    override fun calculateYourAge(name: String, age: String) {

        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val yourAge = currentYear - age.toInt()
        val person = Person(name, yourAge)
        view.getInfo(person)
    }

    interface View{
        fun getInfo(person: Person)
    }
}