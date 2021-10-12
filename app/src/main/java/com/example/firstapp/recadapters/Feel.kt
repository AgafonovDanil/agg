package com.example.firstapp.recadapters
import com.example.firstapp.R

data class Feel(val image:Int, val name_feel:String){
    class MyFeel{val list = arrayListOf(
        Feel(R.drawable.calm, "Питательный"),
        Feel(R.drawable.focus, "Вкусный"),
        Feel(R.drawable.anxious, "Жирненький"),
        Feel(R.drawable.title, "Крутым"),
        Feel(R.drawable.read, "Даб"),
        Feel(R.drawable.lid, "Тыктым")
    )}
}
