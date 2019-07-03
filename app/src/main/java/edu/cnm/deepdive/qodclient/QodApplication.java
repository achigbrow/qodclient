package edu.cnm.deepdive.qodclient;

import android.app.Application;

public class QodApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    //This is where we would initialize Stetho (if using), Picasso, etc.
    //This is where we could perform some non-trivial DB operation to force db creation.
  }
}
