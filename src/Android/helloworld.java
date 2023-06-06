package com.example.helloworld;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

 
public class HelloWorld extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("sayHello".equals(action)) {
            String name = args.getString(0);
            String message = "Hello mojiken , " + name + "!";
            callbackContext.success(message);
            return true;
        }
        return false;
    }
}
