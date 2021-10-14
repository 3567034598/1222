package AdapPackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.R;
import com.example.myapplication.xiaoxi;

import java.util.List;

public class ComeAdapt extends BaseAdapter {
    private List<xiaoxi> data;
    private Context context;

    public ComeAdapt(List<xiaoxi> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
          convertView=LayoutInflater.from(context).inflate(R.layout.layout4,null);
            TextView name=convertView.findViewById(R.id.name1);
            ImageView image=convertView.findViewById(R.id.image2);
            name.setText(data.get(position).getTitle());
            image.setImageResource(data.get(position).getImage());
        return convertView;
    }
}
