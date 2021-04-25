# AndroidProjectDiary
A Android App that you can write a travel diary. You can choose whether to write the diary or check the previous diaries on the First screen. 
If you choose to write new one, there are test boxes for date, place, and contents. You can also upload a picture and enter the longitude and latitude as location.
If you click to check the previous diaries, then you will see the list of diaries you wrote. You can access the detailed content and you will see what you've wrote previously and the button to see the location for latitude as location of that place.

## Sample video
<img width="80%" src="https://user-images.githubusercontent.com/75755156/116001682-9c8c1800-a630-11eb-8391-4ddc1ebd5741.mp4"/>
## Installation
Android Studio

Android SDK 28 Android SDK Build-tools 28.0.3

(You can change other sdk and build-tools)
## Usage
#### Gradle

```gradle
dependencies {
    implementation 'androidx.appcompat:appcompat:1.2.0'
    implementation 'com.google.android.material:material:1.2.1'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
    implementation 'com.google.android.gms:play-services-maps:17.0.0'

    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
}
```
## GoogleMap
#### XML
```xml
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />

<application
    <meta-data
        android:name="com.google.android.geo.API_KEY"
        android:value="AIzaSyAl_K2dKrtdU8P7C5-fCMuZZYGtmFrjzfA" />
```

#### JAVA
MapsActivity.java
```java
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
```


