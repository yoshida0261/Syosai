package com.starcompany.syosai.shosai

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.starcompany.syosai.R
import com.starcompany.syosai.model.Book
import java.util.*


class BookAdapter(private val context: Context) : BaseAdapter() {
    private var layoutInflater: LayoutInflater? = null
    var bookList: ArrayList<Book>? = null

    init {
        this.layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }


    override fun getCount(): Int {
        return this.bookList!!.size
    }

    override fun getItem(position: Int): Any {
        return this.bookList!![position]
    }

    override fun getItemId(position: Int): Long {
        return this.bookList!![position].id
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView

        if (null == convertView) {
            convertView = layoutInflater!!.inflate(R.layout.book, null)
        }
        (convertView!!.findViewById(R.id.author) as TextView).text = bookList!![position].author
        (convertView.findViewById(R.id.title) as TextView).text = bookList!![position].title



        return convertView
    }
}
