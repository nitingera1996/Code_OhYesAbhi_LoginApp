package com.example.loginapp;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

	String sites[] = { "Google+", "Facebook", "Twitter", "Linkedin","Github" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(MainActivity.this,
				android.R.layout.simple_list_item_1, sites));

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String label = sites[position];
		/*try {
			Class ourclass = Class.forName("com.example.loginapp." + label);
			Intent ourintent = new Intent(MainActivity.this, ourclass);
			startActivity(ourintent);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}*/
		switch (position) {
		case 0:

			Bundle send = new Bundle();
			send.putString("address", "https://www.plus.google.com");
			Intent i = new Intent(MainActivity.this, Logincommon.class);
			i.putExtras(send);
			startActivity(i);
			break;

		case 1:

			Bundle send2 = new Bundle();
			send2.putString("address", "https://www.facebook.com/login.php");
			Intent j = new Intent(MainActivity.this, Logincommon.class);
			j.putExtras(send2);
			startActivity(j);
			break;

		case 2:

			Bundle send3 = new Bundle();
			send3.putString("address", "https://www.twitter.com/login");
			Intent k = new Intent(MainActivity.this, Logincommon.class);
			k.putExtras(send3);
			startActivity(k);
			break;

		case 3:

			Bundle send4 = new Bundle();
			send4.putString("address", "https://www.linkedin.com/login");
			Intent m = new Intent(MainActivity.this, Logincommon.class);
			m.putExtras(send4);
			startActivity(m);
			break;

		case 4:

			Bundle send5 = new Bundle();
			send5.putString("address", "https://www.github.com/login");
			Intent n = new Intent(MainActivity.this, Logincommon.class);
			n.putExtras(send5);
			startActivity(n);
			break;
		}
	}
	}


