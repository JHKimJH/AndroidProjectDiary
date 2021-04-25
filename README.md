# AndroidProjectDiary
A Android App that you can write a travel diary. You can choose whether to write the diary or check the previous diaries on the First screen. 
If you choose to write new one, there are test boxes for date, place, and contents. You can also upload a picture and enter the longitude and latitude as location.
If you click to check the previous diaries, then you will see the list of diaries you wrote. You can access the detailed content and you will see what you've wrote previously and the button to see the location for latitude as location of that place.

## Sample video

## Installation
Android Studio

Android SDK 28 Android SDK Build-tools 28.0.3

(You can change other sdk and build-tools)
## Usage
#### Gradle

''' 

dependencies {

    implementation 'androidx.appcompat:appcompat:1.2.0'
    implementation 'com.google.android.material:material:1.2.1'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
    implementation 'com.google.android.gms:play-services-maps:17.0.0'

    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
}

'''
