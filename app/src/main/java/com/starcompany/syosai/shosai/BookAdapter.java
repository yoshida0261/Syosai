package com.starcompany.syosai.shosai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.starcompany.syosai.R;
import com.starcompany.syosai.model.Book;

import java.util.ArrayList;


public class BookAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater = null;
    private ArrayList<Book> bookList;

    public BookAdapter(Context context)
    {
        this.context = context;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setBookList(ArrayList<Book> bookList)
    {
        this.bookList = bookList;
    }

    public ArrayList<Book> getBookList()
    {
        return this.bookList;
    }



    @Override
    public int getCount() {
        return this.bookList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.bookList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.bookList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(null == convertView){
            convertView = layoutInflater.inflate(R.layout.book, null);
        }
        ((TextView)convertView.findViewById(R.id.author)).setText(bookList.get(position).getAuthor());
        ((TextView)convertView.findViewById(R.id.title)).setText(bookList.get(position).getTitle());

        

        return convertView;
    }
}
