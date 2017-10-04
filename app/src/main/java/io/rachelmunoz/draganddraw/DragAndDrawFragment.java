package io.rachelmunoz.draganddraw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rachelmunoz on 10/3/17.
 */

public class DragAndDrawFragment extends Fragment {

	public static DragAndDrawFragment newInstance(){
		return new DragAndDrawFragment();
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_drag_and_draw,container, false);

		return view;
	}
}
