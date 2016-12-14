package com.example.administrator.myapplication;

/**
 * Created by Administrator on 2016/12/14 0014.
 */

import android.widget.Toast;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by wangfeng on 15/7/8.
 */
public class MyCordovaPlugin extends CordovaPlugin {
    @Override
    public Boolean shouldAllowRequest(String url) {
        return true;
    }

    @Override
    public Boolean shouldAllowNavigation(String url) {
        return true;
    }

    @Override
    public boolean execute(String action, JSONArray jsonArray, CallbackContext callbackContext) throws JSONException {
        if (action.equalsIgnoreCase("toast")) {
            String msg = jsonArray.getString(0);
            Toast toast = Toast.makeText(cordova.getActivity(), msg, Toast.LENGTH_SHORT);
            toast.show();
        }
        return super.execute(action, jsonArray, callbackContext);
    }

    @Override
    public Boolean shouldAllowBridgeAccess(String url) {
        return false;
    }
}
