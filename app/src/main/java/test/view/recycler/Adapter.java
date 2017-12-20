package test.view.recycler;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ali_HRhera on 12/19/2017.
 */

public class Adapter  extends RecyclerView.Adapter<Adapter.ViewHolders> {
    private  String[] namesArray;
    private Context context;
    public Adapter(String [] name , Context co){
        this.context=co;
        this.namesArray=name;
    }

    @Override
    public ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        ViewHolders holder =new ViewHolders(row);
        return holder;

    }
    @Override
    public void onBindViewHolder(ViewHolders holder, final int position) {
        // وضع الاسم فى مكان الاسماء
        holder.TextName.setText(namesArray[position]);
        //الحصول على الحرف الاول ووضعه فى المكان المخصص له
        holder.firstChar.setText(String.valueOf(namesArray[position].charAt(0)));

        // الحدث عند الضغط
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,namesArray[position] +"position is"+" "+position, Toast.LENGTH_SHORT).show();
            }
        });

        // تغير خلفيه الحرف
        if (position%2==0) {

            holder.firstChar.setBackgroundColor(context.getResources().getColor(R.color.orang));
        }
        else if(position %3==0){
            holder.firstChar.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        }
       else {
            holder.firstChar.setBackgroundColor(context.getResources().getColor(R.color.green));
        }
    }


    @Override
    public int getItemCount() {
        return namesArray.length;

    }
    public class ViewHolders extends RecyclerView.ViewHolder {
        private TextView TextName ,firstChar;
        private CardView card;
        public ViewHolders(View layout) {
            super(layout);
            TextName=(TextView)layout.findViewById(R.id.row_names);
            firstChar=(TextView)layout.findViewById(R.id.row_char);
            card=(CardView)layout.findViewById(R.id.card_cont);
        }
    }
}