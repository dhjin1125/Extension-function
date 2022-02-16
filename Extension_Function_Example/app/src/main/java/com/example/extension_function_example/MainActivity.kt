package com.example.extension_function_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test1 = "ab"
        val test2 = "1234"

        Log.d("테스트1", "${test1.isNumber()}")
        Log.d("테스트2", "${test2.isNumber()}")
        Log.d("테스트3", "${test1.last()}")
        Log.d("테스트4", "${test1.lastTwoChar()}")
    }

}


// String이 숫자 형태인지 확장함수로 만들어줌
fun String.isNumber(): Boolean {
    return try {
        this.toBigInteger()
        true
    } catch (e: NumberFormatException) {
        false
    }
}

//마지막 두글자를 반환하는 함수
fun String.lastTwoChar(): String {
    return if(this.length==1)
        get(length-1).toString()
    else
        this.substring(length-2, length)
}
