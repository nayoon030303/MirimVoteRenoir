package kr.ac.ssu.kjminn.mirimvoterenoir;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import kr.ac.ssu.kjminn.mirimvoterenoir.R;

public class GridAdapter extends BaseAdapter {

    int[] imgVIds = {R.drawable.r01, R.drawable.r02, R.drawable.r03, R.drawable.r04, R.drawable.r05, R.drawable.r06, R.drawable.r07, R.drawable.r08, R.drawable.r09};
    String[] imgNames = {"독서하는 소녀", "꽃장식 모자 소녀", "부채를 든 소녀", "이레느깡 단 베르양", "잠자는 소녀", "테라스의 두 자매", "피아노 레슨", "피아노 앞의 소녀들", "해변에서"};
    int[] voteCount = new int[imgNames.length];
    Context context;
    public GridAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return imgVIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new GridView.LayoutParams(300,400) );
        imgv.setAdjustViewBounds(true);
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5,5,5,5);
        imgv.setImageResource(imgVIds[i]);
        for(int j =0; j<voteCount.length; j++){
            voteCount[j] =0;
        }


        final int pos = i;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voteCount[pos]++;
                Toast.makeText(context, imgNames[pos] + ": 총 " + voteCount[pos] + "표", Toast.LENGTH_SHORT).show();
            }
        });
        return imgv;
    }
}
