package com.example.a20191214_01_listviewpractice02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a20191214_01_listviewpractice02.adapters.BookAdatper
import com.example.a20191214_01_listviewpractice02.datas.Bookdata
import com.example.a20191214_01_listviewpractice02.datas.GameData
import kotlinx.android.synthetic.main.activity_book_list.*

class BookListActivity : BaseActivity() {
    var bookAdatper:BookAdatper? = null
    val bookList = ArrayList<Bookdata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {


    }

    override fun setValues() {
        addBooks()

        bookAdatper = BookAdatper(mContext, R.layout.book_list_item, bookList)
        bookListView.adapter = bookAdatper
    }
    fun addBooks(){
        bookList.add(Bookdata("해리포터", "1"))
        bookList.add(Bookdata("반지의제왕", "2"))
        bookList.add(Bookdata("호빗", "3"))

    }
}
