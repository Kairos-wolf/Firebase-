package adapter;

import android.app.Activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.advancedrealtimedatabasefirebase.R;


import org.jetbrains.annotations.Nullable;

import model.Contact;

public class ContactAdapter extends ArrayAdapter<Contact> {
    Activity context;
    int resource;
    public ContactAdapter(Activity context, int resource) {
        super(context, resource);
        this.context=context;
        this.resource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View custom=context.getLayoutInflater().inflate(resource,null);
        TextView txtId=custom.findViewById(R.id.txtId);
        TextView txtTen=custom.findViewById(R.id.txtTen);
        TextView txtLoai=custom.findViewById(R.id.txtLoai);
        TextView txtGia=custom.findViewById(R.id.txtGia);
        Contact contact=getItem(position);
        txtId.setText("Id sản phẩm: "+contact.getContactId());
        txtTen.setText("Tên: "+contact.getTensp());
        txtLoai.setText("Loại: "+contact.getLoaisp());
        txtGia.setText("Giá: "+contact.getGiasp());
        return custom;
    }
}
