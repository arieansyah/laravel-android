package id.kuyfutsal.kuyfutsal;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DetailBookedActivity extends AppCompatActivity {
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_booked);

        SharedPreferences sp = getSharedPreferences("MYPREFS", MODE_PRIVATE);
        //SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        username = sp.getString("username", "nothing");

        //getData();
    }

//    private void getData() {
//        String url = "http://192.168.100.4:8000/api/getUser" + "/" + username;
//        JsonArrayRequest reqData = new JsonArrayRequest(Request.Method.GET, url,null,
//                new Response.Listener<JSONArray>() {
//                    @Override
//                    public void onResponse(JSONArray response) {
//                        Log.d("volley","response : " + response.toString());
//                        for(int i = 0 ; i < response.length(); i++)
//                        {
//                            try {
//                                JSONObject data = response.getJSONObject(i);
//                                txtName.setText(data.getString("name"));
//                                txtEmail.setText(data.getString("email"));
//                                String id = data.getString("id_user");
//
//                                SharedPreferences sp = getSharedPreferences("MYPREFS", MODE_PRIVATE);
//                                SharedPreferences.Editor editor = sp.edit();
//
//                                String name = txtName.getText().toString();
//                                String username = txtUsername.getText().toString();
//                                String email = txtEmail.getText().toString();
//
//                                editor.putString("id_user", id);
//                                editor.commit();
//                                editor.putString("name", name);
//                                editor.commit();
//                                editor.putString("username", username);
//                                editor.commit();
//                                editor.putString("email", email);
//                                editor.commit();
//
//                            } catch (JSONException e) {
//                                pd.cancel();
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Log.d("volley", "error : " + error.getMessage());
//                    }
//                });
//
//        Volley.newRequestQueue(this).add(reqData);
//    }
}
