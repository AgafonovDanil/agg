package com.example.firstapp.recadapters
import com.example.firstapp.R

data class State(val title:String, val text_state:String, val image:Int){
    class MyState{val list = arrayListOf(
        State("Заголовок статьи", "Краткое описание", R.drawable.state_img_1),
        State("Заголовок статьи", "Краткое описание", R.drawable.state_img_2)
    )}
}
