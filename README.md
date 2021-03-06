
# AndroidProjectDiary

## Travel Diary App
A Android App that you can write a travel diary. You can choose whether to write the diary or check the previous diaries on the First screen. 
If you choose to write new one, there are test boxes for date, place, and contents. You can also upload a picture and enter the longitude and latitude as location.
If you click to check the previous diaries, then you will see the list of diaries you wrote. You can access the detailed content and you will see what you've wrote previously and the button to see the location for latitude as location of that place.

## What you can do
* To write diary containg contents of date, place, location, image, longitude and latitude for the location.
* To review the diary you've wrote before, and you can open google map of the location with longitude and latitude.

## Result Screenshot
<img src = "https://user-images.githubusercontent.com/75755156/116002585-67ce8f80-a635-11eb-9d35-e73358d7e4f9.png" width="35%"/><img src = "https://user-images.githubusercontent.com/75755156/116002614-96e50100-a635-11eb-9956-fa025245997b.png" width="35%"/>
<img src = "https://user-images.githubusercontent.com/75755156/116002642-aebc8500-a635-11eb-88e3-ad67410b5054.png" width="35%"/><img src = "https://user-images.githubusercontent.com/75755156/116002659-c0059180-a635-11eb-9211-b4e86c285daa.png" width="35%"/>
<img src = "https://user-images.githubusercontent.com/75755156/116002670-cc89ea00-a635-11eb-88b5-d2b9dc7b5ab6.png" width="35%"/>

## Tools
Android Studio   
Android SDK 28 Android SDK Build-tools 28.0.3   
(You can change other sdk and build-tools)

## GoogleMap Setting
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

